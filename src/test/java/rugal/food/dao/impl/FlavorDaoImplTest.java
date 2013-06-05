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
import rugal.food.dao.FlavorDao;
import rugal.food.entity.Flavor;

/**
 *
 * @author Administrator
 */
public class FlavorDaoImplTest
{

    private static FlavorDao flavorDaoImpl;

    public FlavorDaoImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        flavorDaoImpl = (FlavorDao) ctx.getBean("flavorDaoImpl");
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
     * Test of getPage method, of class FlavorDaoImpl.
     */
//    @Test
//    public void testGetPage()
//    {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 0;
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        Pagination expResult = null;
//        Pagination result = instance.getPage(pageNo, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByName method, of class FlavorDaoImpl.
//     */
//    @Test
//    public void testFindByName()
//    {
//        System.out.println("findByName");
//        String name = "";
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        List expResult = null;
//        List result = instance.findByName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findByVagueName method, of class FlavorDaoImpl.
//     */
//    @Test
//    public void testFindByVagueName()
//    {
//        System.out.println("findByVagueName");
//        String name = "";
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        List expResult = null;
//        List result = instance.findByVagueName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class FlavorDaoImpl.
//     */
//    @Test
//    public void testFindById()
//    {
//        System.out.println("findById");
//        Integer id = null;
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        Flavor expResult = null;
//        Flavor result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class FlavorDaoImpl.
//     */
    @Test
    public void testSave()
    {
        System.out.println("save");
        Flavor bean = new Flavor();
        bean.setDepict("very bitter");
        bean.setName("bitterness");
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        Flavor expResult = null;
        Flavor result = flavorDaoImpl.save(bean);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of deleteById method, of class FlavorDaoImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        Integer id = null;
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        Flavor expResult = null;
//        Flavor result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEntityClass method, of class FlavorDaoImpl.
//     */
//    @Test
//    public void testGetEntityClass()
//    {
//        System.out.println("getEntityClass");
//        FlavorDaoImpl instance = new FlavorDaoImpl();
//        Class expResult = null;
//        Class result = instance.getEntityClass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}