package it.epicode.gestione_pizzeria.menu;

import it.epicode.gestione_pizzeria.bevande.Drink;
import it.epicode.gestione_pizzeria.pizza.Pizza;
import it.epicode.gestione_pizzeria.toppings.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {
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

    @Bean
    public Menu menuPranzo(){
        return new Menu(
                "Menu Pranzo",
                "Menu del Pranzo",
                List.of(margherita,diavolaPizza, hawaiianPizza, funghiPizza, cipollaPizza, prosciuttoEPomodoroPizza),
                List.of(pomodoro, mozzarella, funghi, cipolla, prosciutto, salame, ananas),
                List.of(cocaCola, fanta, sprite)
        );

    }


}
