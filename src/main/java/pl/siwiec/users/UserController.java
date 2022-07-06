package pl.siwiec.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.siwiec.admin.UserService;
import pl.siwiec.present.PresentRepository;

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
    public String home(Model model) {
        model.addAttribute("user" , presentRepository.lastFive());
        return "userJsp/UserHomePage";

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("user",userRepository.findAll());
        return "userJsp/list";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("user",new User());
        return "userJsp/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(User user  ) {
        userService.saveUser(user);
        return "redirect:/user/list";
    }

    //Nie usuwa tych co sa powiozane z artykułem
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam Long id) {
        userRepository.deleteById(id);
        return "redirect:/user/list";
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editCategory(@RequestParam Long id, Model model) {
        model.addAttribute("user", userRepository.findById(id));
        return "userJsp/edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(User user) {
        userRepository.save(user);
        return "redirect:/user/list";
    }
}
