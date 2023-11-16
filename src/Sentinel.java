import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sentinel {
    public static int search(int[] array, int target) {
        int lastIndex = array.length - 1;

        // Almacenar el último elemento y luego reemplazarlo con el valor objetivo
        int lastValue = array[lastIndex];
        array[lastIndex] = target;

        int index = 0;
        // Buscar el valor objetivo en el array
        while (array[index] != target) {
            index++;
        }

        // Restaurar el último valor
        array[lastIndex] = lastValue;

        // Si el índice es menor que el tamaño del array, se encontró el valor objetivo
        if (index < lastIndex || array[lastIndex] == target) {
            return index;
        } else {
            return -1; // El valor objetivo no está presente en el array
        }
    }
    
    

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = Integer.parseInt(reader.readLine());

        int[] array = new int[size];

        System.out.println("Ingrese los elementos del arreglo (uno por uno):");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = Integer.parseInt(reader.readLine());
        }

        System.out.print("Ingrese el valor a buscar: ");
        int target = Integer.parseInt(reader.readLine());

        int result = search(array, target);

        if (result != -1) {
            System.out.println("Elemento encontrado en el índice: " + result);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }
}


    