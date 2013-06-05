/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.page.Pagination;
import rugal.food.entity.MenuFlavorList;

/**
 *
 * @author Rugal Bernstein
 */
public interface MenuFlavorListDao
{

    @Transactional(propagation = Propagation.REQUIRED)
    MenuFlavorList deleteById(Integer id);

    MenuFlavorList findById(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    @Transactional(propagation = Propagation.REQUIRED)
    MenuFlavorList save(MenuFlavorList bean);
    
}
