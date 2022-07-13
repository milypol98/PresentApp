package pl.siwiec.event;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.siwiec.present.Present;
import pl.siwiec.present.PresentRepository;
import pl.siwiec.seciurity.CurrentUser;
import pl.siwiec.users.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {
    private final EventRepository eventRepository;
    private final PresentRepository presentRepository;

    public EventController(EventRepository eventRepository, PresentRepository presentRepository) {
        this.eventRepository = eventRepository;
        this.presentRepository = presentRepository;
    }



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@AuthenticationPrincipal CurrentUser customUser, Model model) {
        User entityUser = customUser.getUser();
        model.addAttribute("event",eventRepository.eventUser(entityUser.getId()));
        return "eventJsp/list";
    }
    //Mocno przekombinowane trzeba poprawice
    @RequestMapping(value = "/listDetalis", method = RequestMethod.GET)
    public String listDetalist(@RequestParam Long id, Model model) {
        List<Long> list = new ArrayList<>();
        list.add(id);
        model.addAttribute("eventDetalist",eventRepository.findAllById(list));
        model.addAttribute("userPresent",presentRepository.findAllById(eventRepository.presentEvent(id)));
        return "eventJsp/detalis";
    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String list(Model model) {
//        model.addAttribute("event",eventRepository.findAll());
//        return "eventJsp/list";
//    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("event",new Event());
        return "eventJsp/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(@AuthenticationPrincipal  CurrentUser customUser, @Valid Event event, BindingResult result) {
        if(result.hasErrors()){
            return "eventJsp/add";
        }
        User entityUser = customUser.getUser();
        event.setUser(entityUser);
        eventRepository.save(event);
        return "redirect:/event/list";
    }

    //Usuwa w jedna strone dobrze a w druga wszystko wypierdala
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam Long id) {
        eventRepository.deleteById(id);
        return "redirect:/event/list";
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editCategory(@RequestParam Long id, Model model) {
        model.addAttribute("event", eventRepository.findById(id));
        return "eventJsp/edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(@AuthenticationPrincipal  CurrentUser customUser,@Valid Event event ,  BindingResult result) {
        if (result.hasErrors()){
            return "eventJsp/edit";
        }
        User entityUser = customUser.getUser();
        event.setUser(entityUser);
        eventRepository.save(event);
        return "redirect:/event/list";
    }
    @ModelAttribute("userPresent")
    public List<Present> userPresent(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return presentRepository.presentUser(entityUser.getId());
    }


}
