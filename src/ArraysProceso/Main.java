
// >> Nombre:  Mora Gonzalez Kevin Daniel

package ArraysProceso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int suma = 0, resta = 0;
        System.out.println("ingrse el tamaño del Arreglo");
        int total_arreglo = sc.nextInt();

        int numero1[] = new int[total_arreglo];

        System.out.println("Ingrese numeros para rellenar su array");

        for (int i = 0; i < total_arreglo; i++) {
            System.out.println("ingrese" + (i + 1) + "numero del arreglo");
            numero1[i] = sc.nextInt();
            suma = suma + numero1[i];
            resta = resta - numero1[i];
        }

        for (int i = 0; i < total_arreglo; i++) {
            System.out.print("" + numero1[i]);

        }

        System.out.println("\nla suma total de los numeros es" + suma);
        System.out.println("la resta total es " + resta);

    }

}
