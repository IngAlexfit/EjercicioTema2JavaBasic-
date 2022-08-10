/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema3javabasic;

/**
 *
 * @author Ing_Puello
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] valores={"coco","carkis","federico","marcos"};
       String cadena="";
        for (String i : valores) {
                cadena += i+" ";
            }
        
        System.out.println("valores concatenados: "+cadena);
    }
    
}
