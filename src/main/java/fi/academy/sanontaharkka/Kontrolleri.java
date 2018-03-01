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
        SanontaLista lista1 = new SanontaLista();
        lista1.lisaaListalle(sanonta1);
        model.addAttribute("thViite", lista1);
        return "etusivu";
    }

    @RequestMapping("/lisaa")
    public String lomake(Model model){

        model.addAttribute("lisaysOlio",new Sanonta());
        return "lisaa";
    }


}
