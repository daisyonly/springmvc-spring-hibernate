/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao.impl;

import rugal.food.dao.FlavorDao;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.HibernateBaseDao;
import rugal.common.page.Pagination;
import rugal.food.dao.UserDao;
import rugal.food.entity.Flavor;
import rugal.food.entity.Flavor;

/**
 *
 * @author Rugal Bernstein
 */
@Repository
public class FlavorDaoImpl extends HibernateBaseDao<Flavor, Integer> implements FlavorDao
{

    @Override
    public Pagination getPage(int pageNo, int pageSize)
    {
        Criteria crit = createCriteria();
        Pagination page = findByCriteria(crit, pageNo, pageSize);
        return page;
    }

    @Override
    public List<Flavor> findByName(String name)
    {
        return super.findByProperty("name", name);
    }

    @Override
    public List<Flavor> findByVagueName(String name)
    {
        return super.findByPropertyVague("name", name);
    }

    @Override
    public Flavor findById(Integer id)
    {
        Flavor entity = get(id);
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Flavor save(Flavor bean)
    {
        getSession().save(bean);
        return bean;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Flavor deleteById(Integer id)
    {
        Flavor entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<Flavor> getEntityClass()
    {
        return Flavor.class;
    }
}
