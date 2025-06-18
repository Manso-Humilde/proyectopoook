package com.objetos;

public class coche {

    public coche(){
        this.velocidad = 0;
        this.cocheArancado = false;
        this.velocidadMaxima = 180;
    }

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;

    private boolean cocheArancado;

    public void arrancar(){
        System.out.println("El coche ha arrancado!!! A jugar!!!");
        this.cocheArancado = true;
    }

    public int acelerar(){
        if (cocheArancado == false) {
            System.out.println("Debe arrancar el coche primero");
            return 0;
        } else {
            this.velocidad += 20;
            if (this.velocidad > this.velocidadMaxima) {
                this.velocidad = this.velocidadMaxima;
            }
            return this.velocidad;
        }
    }

    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    //Esta la pongo protected para que solo el deportivo que 
    //es heredado la pueda cambia
    protected void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public int frenar(){
        this.velocidad -< 10;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return this.marca + " " + this.modelo
        + " , velocidad " + this.velocidad;
    }
}
