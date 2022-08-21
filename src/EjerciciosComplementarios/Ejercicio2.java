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
public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int x = 0, y = 0;
        int cuad1 = 0, cuad2 = 0, cuad3 = 0, cuad4 = 0;
        int cant = 0;
        System.out.print("Cuantos puntos procesara : ");
        cant = reader.nextInt();
        //ciclo for 
        for (int i=1;i<=cant;i++){
            System.out.print("Digite la coordenada x : ");
            x = reader.nextInt();
            System.out.print("Digite la coordenada y : ");
            y = reader.nextInt();
            if (x>0 && y>0){
            cuad1++;
            System.out.println("La cantidad de puntos que se han ingresado en el primer cuadrante es: " + cuad1);
            }
            else{
                if (x<0 && y>0){
                    cuad2++;
                    System.out.println("La cantidad de puntos que se han ingresado en el segundo cuadrante es: " + cuad2);
                }
                else{
                    if (x<0 && x<0){
                        cuad3++;
                        System.out.println("La cantidad de puntos que se han ingresado en el tercer cuadrante es: " + cuad3);
                    }
                    else{
                        if (x>0 && y<0){
                            cuad4++;
                            System.out.println("La cantidad de puntos que se han ingresado en el cuarto cuadrante es: " + cuad4);
                        }
                    }
                }
            }
        } 
    }
}
