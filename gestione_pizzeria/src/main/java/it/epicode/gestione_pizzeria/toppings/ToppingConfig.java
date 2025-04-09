package it.epicode.gestione_pizzeria.toppings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping mozzarella(){
        return new Topping("Mozzarella", "Pomodoro fresco e mozzarella", 0.50, 100);
    }
    @Bean
    public Topping pomodoro(){
        return new Topping("Pomodoro", "Pomodoro fresco", 0.50, 100);
    }
    @Bean
    public Topping ananas(){
        return new Topping("Ananas", "Ananas", 1.00, 150);
    }
    @Bean
    public Topping prosciutto(){
        return new Topping("Prosciutto", "Prosciutto cotto", 1.00, 150);
    }
    @Bean
    public Topping salame(){
        return new Topping("Salame", "Salame", 1.00, 150);
    }

     @Bean
    public Topping funghi(){
        return new Topping("Funghi", "Funghi", 1.00, 150);
    }
    @Bean
    public Topping cipolla(){
        return new Topping("Cipolla", "Cipolla", 1.00, 150);
    }
}
