package it.epicode.gestione_pizzeria.bevande;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Bean
    public Drink cocaCola(){
        return new Drink("Coca Cola", "Bevanda gassata", 2.50, 200);
    }
    @Bean
    public Drink fanta(){
        return new Drink("Fanta", "Bevanda gassata", 2.50, 200);
    }
    @Bean
    public Drink sprite(){
        return new Drink("Sprite", "Bevanda gassata", 2.50, 200);
    }
}
