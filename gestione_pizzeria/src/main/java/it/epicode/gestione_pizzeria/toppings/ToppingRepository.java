package it.epicode.gestione_pizzeria.toppings;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToppingRepository extends JpaRepository<Topping, Long>{
    //trova topping con  nome
    List<Topping> findByNomeContainingIgnoreCase(String nome);
    //trova topping con prezzo maggiore di
    List<Topping> findByPrezzoGreaterThan(double prezzo);
}
