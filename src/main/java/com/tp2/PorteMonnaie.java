package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class PorteMonnaie {
    private List<SommeArgent> contenu = new ArrayList<>();

    public void ajouterSomme(SommeArgent sommeArgent) {
        contenu.add(sommeArgent);
    }

    public int montantTotalPourDevise(String devise) {
        return contenu.stream()
                .filter(sommeArgent -> sommeArgent.getDevise().equals(devise))
                .mapToInt(SommeArgent::getMontant)
                .sum();
    }

    public List<SommeArgent> getContenu() {
        return contenu;
    }
}
