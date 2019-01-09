
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* Permite lectura desde teclado 
*/
public class Teclado {

	 /**
	* Lee un carácter del teclado
	*/
	 public static char LeeCaracter() {
		char caracter;
		try {
			caracter = LeeCadena().charAt(0);
		} catch( Exception e ) {
			caracter = 0;
		}
		return caracter;
	}
	
	/**
	* Lee una cadena del teclado
	*/
	public static String LeeCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); //Lee una línea de texto (hasta intro)
		} catch( Exception e ) {
			cadena = "";
		}
		return cadena;
	}
	
	/**
	* Lee un entero del teclado
	*/
	public static int LeeEntero() {
		int x;
		try {
			x = Integer.parseInt(LeeCadena().trim()); //Quita los espacios del String y convierte a int
		} catch( Exception e ) {
			x = 0;
		}
		return x;
	}
	
	/**
	* Lee un decimal del teclado
	*/
	public static double LeeDecimal() {
		double x;
		try {
			x = Double.parseDouble(LeeCadena().trim()); //Quita los espacios del String y convierte a double
		} catch( Exception e ) {
			x = 0;
		}
		return x;
	}
}
