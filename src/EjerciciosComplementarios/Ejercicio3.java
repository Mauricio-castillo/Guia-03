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
public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int triangulo = 0;
        int equilatero = 0, isosceles = 0, escaleno = 0;
        int lad1 = 0, lad2 = 0, lad3 = 0;
        //Capturamos el numero de triangulos que el usuario desea consultar
        System.out.print("Digite los triangulos que desea consultar : ");
        triangulo = reader.nextInt();
        //Ciclo for que ejecuta las cantidad de veces que el usuario escogio para consultar los tringulos
        for (int i=1;i<=triangulo;i++){
            System.out.print("Digite la longitud para el lado 1 : ");
            lad1 = reader.nextInt();
            System.out.print("Digite la longitud para el lado 2 : ");
            lad2 = reader.nextInt();
            System.out.print("Digite la longitud para el lado 3 : ");
            lad3 = reader.nextInt();
            //Condicional para saber el tipo de triangulo
            if (lad1==lad2 && lad1==lad3 && lad2==lad3){
                System.out.println("Es un triangulo equilatero");
                equilatero = equilatero + 1;
            } else {
                if (lad1==lad2 || lad1==lad3 || lad2==lad3){
                    System.out.println("Es un triangulo isosceles");
                    isosceles = isosceles + 1;
                } else {
                    if (lad1!=lad2 || lad1!=lad3 || lad2!=lad3){
                        System.out.println("Es un triangulo escaleno");
                        escaleno = escaleno + 1;
                    }
                }
            }
        }
        //Imprimimos la cantidad de triangulos de cada tipo
        System.out.println("Cantidad de triangulos equilateros : " + equilatero);
        System.out.println("Cantidad de triangulos isosceles : " + isosceles);
        System.out.println("Cantidad de triangulos escalenos : " + escaleno);
    }
}
