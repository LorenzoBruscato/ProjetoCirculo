/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lorenzo
 */
public class Circulo {

    private double pi;
    private double raio;

    public Circulo() {
        this(0, 0);
    }

    public Circulo(double pi, double raio) {
        this.pi = pi;
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return ((getPi() * Math.pow(pi, 2)));
    }
}
