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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rugal.food.dao.IndentDao;
import rugal.food.dao.MenuDao;
import rugal.food.dao.RestaurantDao;
import rugal.food.dao.UserDao;
import rugal.food.entity.Indent;

/**
 *
 * @author Administrator
 */
public class IndentDaoImplTest
{

    private static RestaurantDao restaurantDaoImpl;

    private static UserDao userDaoImpl;

    private static MenuDao menuDaoImpl;

    private static IndentDao indentDaoImpl;

    public IndentDaoImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        menuDaoImpl = (MenuDao) ctx.getBean("menuDaoImpl");
        indentDaoImpl = (IndentDao) ctx.getBean("indentDaoImpl");
        restaurantDaoImpl = (RestaurantDao) ctx.getBean("restaurantDaoImpl");
        userDaoImpl=(UserDao) ctx.getBean("userDaoImpl");
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
     * Test of getPage method, of class IndentDaoImpl.
     */
//    @Test
//    public void testGetPage()
//    {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 0;
//        IndentDaoImpl instance = new IndentDaoImpl();
//        Pagination expResult = null;
//        Pagination result = instance.getPage(pageNo, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class IndentDaoImpl.
//     */
//    @Test
//    public void testFindById()
//    {
//        System.out.println("findById");
//        Integer id = null;
//        IndentDaoImpl instance = new IndentDaoImpl();
//        Indent expResult = null;
//        Indent result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class IndentDaoImpl.
//     */
    @Test
    public void testSave()
    {
        System.out.println("save");
        Indent bean = new Indent();
        bean.setUid(userDaoImpl.findById("Orochi"));
//        IndentDaoImpl instance = new IndentDaoImpl();
//        Indent expResult = null;
        Indent result = indentDaoImpl.save(bean);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of deleteById method, of class IndentDaoImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        Integer id = null;
//        IndentDaoImpl instance = new IndentDaoImpl();
//        Indent expResult = null;
//        Indent result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEntityClass method, of class IndentDaoImpl.
//     */
//    @Test
//    public void testGetEntityClass()
//    {
//        System.out.println("getEntityClass");
//        IndentDaoImpl instance = new IndentDaoImpl();
//        Class expResult = null;
//        Class result = instance.getEntityClass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}