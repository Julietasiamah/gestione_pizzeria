package it.epicode.gestione_pizzeria.ordini;


import it.epicode.gestione_pizzeria.menu.Menu;
import it.epicode.gestione_pizzeria.tavolo.StatoTavolo;
import it.epicode.gestione_pizzeria.tavolo.Tavolo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class OrdineRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Value("${app.costo.coperto}")
    private double costoCoperto;
    @Override
    public void run (String... args) throws Exception{

        System.out.println("costo coperto: " + costoCoperto);
        Tavolo tavolo = new Tavolo(2,3);
        tavolo.setStato(StatoTavolo.OCCUPATO);

        Ordine ordine = new Ordine();
        ordine.setNumeroOrdine(1);
        ordine.setStato(StatoOrdine.IN_CORSO);
        ordine.setCoperti(2);
        ordine.setOraOrdine(LocalTime.now());
        ordine.setElementi(List.of(
                menu.getPizza().get(0),
                menu.getPizza().get(1),
                menu.getDrink().get(0),
                menu.getDrink().get(1),
                menu.getTopping().get(3),
                menu.getTopping().get(4)

        ));
        ordine.setTavolo(tavolo);

        ordine.stampaOrdine(costoCoperto);

    }
}
