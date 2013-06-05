/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rugal.common.page.Pagination;
import rugal.food.dao.IndentDao;
import rugal.food.dao.MenuDao;
import rugal.food.dao.OrderLogDao;
import rugal.food.dao.RestaurantDao;
import rugal.food.entity.Menu;
import rugal.food.entity.OrderLog;

/**
 *
 * @author Administrator
 */
public class OrderLogDaoImplTest
{

    private static OrderLogDao orderLogDaoImpl;

    private static IndentDao indentDaoImpl;

    private static MenuDao menuDaoImpl;

    private static RestaurantDao restaurantDaoImpl;

    public OrderLogDaoImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        orderLogDaoImpl = (OrderLogDao) ctx.getBean("orderLogDaoImpl");
        menuDaoImpl = (MenuDao) ctx.getBean("menuDaoImpl");
        indentDaoImpl = (IndentDao) ctx.getBean("indentDaoImpl");
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
     * Test of getPage method, of class OrderLogDaoImpl.
     */
//    @Test
//    public void testGetPage()
//    {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 0;
//        OrderLogDaoImpl instance = new OrderLogDaoImpl();
//        Pagination expResult = null;
//        Pagination result = instance.getPage(pageNo, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class OrderLogDaoImpl.
//     */
    @Test
    public void testFindById()
    {
        System.out.println("findById");
        Integer id = 1;
//        OrderLogDaoImpl instance = new OrderLogDaoImpl();
//        OrderLog expResult = null;
        OrderLog result = orderLogDaoImpl.findById(id);
        System.out.println(result.getMid().getRid().getName());
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of save method, of class OrderLogDaoImpl.
//     */
//    @Test
//    public void testSave()
//    {
//        System.out.println("save");
//        OrderLog bean = new OrderLog();
////        bean.setDuration(duration);
//        bean.setIid(indentDaoImpl.findById(2));
//        Menu m = menuDaoImpl.findById(2);
//        bean.setMid(m);
//        bean.setRid(m.getRid());
//        bean.setSpeed(4);
//        bean.setQuality(5);
////        OrderLogDaoImpl instance = new OrderLogDaoImpl();
////        OrderLog expResult = null;
//        OrderLog result = orderLogDaoImpl.save(bean);
////        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteById method, of class OrderLogDaoImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        Integer id = null;
//        OrderLogDaoImpl instance = new OrderLogDaoImpl();
//        OrderLog expResult = null;
//        OrderLog result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEntityClass method, of class OrderLogDaoImpl.
//     */
//    @Test
//    public void testGetEntityClass()
//    {
//        System.out.println("getEntityClass");
//        OrderLogDaoImpl instance = new OrderLogDaoImpl();
//        Class expResult = null;
//        Class result = instance.getEntityClass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}