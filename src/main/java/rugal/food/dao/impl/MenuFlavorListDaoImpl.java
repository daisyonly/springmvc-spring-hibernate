/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao.impl;

import rugal.food.dao.MenuFlavorListDao;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.HibernateBaseDao;
import rugal.common.page.Pagination;
import rugal.food.entity.Flavor;
import rugal.food.entity.MenuFlavorList;
import rugal.food.entity.MenuFlavorList;

/**
 *
 * @author Rugal Bernstein
 */
@Repository
public class MenuFlavorListDaoImpl extends HibernateBaseDao<MenuFlavorList, Integer> implements MenuFlavorListDao
{

    @Override
    public Pagination getPage(int pageNo, int pageSize)
    {
        Criteria crit = createCriteria();
        Pagination page = findByCriteria(crit, pageNo, pageSize);
        return page;
    }

    @Override
    public MenuFlavorList findById(Integer id)
    {
        MenuFlavorList entity = get(id);
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MenuFlavorList save(MenuFlavorList bean)
    {
        getSession().save(bean);
        return bean;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public MenuFlavorList deleteById(Integer id)
    {
        MenuFlavorList entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<MenuFlavorList> getEntityClass()
    {
        return MenuFlavorList.class;
    }
}
