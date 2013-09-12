/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.service;

import rugal.common.hibernate.Updater;
import rugal.common.page.Pagination;
import rugal.springmvc.entity.Account;

/**
 *
 * @author rugal
 */
public interface AccountService {

    Account deleteById(Integer id);

    Account findById(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    Account save(Account bean);

    Account update(Updater<Account> updater);
}
