package com.tp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SommeArgentTest {

    @Test
    public void testEgalite(){
        SommeArgent s1 = new SommeArgent(50, "EUR");
        SommeArgent s2 = new SommeArgent(50, "EUR");
        Assertions.assertEquals(s1, s2);
    }

    @Test
    public void testAddionMemeDevise(){
        SommeArgent s1 = new SommeArgent(20, "EUR");
        SommeArgent s2 = new SommeArgent(30, "EUR");
        SommeArgent attendu = new SommeArgent(50, "EUR");
        Assertions.assertEquals(attendu, s1.additionner(s2));
    }

    @Test
    public void testAddionMemeDifferente(){
        SommeArgent s1 = new SommeArgent(10, "EUR");
        SommeArgent s2 = new SommeArgent(10, "USD");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            s1.additionner(s2);
        });
    }

    @Test
    public void testAdditionCorrectSommeArgent(){
        //Arrange
        SommeArgent s1 = new SommeArgent(20, "EUR");
        SommeArgent s2 = new SommeArgent(30, "EUR");

        //Act
        SommeArgent resultat = s1.additionner(s2);

        //Assert
        SommeArgent attendu = new SommeArgent(50, "EUR");
        Assertions.assertEquals(attendu,resultat,"L'addition devrait donner 50 EUR");
    }
}
