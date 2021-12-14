/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Brinquedo;

/**
 *
 * @author IFSC
 */
public class AcionaBotao {

    public static void main(String[] args) {
        /*Carro car = new Carro();
        ControleRemoto contr = new ControleRemoto(car);
        car.mover();
        

        /* Aviao plane = new Aviao();
        ControleRemoto contr = new ControleRemoto(plane);
        plane.mover();
        */
        
        Barco bar = new Barco();
        ControleRemoto contr = new ControleRemoto(bar);
        bar.mover();
    }
}
