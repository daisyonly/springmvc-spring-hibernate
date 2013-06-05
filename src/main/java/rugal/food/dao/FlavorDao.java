/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao;

import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.Updater;
import rugal.common.page.Pagination;
import rugal.food.entity.Flavor;
import rugal.food.entity.Indent;

/**
 *
 * @author Rugal Bernstein
 */
public interface FlavorDao
{

    @Transactional(propagation = Propagation.REQUIRED)
    Flavor deleteById(Integer id);

    Flavor findById(Integer id);

    List<Flavor> findByName(String name);

    List<Flavor> findByVagueName(String name);

    Pagination getPage(int pageNo, int pageSize);

    @Transactional(propagation = Propagation.REQUIRED)
    Flavor save(Flavor bean);

    @Transactional(propagation = Propagation.REQUIRED)
    Flavor updateByUpdater(Updater<Flavor> updater);
}
