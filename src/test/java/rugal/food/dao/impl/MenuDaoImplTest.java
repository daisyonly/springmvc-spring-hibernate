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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rugal.common.page.Pagination;
import rugal.food.dao.MenuDao;
import rugal.food.dao.RestaurantDao;
import rugal.food.entity.Menu;

/**
 *
 * @author Administrator
 */
public class MenuDaoImplTest
{

    private static RestaurantDao restaurantDaoImpl;

    private static MenuDao menuDaoImpl;

    public MenuDaoImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        menuDaoImpl = (MenuDao) ctx.getBean("menuDaoImpl");
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
     * Test of getPage method, of class MenuDaoImpl.
     */
//    @Test
//    public void testGetPage()
//    {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 5;
//        Pagination result = menuDaoImpl.getPage(pageNo, pageSize);
//        List<Menu> l=(List<Menu>) result.getList();
//        for (Menu menu : l) {
//            System.out.println(menu.getName());
//            
//        }
////        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByName method, of class MenuDaoImpl.
//     */
//    @Test
//    public void testFindByName()
//    {
//        System.out.println("findByName");
//        String name = "";
//        MenuDaoImpl instance = new MenuDaoImpl();
//        List expResult = null;
//        List result = instance.findByName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByVagueName method, of class MenuDaoImpl.
//     */
//    @Test
//    public void testFindByVagueName()
//    {
//        System.out.println("findByVagueName");
//        String name = "";
//        MenuDaoImpl instance = new MenuDaoImpl();
//        List expResult = null;
//        List result = instance.findByVagueName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class MenuDaoImpl.
//     */
//    @Test
//    public void testFindById()
//    {
//        System.out.println("findById");
//        Integer id = null;
//        MenuDaoImpl instance = new MenuDaoImpl();
//        Menu expResult = null;
//        Menu result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class MenuDaoImpl.
//     */
    @Test
    public void testSave()
    {
        System.out.println("save");
        Menu bean = new Menu();
        bean.setDepict("bad");
        bean.setName("c");
        bean.setPicture("c.jpg");
        bean.setPrice(50);
        bean.setRid(restaurantDaoImpl.findById(1));
//        MenuDaoImpl instance = new MenuDaoImpl();
//        Menu expResult = null;
        Menu result = menuDaoImpl.save(bean);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of deleteById method, of class MenuDaoImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        Integer id = null;
//        MenuDaoImpl instance = new MenuDaoImpl();
//        Menu expResult = null;
//        Menu result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEntityClass method, of class MenuDaoImpl.
//     */
//    @Test
//    public void testGetEntityClass()
//    {
//        System.out.println("getEntityClass");
//        MenuDaoImpl instance = new MenuDaoImpl();
//        Class expResult = null;
//        Class result = instance.getEntityClass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}