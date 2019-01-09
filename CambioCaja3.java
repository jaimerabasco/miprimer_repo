import java.text.*;
/**
* Esta clase muestra c�mo realizar bucles
* @author Lourdes Magar�n
* @version 1.0
*/
public class CambioCaja3 {
	/**
	* Calcula el cambio que debe dar la caja de un supermercado. 
	* Dado un precio y una cantidad de dinero, el resultado ser� el n�mero de monedas 
	* que deben darse como cambio de tal forma que el n�mero total de monedas sea m�nimo.
	*/
	public static void main(String[] args) {
		DecimalFormat RedondearADos = new DecimalFormat("####,##");
		double [][] monedas = {{2, 1, 0.50, 0.10, 0.02, 0.01}, //las distintas monedas (euros y c�ntimos)
								{0, 0, 0, 0, 0, 0}};//almacenar�n el n�mero de monedas
							
		double cantidad = 0;
		int i = 0;//comenzar� comparando con la moneda mayor (2 euros)
		
		System.out.println("\nDame una cantidad en euros. Te dir� el total de monedas que tienes que entregar (el m�nimo): ");
		cantidad = Teclado.LeeDecimal();
		System.out.println("\nCantidad introducida: " + cantidad);
		
		do{
			if (monedas[0][i]<=cantidad){
				monedas[1][i] += 1;
				cantidad -= Double.parseDouble(RedondearADos.format(monedas[0][i]));
				}
			else 
				i++;//paso a la siguiente moneda m�s peque�a
			System.out.println("Cantidad = " + cantidad);
		}while(cantidad != 0);
		
		
		for (i = 0; i<monedas[0].length; i++)
			System.out.println("Monedas de " + monedas[0][i] +" euros: "+ monedas[1][i]);
	}

}
