/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Pitochuu
 */
public class Transmision extends Llantas{
    public String tipo;
    public int marchaActual;

    public Transmision(){
        super();
    }

    public void cambiarMarcha(int nuevaMarcha) {
        this.marchaActual = nuevaMarcha;
    }

    public void avanzar() {
        System.out.println("Avanzando...");
    }

    public void retroceder() {
        System.out.println("Retrocediendo...");
    }
}

