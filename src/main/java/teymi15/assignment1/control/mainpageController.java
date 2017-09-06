package teymi15.assignment1.control;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainpageController {

    @RequestMapping
    public String initialPage(Model model) {
        model.addAttribute("name", " ");
        return "mainpage";
    }
    @RequestMapping(value="/", method = RequestMethod.POST)
    public String changeDisplayedName(@RequestParam(value = "name", required = false) String name, ModelMap modelMapel) {
        modelMapel.addAttribute("name", name);
        return "mainpage";
    }
}
