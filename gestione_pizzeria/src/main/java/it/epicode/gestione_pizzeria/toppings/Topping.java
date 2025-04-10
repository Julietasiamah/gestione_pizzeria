package it.epicode.gestione_pizzeria.toppings;

import it.epicode.gestione_pizzeria.menu.RigaMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table (name = "toppings")
public class Topping implements RigaMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descrizione;
    private double prezzo;
    private int calorie;

    public Topping(String nome, String descrizione, double prezzo, int calorie) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

    @Override
    public String descrizioneRiga(){
        return descrizione + " - " + prezzo + " €" + calorie + "kcal";
    }

    @Override
    public double prezzoTotale() {
        return prezzo;
    }
}
