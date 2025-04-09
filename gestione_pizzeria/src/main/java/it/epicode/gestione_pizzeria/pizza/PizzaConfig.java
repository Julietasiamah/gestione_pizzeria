package it.epicode.gestione_pizzeria.pizza;

import it.epicode.gestione_pizzeria.toppings.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class PizzaConfig {
    private final Topping funghi;
    private final Topping cipolla;
    private final Topping prosciutto;
    private final Topping salame;
    private final Topping ananas;
    private final Topping pomodoro;
    private final Topping mozzarella;

@Bean
 private Pizza margherita(){
     return new Pizza("Margherita", "Pizza di pomodoro e mozzarella", 4.50, 1000, List.of(pomodoro, mozzarella));

 }

 @Bean
 private Pizza hawaiianPizza(){
     return new Pizza("Hawaiian Pizza", "Pizza con prosciutto e ananas", 6.00, 1200, List.of(prosciutto, ananas, mozzarella));
 }

 @Bean
 private Pizza diavolaPizza(){
     return new Pizza("Diavola Pizza", "Pizza con salame piccante", 6.50, 1200, List.of(salame, mozzarella));
 }
 @Bean
 private Pizza funghiPizza(){
     return new Pizza("Funghi Pizza", "Pizza con funghi", 5.50, 1100, List.of(funghi, mozzarella));
 }
 @Bean
 private Pizza cipollaPizza(){
     return new Pizza("Cipolla Pizza", "Pizza con cipolla", 5.50, 1100, List.of(cipolla, mozzarella));
 }
 @Bean
 private Pizza prosciuttoEPomodoroPizza(){
     return new Pizza("Prosciutto e Pomodoro Pizza", "Pizza con prosciutto e pomodoro", 5.50, 1100, List.of(prosciutto, pomodoro, mozzarella));
 }

}
