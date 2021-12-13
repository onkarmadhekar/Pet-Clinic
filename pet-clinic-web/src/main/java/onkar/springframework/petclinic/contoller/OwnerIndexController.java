package onkar.springframework.petclinic.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerIndexController {
    @RequestMapping({"/owner/index.html","/owner/index/"})
    public String listOwner(){
        return  "owners/index";
    }
}
