package fi.academy.sanontaharkka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Kontrolleri {

    @Autowired
    SanontaLista lista1;

    @GetMapping ("/ekasivu")
    public String sanonnatSivulle (Model model) {
        model.addAttribute("lisaysOlio",new Sanonta());
        Sanonta sanonta1 = new Sanonta("Elämä on laiffii", "Matti Nykänen");
        Sanonta sanonta2 = new Sanonta("Pata kattilaa soimaa", "Tuntematon");
        lista1.lisaaListalle(sanonta1);
        lista1.lisaaListalle(sanonta2);
        model.addAttribute("thViite", lista1);
        return "etusivu";
    }

//    @RequestMapping("/etusivu")
//    public String lomake(Model model){
//
//        model.addAttribute("lisaysOlio",new Sanonta());
//        return "etusivu";
//    }

    @PostMapping("/tokasivu")
    public String lomakekasittelija(Sanonta sanonta, Model model) {
        lista1.lisaaListalle(sanonta);
        model.addAttribute("thViite", lista1);
        model.addAttribute("lisaysOlio",new Sanonta());

        return "etusivu";
    }

    @PostMapping ("/poisto")
    public String poistaja (int numero, Model model) {
        lista1.poistaListalta(numero);
        model.addAttribute("thViite", lista1);
        model.addAttribute("lisaysOlio",new Sanonta());
        return "etusivu";
    }


}
