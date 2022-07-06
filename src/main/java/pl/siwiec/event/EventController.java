package pl.siwiec.event;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.siwiec.present.Present;

@Controller
@RequestMapping("/event")
public class EventController {
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("event",eventRepository.findAll());
        return "eventJsp/list";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("event",new Event());
        return "eventJsp/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String save(Event event  ) {
        eventRepository.save(event);
        return "redirect:/event/list";
    }

    //Nie usuwa tych co sa powiozane z artykułem
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
    public String update(Event event) {
        eventRepository.save(event);
        return "redirect:/event/list";
    }
}
