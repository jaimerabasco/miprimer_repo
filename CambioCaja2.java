/**
* 
* @author Lourdes Magarín
* @version 1.0
*/
public class CambioCaja2 {
	/**
	* Calcula el cambio que debe dar la caja de un supermercado. 
	* Dado un precio y una cantidad de dinero, el resultado será el número de monedas 
	* que deben darse como cambio de tal forma que el número total de monedas sea mínimo.
	*/
	public static void main(String[] args) {
		double [][] monedas = {{200, 100, 50, 10, 2, 1}, //las distintas monedas (euros y céntimos)
								{0, 0, 0, 0, 0, 0}};//almacenarán el número de monedas
							
		double cantidad = 0;
		int i = 0;//comenzaré comparando con la moneda mayor (2 euros)
		
		System.out.println("\nDame una cantidad en euros. Te diré el total de monedas que tienes que entregar (el mínimo): ");
		cantidad = Teclado.LeeDecimal();
		cantidad = cantidad * 100;
		System.out.println("\nCantidad introducida: " + cantidad);
		
		do{
			if (monedas[0][i]<=cantidad){
				monedas[1][i] += 1;
				cantidad -= monedas[0][i];
				}
			else 
				i++;//paso a la siguiente moneda más pequeña
			System.out.println("Cantidad = " + cantidad/100);
		}while(cantidad != 0);
		
		
		for (i = 0; i<monedas[0].length; i++)
			System.out.println("Monedas de " + monedas[0][i] / 100 +" euros: "+ (int)monedas[1][i]);
	}

}
