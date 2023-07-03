/*
 Buscar un elemento en un arreglo ordenado
 */
package video86;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Video86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[],numero;
        boolean creciente = true;
        
        arreglo = new int[10];
        
        do{
            System.out.println("Rellene el arreglo: ");
            for (int i=0;i<10;i++){
                System.out.print(i+". Digite un numero: ");
                arreglo[i] = teclado.nextInt();
            }
            // Verificar que el arreglo está ordenado
            for (int i=0;i<9;i++){
                if(arreglo[i]<arreglo[i+1]){
                    creciente=true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente==false){
                System.out.println("\nEl arreglo está desordenado, digite nuevamente: \n");
            }
        }while(creciente==false);
        
        // Pedimos el número a buscar
        System.out.print("\nDigite el numero a buscar en el arreglo: ");
        numero= teclado.nextInt();
        
        // Buscamos el numero en el arreglo
        int i=0;
        
        while(i<10 && arreglo[i]<numero){
            i++;
        }
        if(i==10){
            System.out.println("\nNumero no encontrado");
        }
        else {
            if(arreglo[i]==numero){
                System.out.println("\nNumero encontrado en la posicion: "+i);
            }
            else{
                System.out.println("\nNumero no encontrado");
            }
        }
    }
    
}
