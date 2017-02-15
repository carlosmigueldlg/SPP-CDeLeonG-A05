/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a05;
import java.util.Scanner;
/**
 *
 * @author CarlosMiguel De Leon Garcia IMA A01410399
 */
public class SPPCDeLeonGA05 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
    solicitaPalabra(" una Cadena");
    solicitaNumero(" un numero Double");
    solicitarLong(" un numero Long");
    solicitarCaracter(" un caracter ");
    }
    static String solicitaPalabra(String dato){
     Scanner kb= new Scanner(System.in);
        String a = "";
        boolean flag;
        do{
            System.out.println("Introduce "+ dato );
            try{
               a=kb.nextLine();
               flag=true;
            } catch (Exception C) {
               flag=false;
               System.out.println("Esto no es una cadena " + C);
            kb.nextLine();
            }
       }while(flag==false);
        return a;
    }
    static double solicitaNumero(String mensaje){
     Scanner kb= new Scanner(System.in);
        double numero = 0;
        boolean flag;
        do{
            System.out.println("Introduce " +mensaje);
            try{
               numero=kb.nextDouble();
               flag=true;
            } catch (Exception C) {
               flag=false;
               System.out.println("El numero insertado no es un double " +C);
            kb.nextLine();
            }
       }while(flag==false);
        return numero;
    }
    static long solicitarLong(String dato){
        Scanner kb= new Scanner(System.in);
        long numero = 0;
        boolean flag;
        do{
            System.out.println("Introduce "+ dato);
            try{
               numero=kb.nextLong();
               flag=true;
            } catch (Exception C) {
               flag=false;
               System.out.println("El numero insertado no es un long number " +C);
               kb.nextLine();
            }
       }while(flag==false);
        return numero;
    }
    static char solicitarCaracter(String dato){
        Scanner kb= new Scanner(System.in);
        char i = 0;
        boolean flag;
        do{
            System.out.println("Introduce "+ dato);
            try{
               i=kb.next().charAt(0);
               flag=true;
            } catch (Exception C) {
               flag=false;
               System.out.println("Esto no es un solo un caracter " +C);
               kb.nextLine();
            }
       }while(flag==false);
        return i;
    }
    }