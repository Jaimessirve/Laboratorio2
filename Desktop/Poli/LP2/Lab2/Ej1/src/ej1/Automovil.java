/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Pitochuu
 */
public class Automovil extends Vehiculo implements Comodidad{
    
    private int numPuertas;
    public Automovil(String marca, String modelo, int numPuertas) {
        super(marca, modelo); // Llama al constructor de la superclase
        this.numPuertas = numPuertas;
    }
    @Override
    public void Comodidad(){
        System.out.println("test");
    }

}
