import com.objetos.*;

public class Conductor {
    public static void main(String[] args){
        
        Deportivo car = new Deportivo();
        car.setMarca("Rayo");
        car.setModelo("MacQueen");
        car.arrancar();
        car.acelerar();
        car.acelerar();
        car.acelerar();
        car.frenar(true);
        car.acelerar();
        System.out.println(car);
    }
    
        //     coche car = new coche();
    //     car.setMarca("Seat");
    //     car.setModelo("Panda");
    //     car.arrancar();
    //     car.acelerar();
    //     car.acelerar();
    //     car.acelerar();
    //     car.frenar();
    //     System.out.println(car);
    // }
   
   
}
