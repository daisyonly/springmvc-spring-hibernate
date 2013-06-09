/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rugal.core.service.impl;

import rugal.core.service.AuthenticationService;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Service;
import rugal.common.util.HttpSender;
import rugal.core.entity.Authentication;
import rugal.core.entity.UserCenter;
import rugal.food.entity.User;

/**
 *
 * @author Rugal Bernstein
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService
{
    
    private static final Logger LOG = Logger.getLogger(AuthenticationServiceImpl.class.getName());
    
    private final String URL = "http://user.zjut.com/api.php?app=member&action=login&username=:username&password=:password";
    
    private String generateURL(Authentication authentication)
    {
        String requestURL = URL.toString();
        requestURL = requestURL.replaceAll(":username", authentication.getId());
        requestURL = requestURL.replaceAll(":password", authentication.getPassword());
        return requestURL;
    }
    
    @Override
    public User authenticate(Authentication authentication)
    {
        String requestURL = generateURL(authentication);
        LOG.info(requestURL);
        HttpSender sender = new HttpSender(requestURL);
        UserCenter uc = sender.execute();
        LOG.info("User Center authentication state: "+uc.getState());
        if (uc.getState().equals("success")) {
            return uc.encapsulate();
        }
        return null;
    }
}
