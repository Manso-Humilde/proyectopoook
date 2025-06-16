package com.objetos;

public class Persona {
    //debemos declarar las variables privadas de 
    //cada propiedad
    private String nombre;
    private String apellidos;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) throws Exception
    {
        //debemos controlar la edad y realizar la acción 
        //que más nos guste
        //2) error grave: El programador sabe que 
        //esto le puede dar un error, que lo controle.
        if (edad < 0){
            throw new Exception("La edad no puede ser negativa");
        }else {
            this.edad = edad;
        }
    }

    public enum tipoGenero {
        FEMENINO, MASCULINO, OTROS
    }

    private tipoGenero genero;

    public tipoGenero getGenero() {
        return this.genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }

    //METODO PARA DEVOLVER EL NOMBRE Y APELLIDOS
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }

    //METODO PARA DEVOLVER EL NOMBRE Y APELLIDOS EN MAYUSCULAS
    public String getNombreCompleto(int numero){
        return this.nombre.toUpperCase() 
        + " " + this.apellidos.toUpperCase();
    }
    
    //METODO PARA DEVOLVER APELLIDOS Y NOMBRE
    public String getNombreCompleto(boolean orden){
        return this.apellidos + " " + this.nombre;
    }

    //METODO PARA DEVOLVER NOMBRE Y APELLIDOS MEDIANTE
    //EL SEPARADOR QUE DECIDA EL PROGRAMADOR
    public String getNombreCompleto(String separador){
        return this.nombre + separador + this.apellidos;
    }

    //LO QUE IMPORTA ES LA FIRMA DE UN METODO
    public void getNombreCompleto(int num1, int num2){}

    public int getNombreCompleto(String a, int b){
        return 19;
    }

    //METODO PARA RECUPERAR LA LETRA DEL DNI
    public static char getLetraNif(int dni){
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        int resultado = (dni - (dni / 23) * 23);
        char letra = letrasDni.charAt(resultado);
        return letra;
    }

    public static String dameFechaHoy(){
        return "16/06/2025";
    }

    //PROPIEDAD PARA ALMACENAR EL DNI COMPLETO
    private String dni;

    public String getDni() {
        return this.dni;
    }
    //PARA COMPROBAR SI EL DNI EL CORRECTO, DEBEMOS
    //HACERLO CUANDO LO RECIBIMOS
    public void setDni(String dni) throws Exception {
        char letraDni = dni.charAt(dni.length() - 1);
        String temp = dni.substring(0, dni.length() - 1);
        int numeroDni = Integer.parseInt(temp);
        int resultado = (numeroDni - (numeroDni / 23) * 23);
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        char letra = letrasDni.charAt(resultado);
        if (letraDni == letra){
            this.dni = dni;
        }else{
            throw new Exception("La letra del DNI es incorrecta "
            + letra);
        }
    }
}