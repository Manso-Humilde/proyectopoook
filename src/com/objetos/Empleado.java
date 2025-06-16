package com.objetos;

public class Empleado extends Persona{
    //Creamos un Constructor vacio
    public Empleado() {
        super();
        this.salarioMinimo = 1300;
        System.out.println("Constructor de Empleado");
    } //Fin del Constructor

    // public Empleado(String nombre, String apellidos){
    //     super();
    //     System.out.println("Constructor nombre y apellido Empleado");
    // }

    public Empleado(int sueldoMinimo) {
        super();
        System.out.println("Suelario Minimo");
    }

    private int sueldo;

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    protected int salarioMinimo;

    public int getSalarioMinimo() {
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
}

