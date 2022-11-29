package interfaz;

import java.util.LinkedList;
import java.util.Scanner;

import Logica.Cafes;
import Logica.Ventas;

public class Main {

	

	public static void main(String[] args) {
		Cafes cafe1 =new Cafes("Latte",1.50);
		Cafes cafe2 =new Cafes("Flat White",2.50);
		Cafes cafe3 =new Cafes("Lágrima",1.30);
		Cafes cafe4 =new Cafes("Expresso",1.00);
		
		LinkedList<Ventas> venta = new LinkedList<Ventas>();
		int ve=0; 
			
			System.out.println();
		int flag=1;
		while(flag!=0) {
			@SuppressWarnings("resource")
			Scanner aux = new Scanner(System.in);
			Menu();
			ve++;
			int res= aux.nextInt();
			if (res==0) {
			flag=0;
		}else if (res!=0) {
			
			
			switch (res) {
			case 1:
				System.out.println("Cuantos cafe de este tipo va a querer?");
				int cant= aux.nextInt();
				double costo=1.50;
				
				costo= costo*cant;
				System.out.println("¿Tiene la Tarjeta Socio para el descuento \n?");
				System.out.println("1-Si");
				System.out.println("2-No \n");
				int desc= aux.nextInt();
	              if (desc==1) {
	            	  
	            	  costo= costo-(costo*0.15);
	            	  venta.add(new Ventas(ve,cafe1,cant,true,costo));
					
				  }if (desc==2) {
					  venta.add(new Ventas(ve,cafe1,cant,false,costo));
						
					}
				  System.out.println("Listo su pedido fue realizado con exito \n");
				  System.out.println("-----------------------------------------------------------------\n");
				
				break;
	        case 2:
	        	System.out.println("Cuantos cafe de este tipo va a querer?");
				int cant1= aux.nextInt();
				double costo1=2.50;
				
				costo1= costo1*cant1;
				System.out.println("¿Tiene la Tarjeta Socio para el descuento \n?");
				System.out.println("1-Si");
				System.out.println("2-No \n");
				int desc1= aux.nextInt();
	              if (desc1==1) {
	            	  
	            	  costo1= costo1-(costo1*0.15);
	            	  venta.add(new Ventas(ve,cafe2,cant1,true,costo1));
					
				  }if (desc1==2) {
					  venta.add(new Ventas(ve,cafe2,cant1,false,costo1));
						
					}
				  System.out.println("Listo su pedido fue realizado con exito \n");
				  System.out.println("-----------------------------------------------------------------\n");
				
				break;
	        case 3:
	        	
	        	System.out.println("Cuantos cafe de este tipo va a querer?");
				int cant2= aux.nextInt();
				double costo2=1.30;
				
				costo2= costo2*cant2;
				System.out.println("¿Tiene la Tarjeta Socio para el descuento \n?");
				System.out.println("1-Si");
				System.out.println("2-No \n");
				int desc2= aux.nextInt();
	              if (desc2==1) {
	            	  
	            	  costo2= costo2-(costo2*0.15);
	            	  venta.add(new Ventas(ve,cafe3,cant2,true,costo2));
					
				  }if (desc2==2) {
					  venta.add(new Ventas(ve,cafe3,cant2,false,costo2));
						
					}
				  System.out.println("Listo su pedido fue realizado con exito \n");
				  System.out.println("-----------------------------------------------------------------\n");
				
				break;
	        case 4:
	        	System.out.println("Cuantos cafe de este tipo va a querer?");
				int cant3= aux.nextInt();
				double costo3=1.00;
				
				costo3= costo3*cant3;
				System.out.println("¿Tiene la Tarjeta Socio para el descuento \n?");
				System.out.println("1-Si");
				System.out.println("2-No \n");
				int desc3= aux.nextInt();
	              if (desc3==1) {
	            	  
	            	  costo3= costo3-(costo3*0.15);
	            	  venta.add(new Ventas(ve,cafe4,cant3,true,costo3));
					
				  }if (desc3==2) {
					  venta.add(new Ventas(ve,cafe4,cant3,false,costo3));
						
					}
				  System.out.println("Listo su pedido fue realizado con exito \n");
				  System.out.println("-----------------------------------------------------------------\n");
				
				break;
				

			default:
				break;
			}
			
		}
			
			
		}
		int opt=1;
		while(opt!=0) {
			Scanner aux2 = new Scanner(System.in);
			Cajero();
			int caj=aux2.nextInt();
			switch (caj) {
			case 1:
				MostrarVentas(venta);
				break;
            case 2:
				cafeMasvendido(venta);
				break;
            case 3:
            	reacudacionTotal(venta);
				break;
            case 4:
            	VentasDescuento(venta);
				break;
            case 5:
            	eliminarVenta(venta);
				break;

			default:
				break;
			}
			System.out.println("Para salir ingrese Cero y para volver al inicio ingrese Uno \n");
			
			int exit=aux2.nextInt();
			if (exit==0) {
				opt=0;
				
			}
			System.out.println("------------------------------------------\n");
			
		}
		
		
		
			
		

	}
	
