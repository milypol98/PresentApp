package pl.siwiec.users;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.siwiec.present.PresentRepository;
import pl.siwiec.role.Role;
import pl.siwiec.role.RoleRepository;
import pl.siwiec.seciurity.CurrentUser;
import pl.siwiec.seciurity.UserService;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashSet;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;
    private final PresentRepository presentRepository;
    private final UserService userService;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;



    public UserController(UserRepository userRepository, PresentRepository presentRepository, UserService userService, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.presentRepository = presentRepository;
        this.userService = userService;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
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
    public String save(@Valid  User user, BindingResult result) {
        if (result.hasErrors()) {
            return "userJsp/add";
        }
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
    public String updateUser(@Valid  User user , BindingResult result) {
        if (result.hasErrors()) {
            return "userJsp/edit";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Role userRole = roleRepository.findByName("ROLE_USER");
        user.setRoles(new HashSet<>(Arrays.asList(userRole)));
        userRepository.save(user);
        return "redirect:/user/";
    }

    @RequestMapping(value = "/removeUser", method = RequestMethod.GET)
    public String removeUser(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        userRepository.deleteById(entityUser.getId());
        return "redirect:/";
    }

}
