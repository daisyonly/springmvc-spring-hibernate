/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao.impl;

import rugal.food.dao.UserFlavorListDao;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.HibernateBaseDao;
import rugal.common.page.Pagination;
import rugal.food.entity.UserFlavorList;
import rugal.food.entity.UserFlavorList;

/**
 *
 * @author Rugal Bernstein
 */
@Repository
public class UserFlavorListDaoImpl extends HibernateBaseDao<UserFlavorList, Integer> implements UserFlavorListDao
{

    @Override
    public Pagination getPage(int pageNo, int pageSize)
    {
        Criteria crit = createCriteria();
        Pagination page = findByCriteria(crit, pageNo, pageSize);
        return page;
    }

    @Override
    public UserFlavorList findById(Integer id)
    {
        UserFlavorList entity = get(id);
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserFlavorList save(UserFlavorList bean)
    {
        getSession().save(bean);
        return bean;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UserFlavorList deleteById(Integer id)
    {
        UserFlavorList entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<UserFlavorList> getEntityClass()
    {
        return UserFlavorList.class;
    }
}
