import java.math.BigDecimal;

/**
* Muestra errores con decimales
*
* @author Lourdes Magarín
* @version 1.0
*/
public class ErrorDecimales {
	/**
	* Realiza la suma 5.01 + 0.02; el resultado no da 5.03, sino 5.029999999999999
	* COSAS DE LA MÁQUINA VIRTUAL, ya se traten los números como: double, class Double o class BigDecimal.
	* Sólo va con float.
	*/
	public static void main(String[] args) {
		double x, y, z;
		
		x = 5.01;
		y = 0.02;
		z = x + y;
		System.out.println("\nEl resultado de "+x+" + "+y+" = "+z + "(double)");
		
		BigDecimal x1, y1, z1;
		
		x1 = new BigDecimal(5.01);
		y1 = new BigDecimal(0.02);
		z1 = new BigDecimal(0.0);
		
		z1 = x1.add(y1);
		System.out.println("\nEl resultado de "+x1+" + "+y1+" = "+ z1+ "(class BigDecimal)");
		
		Double x2, y2, z2;
		
		x2 = new Double(5.01);
		y2 = new Double(0.02);
		z2 = new Double(0.0);
		
		z2 = x2 + y2;
		System.out.println("\nEl resultado de "+x2+" + "+y2+" = "+ z2+ "(class Double)");
		
		float x3, y3, z3;
		
		x3 = 5.01f;
		y3 = 0.02f;
		z3 = x3 + y3;
		System.out.println("\nEl resultado de "+x3+" + "+y3+" = "+z3 + "(float)");
	}

}
