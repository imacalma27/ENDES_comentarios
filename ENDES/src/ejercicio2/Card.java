
package ejercicio2;

public class Card {

    // Guardamos el palo y el valor de la carta
    public String suit;
    public String value;

    // Creamos una carta con su palo y su valor
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    // Devuelve el palo y el valor juntos
    public String toString() {
        return (this.suit + "-" + this.value);
    }

}

