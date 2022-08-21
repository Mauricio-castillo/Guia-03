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
public class Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int cant, numero, negativo = 0, positivo = 0;
        System.out.println("Digite 10 como cantidad para calcular : ");
        cant = reader.nextInt();
        
        if (cant==10){
            for (int i=1;i<=cant;i++){
            System.out.print("Ingrese un numero : ");
            numero = reader.nextInt();
            if (numero<0){
                negativo++;
            }
            else{
                if (numero>0){
                    positivo++;
                }
            }
        }
        System.out.println("La cantidad de numeros negativos es : " + negativo);
        System.out.println("La cantidad de numeros negativos es : " + positivo);
        }
        else{
            System.out.println("La cantidad que digito no es igual a 10");
            System.out.println("Por favor digite el numero 10.");
        }
    }
}
