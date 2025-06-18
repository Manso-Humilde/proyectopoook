import com.objetos.Mes;
import java.util.ArrayList;
import java.util.Scanner;

public class ClimaProfe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Mes> meses = new ArrayList<Mes>();
        String[] nombresmeses = new String[] {"ENERO", "FEBRERO"};
        //BUCLE PARA ALMACENAR MESES
        for (int i = 1; i <= 12; i++){
            Mes mes = new Mes();
            String nombre = nombresmeses[i - 1];
            System.out.println("Temperatura máxima");
            int tempMax = Integer.parseInt( teclado.nextLine());
            System.out.println("Temperatura mínima");
            int tempMin = Integer.parseInt( teclado.nextLine());
            mes.setNombre(nombre);
            mes.setTemperaturaMaxima(tempMax);
            mes.setTemperaturaMinima(tempMin);    
            meses.add(mes);
        }
        //BUCLE PARA DIBUJAR LOS MESES
        for (Mes m : meses){
            System.out.println(m);
        }
        System.out.println("Fin de programa");
    }
}