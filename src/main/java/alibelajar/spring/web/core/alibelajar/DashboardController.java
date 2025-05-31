package alibelajar.spring.web.core.alibelajar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("menuActive", "");
        return "admin/main";
    }

    @GetMapping("/manageroom")
    public String manageRoom(Model model) {
        model.addAttribute("menuActive", "manageroom");
        return "admin/data-room";
    }

    @GetMapping("/userdata")
    public String dataUser(Model model){
        model.addAttribute("menuActive", "userdata");
        return "admin/data-user";
    }

    @GetMapping("facilitydata")
    public String facilityData(Model model){
        model.addAttribute("menuActive", "facilitydata");
        return "admin/facility-data";
    }

    @GetMapping("listbooking")
    public String listBooking(Model model){
        model.addAttribute("menuActive", "listbooking");
        return "admin/list-booking";
    }
}
