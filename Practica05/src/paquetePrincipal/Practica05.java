/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetePrincipal;


import java.util.Scanner;

//Se importa los paquetes con las variables que se usaran
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
        
        //Se crea un scanner para el ingreso de datos por teclado
        Scanner scan = new Scanner(System.in);
        
       //Ingreso e inicializacion de variables
        double matricula = 1330.00;
        System.out.println("Ingrese la ciudad de la cual es proveniente");
        String ciudad = scan.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese su estado civil (soltero o casado)");
        String estado_civil = scan.nextLine();
        System.out.println("Ingrese la cantidad de cargas familiares");
        int familia = scan.nextInt();
        double descuento;
        double descuento1;
        double descuento2;
        double descuento3;
        double total;
        double valor_con_tramite;
        
        /*
        Uso de condicionales para saber el descuento preciso de acuerdo a las 
        condiciones del estudiante
        */
        
        if (ciudad.equals("Loja") || ciudad.equals("Zamora")){
            descuento = Ciudad.descuento_ciudad;
        } else {
            descuento = 0;
        }
            
        if (edad>=17 || edad<20){
            descuento1 = Edad.descuento_edad;
        } else {
            descuento1 = 0;
        }
        if (estado_civil.equals("casado")){
            descuento2 = EstadoCivil.descuento_civil;
        } else {
            descuento2 = 0;
        }
        if (familia>0){
            descuento3 = CargosFamiliares.descuento_familia;
        } else {
            descuento3 = 0;
        }
        
        //Operacion para calcular el valor total de la matricula
        total = matricula - descuento - descuento1 - descuento2 - descuento3;
        valor_con_tramite = total + (total*0.02);
        
        
        //Mostrar en pantalla el resultado total de la pantalla
        System.out.printf("El costo final de la  matricula es: \n%.2f",
                valor_con_tramite);
        
        
    }
    
}
