package com.objetos;

public class Director extends Empleado {
    public void mandar(){
        System.out.println("obedecer todos, jajaja");
    }
    // @Override "este da erro ya que cuando el método es final en Emplado no permite hacer nada"
    // public void metodoFinal(){
    //     System.out.println("Soy un metodo final");
    // }

    @Override //SOBRE ESCRIBE @Override "sustituir lo que ya tienes"
    public int getDiasVacaciones(){
        int vacas = super.getDiasVacaciones();
        System.out.println("Vacaciones director");
        return vacas + 8;
    }
    //IMPLEMENTO "CREA UNO NUEVO ES diasExtras"
    public int getDiasVacaciones(int diasExtra){
        return 30 + diasExtra;
    }

    public Director() {
        int salarioMinimo = super.getSalarioMinimo();
        this.setSalarioMinimo(salarioMinimo + 200);
    }
}
