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
    
    //Constructor para inicar el hilo y tiempo de retardo
    public Hilos(String s,int d) {
        nombre = s;
        retardo = d;
    }
    //Metodo run() ejecuta
    public void run(){
        try {
            //Retrasamos un poco el hilo con el tiempo ya espicificado
            sleep(retardo);
        } catch (InterruptedException e) {
        }
        //Imprimimos el hilo y lo que se demororo
        System.out.println("Prueba Hilos: "+nombre+retardo);
    }
    
    
}
