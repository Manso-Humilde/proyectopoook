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
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual + 50);
        if (this.getVelocidad() > this.getVelocidadMaxima()){
            this.setVelocidad(this.getVelocidadMaxima());
        }
        return this.getVelocidad();
    }
}