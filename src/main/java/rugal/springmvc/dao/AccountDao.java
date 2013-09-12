/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.Updater;
import rugal.common.page.Pagination;
import rugal.springmvc.entity.Account;

/**
 *
 * @author Administrator
 */
public interface AccountDao
{

    @Transactional(propagation = Propagation.REQUIRED)
    Account deleteById(Integer id);

    Account findById(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    @Transactional(propagation = Propagation.REQUIRED)
    Account save(Account bean);

    @Transactional(propagation = Propagation.REQUIRED)
    Account updateByUpdater(Updater<Account> updater);
}
