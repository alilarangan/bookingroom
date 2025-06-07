package alibelajar.spring.web.core.alibelajar;

import alibelajar.spring.web.core.alibelajar.model.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

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
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8085/user";

        ResponseEntity<ApiResponse> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ApiResponse>() {}
        );

        List<User> users = response.getBody().getData().getContent();

        model.addAttribute("userdata", users);
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
