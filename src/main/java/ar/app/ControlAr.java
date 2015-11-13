/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.app;

import ar.cdp.ArCondicionado;
import ar.cdp.Sensor;

/**
 *
 * @author IzabelyFurtado
 */
public class ControlAr {
    
    public static void inicializaControle(int novaTemperatura){
        //cria sensores
        Sensor s1 = new Sensor();
        Sensor s2 = new Sensor();
        Sensor s3 = new Sensor();
        //cria ar condicionado
        ArCondicionado arCond = new ArCondicionado(); 
        //add sensores
        arCond.registerObserver(s1); 
        arCond.registerObserver(s2); 
        arCond.registerObserver(s3); 
        //seta nova temparatura
        arCond.setNovaTemp(novaTemperatura);
    }
}
