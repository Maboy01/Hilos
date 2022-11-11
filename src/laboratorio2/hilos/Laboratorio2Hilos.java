/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2.hilos;

/**
 *
 * @author LENOVO
 */
public class Laboratorio2Hilos {

    public static void main(String[] args) {
        //Creacion de los 3 hilos con el tiempo aleatorio
        Hilos t1,t2,t3;
        t1 = new Hilos("Hilo 1 ", (int)(Math.random()*2000));
        t2 = new Hilos("Hilo 2 ", (int)(Math.random()*2000));
        t3 = new Hilos("Hilo 3 ", (int)(Math.random()*2000));
        //Se incian los 3 hilos con el metodo .start
        t1.start();
        t2.start();
        t3.start();
    }
    
}
