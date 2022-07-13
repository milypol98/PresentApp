package pl.siwiec.present;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.siwiec.seciurity.CurrentUser;
import pl.siwiec.users.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/present")
public class PresentController {

    private final PresentRepository presentationRepository;

    public PresentController(PresentRepository presentationRepository) {
        this.presentationRepository = presentationRepository;
    }
    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public String details(@RequestParam Long id,Model model) {
        List<Long> list = new ArrayList<>();
        list.add(id);
        model.addAttribute("presentDetails", presentationRepository.findAllById(list));
        return "presentJsp/detalis";
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@AuthenticationPrincipal CurrentUser customUser,Model model) {
        User entityUser = customUser.getUser();
        model.addAttribute("present",presentationRepository.presentUser(entityUser.getId()));
        return "presentJsp/list";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("present",new Present());
                return "presentJsp/add";
    }
//niewiem czy to nie troszke przedobrzone
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@AuthenticationPrincipal  CurrentUser customUser,@Valid Present present, BindingResult result) {
        if (result.hasErrors()){
            return "presentJsp/add";
        }
        User entityUser = customUser.getUser();
        present.setUser(entityUser);
        presentationRepository.save(present);
        return "redirect:/present/list";
    }

    //Nie usuwa tych co sa powiozane z artykułem
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam Long id) {
        presentationRepository.deleteById(id);
        return "redirect:/present/list";
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editCategory(@RequestParam Long id, Model model) {
        model.addAttribute("present", presentationRepository.findById(id));
        return "presentJsp/edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(@AuthenticationPrincipal  CurrentUser customUser,@Valid Present present , BindingResult result) {
        if (result.hasErrors()) {
            return "presentJsp/edit";
        }
        User entityUser = customUser.getUser();
        present.setUser(entityUser);
        presentationRepository.save(present);
        return "redirect:/present/list";
    }
}
