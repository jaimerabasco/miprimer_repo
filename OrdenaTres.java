/**
* Ordena tres números enteros introducidos por teclado y  los muestra por pantalla de forma decreciente.
* @author Lourdes 
* @version 1.0
*/
public class OrdenaTres {
	public static void main(String[] args) {
		int num1, num2, num3; 
		
		System.out.println("Dame un entero: ");
		num1 = Teclado.LeeEntero();
		
		System.out.println("Dame otro entero: ");
		num2 = Teclado.LeeEntero();
		
		System.out.println("Dame el último entero: ");
		num3 = Teclado.LeeEntero();
		
		if (num1 < num2)
			if (num1 < num3)
				if (num2 < num3)
					System.out.println(num1 + "  " + num2 + "  " + num3 );
				else 
					System.out.println(num1 + "  " + num3 + "  " + num2 );
			else
				System.out.println(num3 + "  " + num1 + "  " + num2  );
			
		else //num2<num1
			if (num2 < num3 )
				if (num3 < num1)
					System.out.println(num2 + "  " + num3 + "  " +  num1 );
				else
					System.out.println(num2 + "  " + num1 + "  " +  num3 );
			else
				System.out.println(num3 + "  " + num2 + "  " +  num1 );
		
		
	}
}
