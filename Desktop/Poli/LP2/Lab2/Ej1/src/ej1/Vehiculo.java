/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Pitochuu
 */
public class Vehiculo extends Motor {
    String marca;
    String modelo;

    public Vehiculo(String marca, String modelo) {
        super("Nafta", 2000);
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("Vehículo acelerando");
    }
}

