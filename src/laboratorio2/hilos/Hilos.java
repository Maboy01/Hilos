/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2.hilos;

/**
 *
 * @author LENOVO
 */
public class Hilos extends Thread{
    private String nombre;
    private int retardo;

    public Hilos(String s,int d) {
        nombre = s;
        retardo = d;
    }
    public void run(){
        try {
            sleep(retardo);
        } catch (InterruptedException e) {
        }
        System.out.println("Prueba Hilos: "+nombre+retardo);
    }
    
    
}
