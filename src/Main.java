import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Creamos un set de numeros
        Set<Integer> numeros = new HashSet<>();
        //Le añadimos algunos numeros, intentamos añadir duplicados
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        numeros.add(4);

        //Recorremos el set y lo mostramos por pantalla, y se puede observar que no admite duplicados
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
