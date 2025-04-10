package it.epicode.gestione_pizzeria.pizza;

import it.epicode.gestione_pizzeria.menu.RigaMenu;
import it.epicode.gestione_pizzeria.toppings.Topping;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "pizze")
public class Pizza implements RigaMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column (length = 50, nullable = false)
    private String descrizione;
    @Column (length = 50, nullable = false)
    private double prezzo;
    @Column (length = 50, nullable = false)
    private int calorie;
    @ManyToMany
    @JoinTable(
            name = "pizza_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> toppings = new ArrayList<>();


    public  String toppingsToString(){
        String toppingString = toppings.stream().map(Topping::getNome).reduce("",(a,b) -> a + " " + b);
        return toppingString;
    }

    public double getTotalPrice(){
        double totalPrice = prezzo;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrezzo();
        }
        return totalPrice;
    }
    public int getTotalCalories(){
        int totalCalories = calorie;
        for (Topping topping : toppings) {
            totalCalories += topping.getCalorie();
        }
        return totalCalories;
    }

    public Pizza(String nome, double prezzo, String descrizione, int calorie, List<Topping> toppings) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.calorie = calorie;
        this.toppings = toppings;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }


    @Override
    public String descrizioneRiga(){
        return descrizione + " - " + getTotalPrice() + "€" + " - " + getTotalCalories() + " kcal";
    }

    @Override
    public double prezzoTotale() {
        return getTotalPrice();
    }
}
