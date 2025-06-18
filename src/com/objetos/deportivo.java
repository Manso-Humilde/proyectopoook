package com.objetos;

public class deportivo extends coche {

    public deportivo(){
        this.setVelocidadMaxima(getVelocidadMaxima = 320);
    }

    public int turbo(){
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual + 40);
        if (this.getVelocidad() > this.getVelocidadMaxima()) {
            this.setVelocidad(this.getVelocidadMaxima());

        }
        return this.getVelocidad();
    }

    @Override
    public int acelerar(){
        int velocidadActual = this.getVelocidad();
        this.setVelocidad(velocidadActual + 50);
        if (this.getVelocidad() > this.getVelocidadMaxima()) {
            this.setVelocidad(this.getVelocidadMaxima());
        }
        return this.getVelocidad();
    }
}
