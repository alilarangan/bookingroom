package alibelajar.spring.web.core.alibelajar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String index(Model model){
        model.addAttribute("menuActive", "user");
        return "user/main";
    }
    @GetMapping("/activity")
    public String activity(Model model){
        model.addAttribute("menuActive", "activity");
        return "user/activity";
    }
    @GetMapping("/booking")
    public String booking(Model model){
        model.addAttribute("menuActive", "booking");
        return "user/booking";
    }
    @GetMapping("/changepassword")
    public String changePassword(Model model){
        model.addAttribute("menuActive", "changepassword");
        return "user/change-password";
    }
}
