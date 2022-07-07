package pl.siwiec.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.siwiec.present.PresentRepository;
import pl.siwiec.seciurity.UserService;
import pl.siwiec.users.User;
import pl.siwiec.users.UserRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final UserRepository userRepository;
    private final PresentRepository presentRepository;
    private final UserService userService;


    public AdminController(UserRepository userRepository, PresentRepository presentRepository, UserService userService) {
        this.userRepository = userRepository;
        this.presentRepository = presentRepository;
        this.userService = userService;
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("user",userRepository.findAll());
        return "userJsp/list";
    }
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam Long id) {
        userRepository.deleteById(id);
        return "redirect:/admin/list";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(@RequestParam Long id, Model model) {
        model.addAttribute("user", userRepository.findById(id));
        return "userJsp/edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(User user) {
        userRepository.save(user);
        return "redirect:/admin/list";
    }

}
