import com.objetos.MesProfe;
import java.util.ArrayList;
import java.util.Random;

public class ClimaProfe {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<MesProfe> meses = new ArrayList<MesProfe>();
        String[] nombresmeses = new String[] 
        {"ENERO", "FEBRERO", "MARZO", "ABRIL"
        , "MAYO", "JUNIO", "JULIO", "AGOSTO"
        , "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        //BUCLE PARA ALMACENAR MESES
        for (int i = 1; i <= 12; i++){
            MesProfe mes = new MesProfe();
            String nombre = nombresmeses[i - 1];
            int tempMax = random.nextInt(17, 45); //GENERAMOS ALEATORIO
            int tempMin = random.nextInt(-10, 16); //GENERAMOS ALEATORIO
            mes.setNombre(nombre);
            mes.setTemperaturaMaxima(tempMax);
            mes.setTemperaturaMinima(tempMin);    
            meses.add(mes);
        }
        //BUCLE PARA DIBUJAR LOS MESES
        for (MesProfe m : meses){
            System.out.println(m);
        }
        System.out.println("Fin de programa");
    }
}