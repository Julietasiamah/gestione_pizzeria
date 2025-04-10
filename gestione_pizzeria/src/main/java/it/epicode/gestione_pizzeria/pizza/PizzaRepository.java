package it.epicode.gestione_pizzeria.pizza;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long>{
    List<Pizza> findByNomeContainingIgnoreCase(String nome);
    //trova la pizza con meno calorie
    Pizza findFirstByOrderByCalorieAsc();
}
