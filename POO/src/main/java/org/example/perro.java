package org.example;

public class perro {

    private String nombre;
    private boolean vacunado;
    private int edad;
    private String raza;
    private String color;
    private int numeropatas;

    public perro(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }
}
