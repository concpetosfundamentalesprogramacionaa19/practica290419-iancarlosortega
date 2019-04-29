/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;

import java.util.Scanner;
import paquetedos.Ciudad;
import paquetetres.Edad;
import paquetecuatro.EstadoCivil;
import paquetecinco.CargosFamiliares;

/**
 *
 * @author Ian Carlos Ortega
 */
public class Practica05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int matricula = 1330;
        
        System.out.println("Ingrese la ciudad de la cual es proveniente");
        String ciudad = scan.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese su estado civil (soltero o casado)");
        String estado_civil = scan.nextLine();
        System.out.println("Tiene cargas familiares (si o no)");
        String familia = scan.nextLine();
        double descuento;
        double descuento1;
        double descuento2;
        double descuento3;
        
        double descuento_total;
        double total;
        double valor_con_tramite;
        
        double ciudad_porcentaje = Ciudad.descuento_ciudad;
        double edad_porcentaje = Edad.descuento_edad;
        double civil_porcentaje = EstadoCivil.descuento_civil;
        double familia_porcentaje = CargosFamiliares.descuento_familia;
        
        
        if (ciudad.equals("Loja") || ciudad.equals("Zamora")){
            descuento = ciudad_porcentaje;
        }else{
            descuento = 0;
        }
        if (edad>=17 || edad<20){
                descuento1 = edad_porcentaje;
            } else {
                descuento1 = 0;
        }
        if (estado_civil.equals("Casado")){
                descuento2 = civil_porcentaje;
            
        } else {
                descuento2 = 0;
        }
        if (familia.equals("Si")){
                descuento3 = familia_porcentaje;
            } else {
                descuento3 = 0;
            }
        
 
        descuento_total = descuento + descuento1 + descuento2 + descuento3;
       
        total = (matricula * descuento_total);
        valor_con_tramite = total + (total*0.02);
        
        System.out.printf("El costo final de la  matricula es: \n%s",
                valor_con_tramite);
        
        
    }
    
}
