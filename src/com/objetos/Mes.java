package com.objetos;

public class Mes {
    private String nombre;
    private int temperaturaMaxima;
    private int temperaturaMinima;

    public Mes(String nombre, int temperaturaMaxima, int temperaturaMinima) {
        this.nombre = nombre;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public double generarMediaMensual() {
        // Asegurarse de que la división sea de tipo double
        return (this.temperaturaMinima + this.temperaturaMaxima) / 2.0;
    }

    @Override
    public String toString() {
        return this.nombre + ", Max: " + this.temperaturaMaxima
                + ", Min: " + this.temperaturaMinima
                + ", Media: " + this.generarMediaMensual();
    }

    // Métodos getter y setter (si los necesitas)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }
}
