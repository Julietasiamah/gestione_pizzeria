package it.epicode.gestione_pizzeria.bevande;

import it.epicode.gestione_pizzeria.menu.RigaMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink implements RigaMenu {
    private String nome;
    private String descrizione;
    private double prezzo;
    private int calorie;

    @Override
    public String descrizioneRiga(){
        return descrizione + " - " + prezzo + " €" + calorie + "kcal";
    }

    @Override
    public double prezzoTotale() {
        return prezzo;
    }
}
