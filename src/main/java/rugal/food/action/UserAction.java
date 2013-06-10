package rugal.food.action;

import org.springframework.stereotype.Controller;
import rugal.core.entity.Authentication;

@Controller
public class UserAction
{
    private String id;
    private String password;

    private Authentication auth;

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param auth the auth to set
     */
    public void setAuth(Authentication auth) {
        this.auth = auth;
    }

    /**
     * 登录
     *
     * @return
     */
    public String login()
    {
        System.out.println("name->" + auth.getId());
        System.out.println("password->" + auth.getPassword());
        return "success";
    }
}
