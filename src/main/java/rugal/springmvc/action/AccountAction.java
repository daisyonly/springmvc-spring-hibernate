/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import rugal.springmvc.dao.AccountDao;
import rugal.springmvc.entity.Account;

/**
 *
 * @author rugal
 */
@Controller
@RequestMapping("controller")
public class AccountAction {

    @Resource
    private AccountDao usersDaoImpl;

    public AccountDao getUsersDaoImpl() {
        return usersDaoImpl;
    }

    public void setUsersDaoImpl(AccountDao usersDaoImpl) {
        this.usersDaoImpl = usersDaoImpl;
    }

    @RequestMapping(value = "/addUser.action", method = RequestMethod.GET)
    public void addUsers(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Account u = new Account();
        u.setName(username);
        u.setPassword(password);
        usersDaoImpl.save(u);

    }
}
