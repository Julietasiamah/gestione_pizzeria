package it.epicode.gestione_pizzeria.bevande;

import it.epicode.gestione_pizzeria.menu.RigaMenu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "drinks")
public class Drink implements RigaMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (length = 50, nullable = false)
    private String nome;
    @Column (length = 50, nullable = false)
    private String descrizione;
    @Column (length = 50, nullable = false)
    private double prezzo;
    @Column (length = 50, nullable = false)
    private int calorie;

    public Drink(String nome, String descrizione, double prezzo, int calorie) {
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
