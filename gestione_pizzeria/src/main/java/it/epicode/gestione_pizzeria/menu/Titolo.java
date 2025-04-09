package it.epicode.gestione_pizzeria.menu;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Titolo implements RigaMenu{

    private String riga;

    @Override
    public double prezzoTotale() {
        return 0;
    }

    @Override
    public String descrizioneRiga() {
        return riga;
    }
}
