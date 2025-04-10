package it.epicode.gestione_pizzeria.menu;

import it.epicode.gestione_pizzeria.bevande.Drink;
import it.epicode.gestione_pizzeria.pizza.Pizza;
import it.epicode.gestione_pizzeria.toppings.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MenuRunner implements CommandLineRunner {
    private final Menu menuPranzo;

    private final Topping funghi;
    private final Topping cipolla;
    private final Topping prosciutto;
    private final Topping salame;
    private final Topping ananas;
    private final Topping pomodoro;
    private final Topping mozzarella;


    private final Pizza margherita;
    private final Pizza hawaiianPizza;
    private final Pizza diavolaPizza;
    private final Pizza funghiPizza;
    private final Pizza cipollaPizza;
    private final Pizza prosciuttoEPomodoroPizza;


    private final Drink cocaCola;
    private final Drink fanta;
    private final Drink sprite;


    public static void printMenu(List<RigaMenu> righe) {
        for (RigaMenu riga : righe) {
            System.out.println(riga.descrizioneRiga());
        }

    }

    @Override
    public void run (String...args) throws Exception {
        menuPranzo.stampaMenu();

        System.out.println("----------------");
        System.out.println("stampa statica");
        System.out.println("----------------");
        printMenu(List.of(
                new Titolo ("Menu"),
                new Titolo ("Pizze"),
                margherita
                , hawaiianPizza
                , diavolaPizza
                , funghiPizza
                , cipollaPizza
                , prosciuttoEPomodoroPizza
                , new Titolo ("Toppings"),
                funghi
                , cipolla
                , prosciutto
                , salame
                , ananas
                , pomodoro
                , mozzarella
                , new Titolo ("Bevande"),
                cocaCola
                , fanta
                , sprite

        ));
    }
}
