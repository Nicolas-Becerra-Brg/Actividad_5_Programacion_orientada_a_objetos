package actividad_cuadro_circulo;

import java.util.Scanner;

public class Imprimir {

	 public static void main(String[] args) {
	        
	       Scanner scan = new Scanner(System.in);
	       int respuesta;
	       String numero;
	       int opcion2;
	       
	       while (true) {
	            
	           System.out.println("1. Escriba 1 si quiere calcular el cuadrado");
	           System.out.println("2. Escriba 2 si quiere calcular el circulo");
	           System.out.println("3. Escriba 3 si quiere salir");
	           respuesta = scan.nextInt();
	           
	           switch (respuesta) { 
	           
	           case 1: 
	        	   System.out.println("Ingrese la medida del lado");
	        	   Scanner scann = new Scanner(System.in);
	        	   numero= scann.nextLine();
	        	   String res = numero;
	        	   int medida = Integer.parseInt(res);
	        	   Cuadrado c_1 = new Cuadrado(medida);
	        	   System.out.println("La longitud del lado es " + c_1.x);
	        	   while (true) {
	        	   System.out.println("1. Escriba 1 para calcular la diagonal");
	        	   System.out.println("2. Escriba 2 para calcular el perimetro");
	        	   System.out.println("3. Escriba 3 para calcular el area");
	        	   System.out.println("4. Escriba 4 para salir");
	        	   opcion2= scan.nextInt();
	        	
	        	   switch (opcion2) {
	        
	        	   case 1:
	        		   System.out.println("La diagonal es: "+c_1.diagonal());
	        		   break;
	        	   case 2:
	        		   System.out.println("El perimetro es: "+c_1.perimetro());
	        		   break;
	        	   case 3:
	        		   System.out.println("El area es: "+c_1.area());
	        		   break;
	        	   case 4:
	        		   System.out.println("Saliendo...");
	        		   System.exit(0);
	        		   default:
	        			   System.out.println("Ingrese valor correcto");
	        	   }
	        	  
	        	 }
	           case 2: 
	        	   System.out.println("Ingrese la medida del radio?");
	        	   Scanner scan_2 = new Scanner(System.in);
	        	   numero= scan_2.nextLine();
	        	   String med = numero;
	        	   int medida_2 = Integer.parseInt(med);
	        	   Circulo circulo_1 = new Circulo(medida_2);
	        	   System.out.println("La longitud del radio es " + circulo_1.x);
	        	   while (true) {
	        	   System.out.println("1. Escriba 1 para calcular la circunferencia");
	        	   System.out.println("2. Escriba 2 para calcular el area");
	        	   System.out.println("3. Escriba 3 para salir");
	        	   opcion2= scan.nextInt();
	        	
	        	   switch (opcion2) {
	        	  
	        	   case 1:
	        		   System.out.println("La circunferencia es: "+circulo_1.circunferencia());
	        		   break;
	        	   case 2:
	        		   System.out.println("El area es: "+circulo_1.area());
	        		   break;
	        	   case 3:
	        		   System.out.println("Saliendo...");
	        		   System.exit(0);
	        		   default:
	        			   System.out.println("Ingrese valor correcto");
	        	   }
	        	  
	        	 }
	           case 3:
	        	   System.out.println("Saliendo...");
	    		   System.exit(0);
	        	   
	        	   default:
	        		   System.out.println("Inggrese valor correcto");
	        	         	 
	      }
	}
	}
	}
