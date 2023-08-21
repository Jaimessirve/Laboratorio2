/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Pitochuu
 */
public class Motor extends Transmision{
    private String tipoCombustible;
    private double capacidad;

    public Motor(String tipoCombustible, double capacidad) {
        super();
        this.tipoCombustible = tipoCombustible;
        this.capacidad = capacidad;
    }

    public void encender() {
        System.out.println("Motor encendido");
    }

    public void apagar() {
        System.out.println("Motor apagado");
    }
}
