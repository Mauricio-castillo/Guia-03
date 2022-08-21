/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;
import java.util.*;
/**
 *
 * @author jose4
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int Num;
        // Capturamos el numero
        Scanner reader = new Scanner(System.in);
        System.out.print("Digite un numero : ");
        Num = reader.nextInt();
        // Ciclo for
        for (int i=1;i<=10;i++){
            System.out.println(Num + " x " + i + " = " + Num*i);
        }
    }
}
