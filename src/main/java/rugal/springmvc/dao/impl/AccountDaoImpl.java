/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.HibernateBaseDao;
import rugal.common.page.Pagination;
import rugal.springmvc.dao.AccountDao;
import rugal.springmvc.entity.Account;

/**
 *
 * @author Administrator
 */
@Repository
public class AccountDaoImpl extends HibernateBaseDao<Account, Integer> implements AccountDao {

    @Override
    public Pagination getPage(int pageNo, int pageSize) {
        Criteria crit = createCriteria();
        Pagination page = findByCriteria(crit, pageNo, pageSize);
        return page;
    }

    @Override
    public Account findById(Integer id) {
        Account entity = get(id);
        return entity;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Account save(Account bean) {
        getSession().save(bean);
        return bean;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Account deleteById(Integer id) {
        Account entity = super.get(id);
        if (entity != null) {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<Account> getEntityClass() {
        return Account.class;
    }
}
