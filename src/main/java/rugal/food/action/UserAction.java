package rugal.food.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;
import rugal.core.entity.Authentication;

@Controller
public class UserAction extends ActionSupport
{

    private static final long serialVersionUID = -1417237614181805435L;

    private Authentication auth;

    public void setAuth(Authentication auth)
    {
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
        return SUCCESS;
    }
}
