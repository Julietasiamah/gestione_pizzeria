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
 public Pizza margherita(){
     return new Pizza(1L,"Margherita", "Pizza con mozzarella e pomodoro", 5.50, 1100,
             List.of(mozzarella, pomodoro));

 }

 @Bean
 public Pizza hawaiianPizza(){
     return new Pizza(2L,"Hawaiian Pizza", "Pizza con prosciutto e ananas", 6.00, 1200,
             List.of(prosciutto, ananas, mozzarella));
 }

 @Bean
 public Pizza diavolaPizza(){
     return new Pizza(3L,"Diavola Pizza", "Pizza con salame piccante", 6.50, 1200,
             List.of(salame, mozzarella));
 }
 @Bean
 public Pizza funghiPizza(){
     return new Pizza(4L,"Funghi Pizza", "Pizza con funghi", 5.50, 1100,
             List.of(funghi, mozzarella));
 }
 @Bean
 public Pizza cipollaPizza(){
     return new Pizza(5L,"Cipolla Pizza", "Pizza con cipolla", 5.50, 1100,
             List.of(cipolla, mozzarella));
 }
 @Bean
 public Pizza prosciuttoEPomodoroPizza(){
     return new Pizza(6L,"Prosciutto e Pomodoro Pizza", "Pizza con prosciutto e pomodoro",
             5.50, 1100, List.of(prosciutto, pomodoro, mozzarella));
 }

}
