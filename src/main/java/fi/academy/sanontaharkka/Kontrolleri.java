package fi.academy.sanontaharkka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Kontrolleri {
    @GetMapping ("/etusivu")
    public String sanonnatSivulle (Model model) {
        Sanonta sanonta1 = new Sanonta("Elämä on laiffii", "Matti Nykänen");
        model.addAttribute("thViite", sanonta1);
        return "etusivu";
    }

    @RequestMapping("/lisaa")
    public String lomake(Model model){

        model.addAttribute("lisaysOlio",new Sanonta());
        return "lisaa";
    }


}
