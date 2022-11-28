package interfaz;

import java.util.ArrayList;
import java.util.LinkedList;

import Logica.Cafes;
import Logica.Ventas;

public class Main {

	public static void main(String[] args) {
		Cafes cafe1 =new Cafes("Latte",1.50);
		Cafes cafe2 =new Cafes("Flat White",2.50);
		Cafes cafe3 =new Cafes("Lágrima",1.30);
		Cafes cafe4 =new Cafes("Expresso",1.00);
		
		
		
		LinkedList<Ventas> venta = new LinkedList<Ventas>();
		int flag=1;
		while(flag!=0) {
			
			venta.add(new Ventas(1,cafe1,1,true));
		}
		
		
		
			
		

	}

}
