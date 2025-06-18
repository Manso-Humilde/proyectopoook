package com.objetos;

public class Coche {

    public Coche(){
        this.velocidad = 0;
        this.cocheArrancado = false;
        this.velocidadMaxima = 180;
    }

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima;
    //Necesitamos una variable que indicará si el coche
    //está arrancado o no
    private boolean cocheArrancado;

    public void arrancar(){
        System.out.println("El coche ha arrancado!!! A jugar!!!");
        this.cocheArrancado = true;
    }

    public int acelerar() {
        //No podemos acelerar si el coche no ha arrancado
        if (this.cocheArrancado == false){
            System.out.println("Debe arrancar el coche primero");
            return 0;
        }else {
            this.velocidad += 20;
            if (this.velocidad > this.velocidadMaxima){
                this.velocidad = this.velocidadMaxima;
            }
            return this.velocidad;
        }
    }

    public int frenar() {
        this.velocidad -= 10;
        if (this.velocidad < 0){
            this.velocidad = 0;
        }
        return this.velocidad;
    }

    public int frenar(boolean atope){
        System.out.println("Frenada a tope y apagado!!!");
        this.velocidad = 0;
        this.cocheArrancado = false;
        return 0;
    }

    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    //protected para que otro coche pueda cambiar
    //su velocidad máxima (Deportivo)
    protected void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //Velocidad será solo lectura
    public int getVelocidad() {
        return this.velocidad;
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
    
    //SOBRESCRIBIMOS EL METODO toString() PARA 
    //HACER MAS AGRADABLE EL DIBUJO DE UN COCHE
    @Override
    public String toString(){
        return this.marca + " " + this.modelo
        + ", Velocidad: " + this.velocidad;
    }
}