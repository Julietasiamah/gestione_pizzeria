package it.epicode.gestione_pizzeria.pizza;

import it.epicode.gestione_pizzeria.menu.RigaMenu;
import it.epicode.gestione_pizzeria.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements RigaMenu {
    private String nome;
    private String descrizione;
    private double prezzo;
    private int calorie;
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
    @Override
    public String descrizioneRiga(){
        return descrizione + " - " + getTotalPrice() + "€" + " - " + getTotalCalories() + " kcal";
    }

    @Override
    public double prezzoTotale() {
        return getTotalPrice();
    }
}
