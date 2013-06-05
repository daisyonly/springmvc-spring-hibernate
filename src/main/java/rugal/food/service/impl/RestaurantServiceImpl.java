/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import rugal.common.hibernate.Updater;
import rugal.common.page.Pagination;
import rugal.food.dao.RestaurantDao;
import rugal.food.entity.Restaurant;

/**
 *
 * @author Rugal Bernstein
 */
public class RestaurantServiceImpl
{

    @Autowired
    private RestaurantDao restaurantDao;

    public void setRestaurantDao(RestaurantDao restaurantDao)
    {
        this.restaurantDao = restaurantDao;
    }

    public Restaurant deleteById(Integer id)
    {
        return restaurantDao.deleteById(id);
    }

    public Restaurant findById(Integer id)
    {
        return restaurantDao.findById(id);
    }

    public List<Restaurant> findByName(String name)
    {
        return restaurantDao.findByName(name);
    }

    public List<Restaurant> findByVagueName(String name)
    {
        return restaurantDao.findByVagueName(name);
    }

    public Pagination getPage(int pageNo, int pageSize)
    {
        return restaurantDao.getPage(pageNo, pageSize);
    }

    public Restaurant save(Restaurant bean)
    {
        return restaurantDao.save(bean);
    }
}
