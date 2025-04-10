package it.epicode.gestione_pizzeria.bevande;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkRepository extends JpaRepository<Drink, Long>{
//trova drink con prezzo basso
    Drink findFirstByPrezzoLessThan(double prezzo);
    Drink findFirstByPrezzoLessThanOrderByPrezzoDesc(double prezzo);

}
