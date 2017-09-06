package teymi15.assignment1.control;
/**
* The program allows user the to write in their name in the input 
* and it will displayed their name with the greeting "Good Morning" + their name
* @author  Nu Phan Quynh Do
* @version 1.0
* @since   2017-09-5 
*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
* The class controls the main page to tells which route it should be rending
* and what information it should be displayed
*/
@Controller
public class mainpageController {
    
    /**
    * The function tells the initial page to be displayed at route predefined
    * in the configuration application.properties
    * @return String
    */  
    @RequestMapping("/")
    public String initialPage(Model model) {
        model.addAttribute("name", " ");
        return "mainpage";
    }
    
    /**
    * The function tells the same route should be rendered when the user confirm 
    * the input. Furthermore, when getting the input from the user the page should
    * be displaying the information back to the page.
    * @return String
    */
    @RequestMapping(value="/", method = RequestMethod.POST)
    public String changeDisplayedName(@RequestParam(value = "name", required = false) String name, ModelMap modelMapel) {
        modelMapel.addAttribute("name", name);
        return "mainpage";
    }
}
