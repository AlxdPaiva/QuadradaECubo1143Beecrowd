/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadradaecubo1143beecrowd;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class QuadradaECubo1143Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();   

        
            for (int i = 1; i <= N; i++) {
                int quadrado = i * i;
                int cubo = i * i * i;
                System.out.println(i + " " + quadrado + " " + cubo);
            }
            
}
}
