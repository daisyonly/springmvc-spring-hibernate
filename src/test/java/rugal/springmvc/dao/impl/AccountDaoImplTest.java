/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rugal.springmvc.dao.AccountDao;
import rugal.springmvc.entity.Account;

/**
 *
 * @author rugal
 */
public class AccountDaoImplTest {
    
    private static AccountDao  accountDaoImpl;
    public AccountDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        accountDaoImpl=(AccountDao) ctx.getBean("accountDaoImpl");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPage method, of class AccountDaoImpl.
     */
//    @Test
//    public void testGetPage() {
//        System.out.println("getPage");
//        int pageNo = 0;
//        int pageSize = 0;
//        AccountDaoImpl instance = new AccountDaoImpl();
//        Pagination expResult = null;
//        Pagination result = instance.getPage(pageNo, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of findById method, of class AccountDaoImpl.
     */
//    @Test
//    public void testFindById() {
//        System.out.println("findById");
//        Integer id = null;
//        AccountDaoImpl instance = new AccountDaoImpl();
//        Account expResult = null;
//        Account result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of save method, of class AccountDaoImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Account bean = new Account();
        bean.setName("Tenjin");
        bean.setPassword("Descend");
        accountDaoImpl.save(bean);
        System.out.println("SUCCESS");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteById method, of class AccountDaoImpl.
     */
//    @Test
//    public void testDeleteById() {
//        System.out.println("deleteById");
//        Integer id = null;
//        AccountDaoImpl instance = new AccountDaoImpl();
//        Account expResult = null;
//        Account result = instance.deleteById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getEntityClass method, of class AccountDaoImpl.
     */
//    @Test
//    public void testGetEntityClass() {
//        System.out.println("getEntityClass");
//        AccountDaoImpl instance = new AccountDaoImpl();
//        Class expResult = null;
//        Class result = instance.getEntityClass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
}
