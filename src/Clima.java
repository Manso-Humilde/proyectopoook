import com.objetos.Mes;

import java.util.ArrayList;
import java.util.Scanner;

public class Clima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mes> meses = new ArrayList<Mes>();

        // Solicitar datos para cada mes
        for (int i = 0; i <= 12; i++) {
            System.out.println("Introduce los datos para el mes " + (i + 1));

            System.out.print("Nombre del mes: ");
            String nombre = scanner.nextLine();

            System.out.print("Temperatura máxima: ");
            int tempMax = scanner.nextInt();

            System.out.print("Temperatura mínima: ");
            int tempMin = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Mes mes = new Mes(nombre, tempMax, tempMin);
            meses.add(mes);
        }

        // Mostrar los datos ingresados
        System.out.println("\nDatos ingresados:");
        for (Mes mes : meses) {
            System.out.println(mes);
        }

        scanner.close();
    }
}
