/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio2;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        double suma, x, y;
	suma = 0;
	x = 20;
	suma = suma + x;
	y = 40;
	x = x + Math.pow(y, 2);
	suma = suma + x / y;
	System.out.println("El valor de suma es: " + suma);
    }
}
