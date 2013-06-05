/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.food.service.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rugal.common.page.Pagination;
import rugal.core.entity.Authentication;
import rugal.core.service.AuthenticationService;
import rugal.food.dao.UserDao;
import rugal.food.entity.User;
import rugal.food.service.UserService;

/**
 *
 * @author Administrator
 */
public class UserServiceImplTest
{

    private static UserService userServiceImpl;

    public UserServiceImplTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        userServiceImpl = (UserService) ctx.getBean("userServiceImpl");
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
     * Test of setAuthenticationService method, of class UserServiceImpl.
     */
//    @Test
//    public void testSetAuthenticationService()
//    {
//        System.out.println("setAuthenticationService");
//        AuthenticationService authenticationService = null;
//        UserServiceImpl instance = new UserServiceImpl();
//        instance.setAuthenticationService(authenticationService);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUserDao method, of class UserServiceImpl.
//     */
//    @Test
//    public void testSetUserDao()
//    {
//        System.out.println("setUserDao");
//        UserDao userDao = null;
//        UserServiceImpl instance = new UserServiceImpl();
//        instance.setUserDao(userDao);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class UserServiceImpl.
//     */
//    @Test
//    public void testSave()
//    {
//        System.out.println("save");
//        User bean = null;
//        UserServiceImpl instance = new UserServiceImpl();
//        User expResult = null;
//        User result = instance.save(bean);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteById method, of class UserServiceImpl.
//     */
//    @Test
//    public void testDeleteById()
//    {
//        System.out.println("deleteById");
//        String id = "";
//        UserServiceImpl instance = new UserServiceImpl();
//        User expResult = null;
//        User result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class UserServiceImpl.
//     */
//    @Test
//    public void testFindById()
//    {
//        System.out.println("findById");
//        String id = "";
//        UserServiceImpl instance = new UserServiceImpl();
//        User expResult = null;
//        User result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPage method, of class UserServiceImpl.
//     */
//    @Test
//    public void testGetPage()
//    {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 0;
//        UserServiceImpl instance = new UserServiceImpl();
//        Pagination expResult = null;
//        Pagination result = instance.getPage(pageNo, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of logon method, of class UserServiceImpl.
//     */
    @Test
    public void testLogon()
    {
        System.out.println("logon");
        Authentication authentication = new Authentication("Rugal", "900811");
        User result = userServiceImpl.logon(authentication);
        System.out.println(result.getUid());
        userServiceImpl.logout(result);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of logout method, of class UserServiceImpl.
//     */
//    @Test
//    public void testLogout()
//    {
//        System.out.println("logout");
//        User bean = null;
////        UserServiceImpl instance = new UserServiceImpl();
//        userServiceImpl.logout(bean);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
}