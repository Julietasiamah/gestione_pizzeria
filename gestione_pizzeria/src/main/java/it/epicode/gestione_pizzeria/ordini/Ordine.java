package it.epicode.gestione_pizzeria.ordini;

import it.epicode.gestione_pizzeria.menu.RigaMenu;
import it.epicode.gestione_pizzeria.tavolo.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ordine {
    private int numeroOrdine;
    private StatoOrdine stato;
    private int coperti;
    private LocalTime oraOrdine;
    private List <RigaMenu> elementi;
    private Tavolo tavolo;

    public double calcolaPrezzoTotale(double prezzoUnitariocoperto){
        double prezzoTotale = 0;
        for (RigaMenu riga : elementi) {
            prezzoTotale += riga.prezzoTotale();
        }
        prezzoTotale += prezzoUnitariocoperto * coperti;

        return prezzoTotale;
    }

    public void stampaOrdine(double prezzoUnitarioCoperto) {
        System.out.println("Numero ordine: " + numeroOrdine);
        System.out.println("Stato ordine: " + stato);
        System.out.println("Coperti: " + coperti);
        System.out.println("Ora ordine: " + oraOrdine);
        System.out.println("Tavolo: " + tavolo.getNumeroTavolo());
        System.out.println("-- Elementi ordinati --");
        for (RigaMenu riga : elementi) {
            System.out.println(riga.descrizioneRiga());
        }
        System.out.println("-----------");
        System.out.println("Prezzo totale: " + calcolaPrezzoTotale( prezzoUnitarioCoperto));
    }


}
