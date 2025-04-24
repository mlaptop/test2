package com.tp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SommeArgentMultiplicationTest {
    @ParameterizedTest
    @CsvSource({
            "10, EUR, 2, 20",
            "5, USD, 3, 15",
            "0, EUR, 10, 0"
    })
    public void testMultiplier(int montant, String devise, int facteur, int resultatAttendu) {
        SommeArgent sommeArgent = new SommeArgent(montant, devise);
        SommeArgent resultat = sommeArgent.multiplier(facteur);
        Assertions.assertEquals(new SommeArgent(resultatAttendu, devise), resultat);
    }
}
