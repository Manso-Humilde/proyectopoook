package com.objetos;

public class Deportivo extends Coche {

    public Deportivo() {
        this.setVelocidadMaxima(320);
    }

    public int turbo(){
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual + 40);
        if (this.getVelocidad() > this.getVelocidadMaxima()){
            this.setVelocidad(this.getVelocidadMaxima());
        }
        return this.getVelocidad();
    }  
    
    //NECESITAMOS MODIFICAR EL METODO DE ACELERAR DE UN COCHE
    @Override
    public int acelerar(){
        //No podemos acelerar si el deportivo no ha arrancado
        if (this.cocheArrancado == false){
            System.out.println("Debe arrancar el deportivo primero");
            return 0;
        }else {
            int velocidadActual = this.getVelocidad();
            this.setVelocidad(velocidadActual + 50);
            if (this.getVelocidad() > this.getVelocidadMaxima()){
                this.setVelocidad(this.getVelocidadMaxima());
            }
            return this.getVelocidad();
        }
    }
}