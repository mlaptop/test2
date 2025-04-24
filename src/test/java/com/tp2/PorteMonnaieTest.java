package com.tp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PorteMonnaieTest {
    @Test
    public void testAJouteEtTotal(){
        PorteMonnaie pm = new PorteMonnaie();
        pm.ajouterSomme(new SommeArgent(10,"EUR"));
        pm.ajouterSomme(new SommeArgent(15,"EUR"));
        pm.ajouterSomme(new SommeArgent(5,"USD"));

        Assertions.assertEquals(25,pm.montantTotalPourDevise("EUR"));
        Assertions.assertEquals(5,pm.montantTotalPourDevise("USD"));
        Assertions.assertEquals(0,pm.montantTotalPourDevise("GBP"));
    }
}
