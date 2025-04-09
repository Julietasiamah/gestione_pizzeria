package it.epicode.gestione_pizzeria.menu;

import it.epicode.gestione_pizzeria.bevande.Drink;
import it.epicode.gestione_pizzeria.pizza.Pizza;
import it.epicode.gestione_pizzeria.toppings.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private String nome;
    private String descrizione;

    private List<Pizza> pizza = new ArrayList<>();
    private List<Topping> topping = new ArrayList<>();
    private List<Drink> drink = new ArrayList<>();


    public void stampaMenu() {
        System.out.println("-- Menu" + nome + " --");
        System.out.println("Pizze");
        for (Pizza pizza : pizza) {
            System.out.println(pizza.descrizioneRiga());
        }

        System.out.println("--- bevande ---");
        for (Drink bevanda : drink) {
            System.out.println(bevanda.descrizioneRiga());
        }

        System.out.println("--- toppings ---");
        for (Topping topping : topping) {
            System.out.println(topping.descrizioneRiga());
        }

    }
}
