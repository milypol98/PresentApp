package pl.siwiec.admin;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.siwiec.users.User;

@Controller
public class LoginController {
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login() {
        return "admin/login";
    }

//    @GetMapping("/admin")
//    @ResponseBody
    public long userInfo(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return entityUser.getId();
    }

}
