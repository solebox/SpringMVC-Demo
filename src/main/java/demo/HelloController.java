package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/blah")
    public String blah(Model model) {
        model.addAttribute("name", "alon");
        return "greeting";
    }
}
