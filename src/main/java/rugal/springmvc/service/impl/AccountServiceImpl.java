/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rugal.common.hibernate.Updater;
import rugal.common.page.Pagination;
import rugal.springmvc.dao.AccountDao;
import rugal.springmvc.entity.Account;

/**
 *
 * @author rugal
 */
@Service
public class AccountServiceImpl {

    @Autowired
    private AccountDao accountDaoImpl;

    public void setAccountDaoImpl(AccountDao accountDaoImpl) {
        this.accountDaoImpl = accountDaoImpl;
    }

    public Pagination getPage(int pageNo, int pageSize) {
        return accountDaoImpl.getPage(pageNo, pageSize);
    }

    public Account findById(Integer id) {
        return accountDaoImpl.findById(id);
    }

    public Account save(Account bean) {
        return accountDaoImpl.save(bean);
    }

    public Account deleteById(Integer id) {
        return accountDaoImpl.deleteById(id);
    }

    public Account update(Updater<Account> updater) {
        return accountDaoImpl.updateByUpdater(updater);
    }
}