	public static void Menu() {
		
		System.out.println("Bienvenido a Coffe Time");
		System.out.println("--------------------------");
		System.out.println("Abajo vera los tipos de cafe para pedir: \n");
		System.out.println("1-Latte:      $1,50");
		System.out.println("2-Flat White: $2,50");
		System.out.println("3-Lagrima:    $1,30");
		System.out.println("4-Expresso:   $1,00");
		
		System.out.println("Para salir ingrese la opcion cero(0) \n");
		
		
		
	}
	public static void Cajero() {
		System.out.println("Elija la opcion que desea ver: \n");
		System.out.println("1-Ver ventas realizadas");
		System.out.println("2-Ver que tipo de cafe se vendio mas");
		System.out.println("3-Ver recaudacion Total");
		System.out.println("4-Ver ventas con descuento");
	}
	
	public static void MostrarVentas(LinkedList<Ventas> venta) {
		for (Ventas ventas : venta) {
			System.out.println("ID: "+ventas.getId_venta()+"\n" +"Tipo de cafe: "+ventas.getCafe().getTipoCafe()+"\n"+ "cantidad: "+ventas.getCantidad()+"\n"+ "Tarjeta Socio: "+ventas.isTarjetaSocio()+"\n"+ "Monto final: "+ ventas.getMontofinal()+ "\n");
		}
		
	}
	public static void cafeMasvendido(LinkedList<Ventas> venta) {
		int can=0;
		int can1=0;
		int can2=0;
		int can3=0;
		for (Ventas ventas : venta) {
			
			if (ventas.getCafe().getTipoCafe().equalsIgnoreCase("Latte")) {
				
				can= can+ventas.getCantidad();
				
			}else if (ventas.getCafe().getTipoCafe().equalsIgnoreCase("Flat White")) {
				
				can1= can1+ventas.getCantidad();
				
			}else if (ventas.getCafe().getTipoCafe().equalsIgnoreCase("Lagrima")) {
				
				can2= can2+ventas.getCantidad();
				
			}else if (ventas.getCafe().getTipoCafe().equalsIgnoreCase("Expresso")) {
				
				can3= can3+ventas.getCantidad();
				
			}
			
		}
		if (can>can1 && can>can2 && can>can3) {
			System.out.println("El tipo de cafe que se vencio mas es el Late con : "+can +" ventas");
				
	  }else if (can1>can2 && can1>can3) {
		  System.out.println("El tipo de cafe que se vencio mas es el Flat White con : "+can1 +" ventas");
		
	 }else if (can2 > can3 ) {
		 System.out.println("El tipo de cafe que se vencio mas es el Lagrima  con : "+can2 +" ventas");
		
	}else {
		System.out.println("El tipo de cafe que se vencio mas es el Expresso con : "+can3 +" ventas");
	}
	}
	public static void reacudacionTotal(LinkedList<Ventas> venta) {
		double recau=0;
		for (Ventas ventas : venta) {
			recau= recau+ventas.getMontofinal();
		}
		System.out.println("La recaudacion final es de: "+recau);
		
	}
	public static void VentasDescuento(LinkedList<Ventas> venta) {
		for (Ventas ventas : venta) {
			if (ventas.isTarjetaSocio()==true) {
				System.out.println("ID: "+ventas.getId_venta()+"\n" +"Tipo de cafe: "+ventas.getCafe().getTipoCafe()+"\n"+ "cantidad: "+ventas.getCantidad()+"\n"+ "Tarjeta Socio: "+ventas.isTarjetaSocio()+"\n"+ "Monto final: "+ ventas.getMontofinal()+ "\n");
				
			}
		}
	}
	public static void eliminarVenta(LinkedList<Ventas> venta) {
		@SuppressWarnings("resource")
		Scanner aux3 = new Scanner(System.in);
		System.out.println("Ingrese el ID de la venta que desea eliminar");
		int remov=aux3.nextInt();
		for (Ventas ventas : venta) {
			if (ventas.getId_venta()==remov) {
				System.out.println("Elimino la venta de ID: " + remov);
				venta.remove(venta.indexOf(ventas));
				
			}
		}
		
	}

}
