/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.springmvc.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import rugal.springmvc.entity.Account;
import rugal.springmvc.service.AccountService;

/**
 *
 * @author rugal
 */
@Controller
//@RequestMapping("controller")
public class AccountAction {

    private static final Logger LOG = Logger.getLogger(AccountAction.class.getName());
    @Resource
    private AccountService usersServiceImpl;

    public void setUsersServiceImpl(AccountService usersServiceImpl) {
        this.usersServiceImpl = usersServiceImpl;
    }

    @RequestMapping("/addUser.do")
    public void addUsers(@RequestParam(value = "username") String username, String password, HttpServletRequest request) {
        Account u = new Account();
        LOG.debug("HERE");
        u.setName(username);
        u.setPassword(password);
        usersServiceImpl.save(u);
    }
}
