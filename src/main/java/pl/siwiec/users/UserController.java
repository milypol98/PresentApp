package pl.siwiec.users;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.siwiec.present.PresentRepository;
import pl.siwiec.seciurity.CurrentUser;
import pl.siwiec.seciurity.LoginController;
import pl.siwiec.seciurity.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;
    private final PresentRepository presentRepository;
    private final UserService userService;


    public UserController(UserRepository userRepository, PresentRepository presentRepository, UserService userService) {
        this.userRepository = userRepository;
        this.presentRepository = presentRepository;
        this.userService = userService;

    }
    @RequestMapping (method = RequestMethod.GET)
    public String home(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        User entityUser = customUser.getUser();
        model.addAttribute("present", presentRepository.presentUserlimit5(entityUser.getId()));
        return "userJsp/UserHomePage";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("user",new User());
        return "userJsp/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save( User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    //Nie usuwa tych co sa powiozane z artykułem



    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public String editUser(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        User entityUser = customUser.getUser();
        model.addAttribute("user", userRepository.findById(entityUser.getId()));
        return "userJsp/edit";
    }
    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public String updateUser(User user) {
        userRepository.save(user);
        return "redirect:/user/";
    }

    @RequestMapping(value = "/removeUser", method = RequestMethod.GET)
    public String removeUser(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        userRepository.deleteById(entityUser.getId());
        return "redirect:/";
    }
    @RequestMapping(value = "/editPassword", method = RequestMethod.GET)
    public String editPassword(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        User entityUser = customUser.getUser();
        model.addAttribute("pass", userRepository.findById(entityUser.getId()));
        return "userJsp/passwordUpdate";
    }
    @RequestMapping(value = "/editPassword", method = RequestMethod.POST)
    public String updatePassword(User user) {
        userRepository.save(user);
        return "redirect:/user/";
    }
}
