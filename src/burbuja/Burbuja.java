/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbuja;

import java.util.Scanner;

/**
 * @author JUAN DAVID  REYES CORTES 
 * @version 1.0, 3/03/2017
 * 
 */
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        int arreglo[]= new int[20];
        /**
         * En temporal se guarda momentaneamente el arreglo
         */
        int tamaño,i,j,temporal;
        System.out.println("Ingrese le tamaño del arreglo ");
        tamaño=entrada.nextInt();
        //Este for leera los elemtos del arreglo
        for(i=0;i<tamaño;i++){
            System.out.print("posicion["+(i+1)+"]= ");
            arreglo[i]=entrada.nextInt(); }
        for(i=0;i<tamaño;i++){
            for(j=i+1;j<tamaño;j++){
                //La condicion evalua cada valor y los organiza
                if(arreglo[i]>arreglo[j]){
                    temporal=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;}
            }
        //Se imprime el arreglo organizado y sus posiciones
        System.out.print("El arreglo ordenado es = ");
        for(i=0;i<tamaño;i++){
            System.out.print(arreglo[i]+" ");
        } 
    } 
  }    
}
