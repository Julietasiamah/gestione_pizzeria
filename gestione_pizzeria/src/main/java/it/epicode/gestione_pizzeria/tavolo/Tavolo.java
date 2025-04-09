package it.epicode.gestione_pizzeria.tavolo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMax;
    private StatoTavolo stato = StatoTavolo.LIBERO;

    public Tavolo(int numeroTavolo, int numeroCopertiMax) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMax = numeroCopertiMax;
    }
}
