package com.objetos;

public class Director extends Empleado {
    public Director() {
        int salarioMinimo = super.getSalarioMinimo();
        this.setSalarioMinimo(salarioMinimo + 200);
    }
}
