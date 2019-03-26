package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(@RequestParam(name = "name", required = false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/blah")
    public String blah(Model model) {
        model.addAttribute("name", "alon");
        return "greeting";
    }

    @RequestMapping(value="/hello/{username}", method= RequestMethod.GET)
    public String hello(@PathVariable String username, Model model) {
        model.addAttribute("name", username);
        return "greeting";
    }
}
