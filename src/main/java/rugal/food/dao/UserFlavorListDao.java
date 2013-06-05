/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.Updater;
import rugal.common.page.Pagination;
import rugal.food.entity.UserFlavorList;

/**
 *
 * @author Rugal Bernstein
 */
public interface UserFlavorListDao
{

    @Transactional(propagation = Propagation.REQUIRED)
    UserFlavorList deleteById(Integer id);

    UserFlavorList findById(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    @Transactional(propagation = Propagation.REQUIRED)
    UserFlavorList save(UserFlavorList bean);

    @Transactional(propagation = Propagation.REQUIRED)
    UserFlavorList updateByUpdater(Updater<UserFlavorList> updater);
}
