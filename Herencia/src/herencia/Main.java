/*

 */
package herencia;

import Animal.Animal;
import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro( "Milo" , " Croquetas", 2, "Labrador");
        perro.Alimentacion();
        Gato gato = new Gato( "Lolo" , "pescado", 4, " siames ");
        gato.Alimentacion();
        Caballo caballo=new Caballo( " Rayo " , " pasto y zanahoria " , 7 , " Arabe ");
        caballo.Alimentacion();
    }

}
