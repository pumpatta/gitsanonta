package fi.academy.sanontaharkka;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SanontaLista {

    private List<Sanonta> sanonnat = new ArrayList<>();


    public void lisaaListalle(Sanonta sanonta) {
        sanonnat.add(sanonta);
    }


    public List<Sanonta> getSanonnat() {
        return sanonnat;
    }

}
