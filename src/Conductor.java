import com.objetos.Deportivo;
//import com.objetos.Coche;

public class Conductor {
    public static void main(String[] args) {
        Deportivo car = new Deportivo();
        car.setMarca("Rayo");
        car.setModelo("McQueen");
        car.arrancar(); //arrancamos
        car.acelerar(); //50
        car.acelerar(); //100
        car.acelerar(); //150
        car.turbo(); //190
        car.frenar(); // 180
        car.frenar(); // 170
        car.frenar(true); //0 y apagado
        // //Si intentamos acelerar después...
        car.acelerar(); //El deportivo acelera aunque esté apagado...
        System.out.println(car);
        // Coche car = new Coche();
        // car.setMarca("Seat");
        // car.setModelo("Panda");
        // car.arrancar(); //arrancamos
        // car.acelerar(); //20
        // car.acelerar(); //40
        // car.acelerar(); //60
        // car.frenar(); // 50
        // car.frenar(); //40
        // car.frenar(true); //0 y apagado
        // //Si intentamos acelerar después...
        // car.acelerar(); //no podemos acelerar
        // System.out.println(car);
    }
}