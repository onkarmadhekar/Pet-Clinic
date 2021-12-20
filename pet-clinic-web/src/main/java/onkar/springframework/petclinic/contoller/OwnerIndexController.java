package onkar.springframework.petclinic.contoller;

import onkar.springframework.petclinic.services.OwnerServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerIndexController {

    private final OwnerServices ownerServices;

    public OwnerIndexController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwner(Model model){
        model.addAttribute("owners",ownerServices.findAll());
        return  "owners/index";
    }
}
