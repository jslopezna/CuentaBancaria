/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {
        public static void main(String[] args) {
        Cuenta magdalena= new Cuenta(); 
        magdalena.numero= 1012;
        magdalena.saldo= 0; 
        magdalena.clave= 1234; 
        magdalena.usuario= "Magdalena Sanchez"; 
        boolean  resultado= magdalena.cosignar(100000); 
       
    if(resultado == true){
        System.out.println("Consignación existosa, nuevo saldo: "+ magdalena.consultarSaldo());
     }else{
        System.err.println("consigancion no exitosa");
    }    
    
    
    
    }
    
}
