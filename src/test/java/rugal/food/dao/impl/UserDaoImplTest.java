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
import rugal.food.dao.UserDao;
import rugal.food.entity.User;

/**
 *
 * @author Administrator
 */
public class UserDaoImplTest
{

    private static UserDao userDaoImpl;

    public UserDaoImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDaoImpl = (UserDao) ctx.getBean("userDaoImpl");
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

//    /**
//     * Test of getPage method, of class UserDaoImpl.
//     */
//    @Test
//    public void testGetPage()
//    {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 2;
////        Pagination expResult = null;
//        Pagination result = userDaoImpl.getPage(pageNo, pageSize);
//        List<User> l = (List<User>) result.getList();
//        for (User user : l) {
//            System.out.println(user.getUid());
//        }
//        assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class UserDaoImpl.
//     */
//    @Test
//    public void testFindById()
//    {
//        System.out.println("findById");
//        String id = "";
//        UserDaoImpl instance = new UserDaoImpl();
//        User expResult = null;
//        User result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class UserDaoImpl.
//     */
    @Test
    public void testSave()
    {
        System.out.println("save");
        User bean = new User();
        bean.setUid("Rugal");
//        UserDaoImpl instance = new UserDaoImpl();
//        User expResult = null;
        User result = userDaoImpl.save(bean);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of deleteById method, of class UserDaoImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        String id = "";
//        UserDaoImpl instance = new UserDaoImpl();
//        User expResult = null;
//        User result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}