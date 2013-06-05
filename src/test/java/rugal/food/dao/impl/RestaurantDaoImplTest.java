/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao.impl;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rugal.common.page.Pagination;
import rugal.food.dao.RestaurantDao;
import rugal.food.entity.Restaurant;

/**
 *
 * @author Administrator
 */
public class RestaurantDaoImplTest
{

    private static RestaurantDao restaurantDaoImpl;

    public RestaurantDaoImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        restaurantDaoImpl = (RestaurantDao) ctx.getBean("restaurantDaoImpl");
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getPage method, of class RestaurantDaoImpl.
     */
    @Test
    public void testGetPage()
    {
        System.out.println("getPage");
        int pageNo = 0;
        int pageSize = 0;
//        RestaurantDaoImpl instance = new RestaurantDaoImpl();
//        Pagination expResult = null;
        Pagination result = restaurantDaoImpl.getPage(pageNo, pageSize);
        List<Restaurant> l=(List<Restaurant>) result.getList();
        for (Restaurant restaurant : l) {
            System.out.println(restaurant.getRid());
        }
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of findByName method, of class RestaurantDaoImpl.
//     */
//    @Test
//    public void testFindByName()
//    {
//        System.out.println("findByName");
//        String name = "Rugal";
////        RestaurantDaoImpl instance = new RestaurantDaoImpl();
////        List expResult = null;
//        List<Restaurant> result = restaurantDaoImpl.findByVagueName(name);
//        for (Restaurant restaurant : result) {
//            System.out.println(restaurant.getPhone());
//        }
////        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByVagueName method, of class RestaurantDaoImpl.
//     */
//    @Test
//    public void testFindByVagueName()
//    {
//        System.out.println("findByVagueName");
//        String name = "";
//        RestaurantDaoImpl instance = new RestaurantDaoImpl();
//        List expResult = null;
//        List result = instance.findByVagueName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class RestaurantDaoImpl.
//     */
//    @Test
//    public void testFindById()
//    {
//        System.out.println("findById");
//        Integer id = null;
//        RestaurantDaoImpl instance = new RestaurantDaoImpl();
//        Restaurant expResult = null;
//        Restaurant result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class RestaurantDaoImpl.
//     */
    @Test
    public void testSave()
    {
        System.out.println("save");
        Restaurant bean = new Restaurant();
        bean.setAddress("Orochi");
        bean.setName("Rugal cook");
        bean.setPhone("15068822536");
        bean.setTelephone("2678885");
//        RestaurantDaoImpl instance = new RestaurantDaoImpl();
//        Restaurant expResult = null;
        Restaurant result = restaurantDaoImpl.save(bean);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of deleteById method, of class RestaurantDaoImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        Integer id = null;
//        RestaurantDaoImpl instance = new RestaurantDaoImpl();
//        Restaurant expResult = null;
//        Restaurant result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEntityClass method, of class RestaurantDaoImpl.
//     */
//    @Test
//    public void testGetEntityClass()
//    {
//        System.out.println("getEntityClass");
//        RestaurantDaoImpl instance = new RestaurantDaoImpl();
//        Class expResult = null;
//        Class result = instance.getEntityClass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}