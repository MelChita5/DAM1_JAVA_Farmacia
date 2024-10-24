package actividadUND3_1;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		Direccion direccion = new Direccion("Madrid", "c/xxx", "1B", "3� Derecha", "A");
		Farmacia farmacia = new Farmacia ("FarmaciaXXXX", direccion);	
		
		ProductoOral oral1 = new ProductoOral(1, "Paracetamol", 2.00 , 1, "mg", LocalDate.of(2030, 12, 5), false, 400);
		ProductoOral oral2 = new ProductoOral(2, "Ibuprofeno", 1.00, 2, "mg", LocalDate.of(2036, 02, 15), false, 600 );
		ProductoOral oral3 = new ProductoOral(3, "Naproxeno", 1.50, 1, "mg", LocalDate.of(2046, 07, 24), false, 500 );
		ProductoOral oral4 = new ProductoOral(4, "Eutirox", 7.50, 1, "mg", LocalDate.of(2040, 01, 04), false, 800 );
		ProductoOral oral5 = new ProductoOral(5, "Fero-Gradumet", 11.50, 1, "mg", LocalDate.of(2048, 01, 14), false, 105 );
	
		farmacia.getProductosOrales().add(oral1);
        farmacia.getProductosOrales().add(oral2);
        farmacia.getProductosOrales().add(oral3);
        farmacia.getProductosOrales().add(oral4);
        farmacia.getProductosOrales().add(oral5); 
		
		ProductoTopico topico1 = new ProductoTopico (6, "Crema Antiarrugas", 5.00, 1, "ml", LocalDate.of(2025, 07, 24), "15M", "Crema", "cara" );
		ProductoTopico topico2 = new ProductoTopico (7, "Shampoo Anticaspa", 7.50, 1, "ml", LocalDate.of(2030, 07, 24), "12M", "Solucion", "cuero cabelludo" );
		ProductoTopico topico3 = new ProductoTopico (8, "Balsamo Cherry", 1.50, 1, "ml", LocalDate.of(2025, 07, 24), "24M", "Balsamo", "labios" );
		
		farmacia.getProductosTopicos().add(topico1);
	    farmacia.getProductosTopicos().add(topico2);
	    farmacia.getProductosTopicos().add(topico3);
	    
	    // creamos un arraylist para almacenar los productos que el comprador desea
	    ArrayList<ProductoGeneral> carrito = new ArrayList<>();
		
		int opcion1 = 0;
		
		// organizacion con el bucle while
		while (opcion1 != 3) {
			
			System.out.println("1.- Ver Productos\n"
					+ "2.- Comprar Productos\n"
					+ "3.- Salir"
					);
			
			int opcion2 = scanner.nextInt();
			
			switch (opcion2) {
			
			case 1:

				
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.println("Productos Orales:" + "\n");
				
				// bucle for each, recorre el arraylist de los productos orales que se encuentra en Farmacia
				// e imprime los datos esenciales
				for (ProductoOral productoOral : farmacia.getProductosOrales()) {
		            System.out.println("Id: " + productoOral.getId() + "\n"
		            					+ "Nombre: " + productoOral.getNombre() + "\n"
		            					+ "Precio: " + productoOral.getPrecio() + "\n");
		        }
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
				System.out.println("Productos Topicos:" + "\n");
				
				
				// bucle for each, recorre el arraylist de los productos topicos que se encuentra en Farmacia
				// e imprime los datos esenciales
				
				for (ProductoTopico productoTopico : farmacia.getProductosTopicos()) {
                    System.out.println("ID: " + productoTopico.getId() + "\n"
                    		+ "Nombre: " + productoTopico.getNombre() + "\n"
                    		+ "Precio: " + productoTopico.getPrecio() + "\n");
                }
					
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");	
				break;
				
				
			case 2:
				
				
				System.out.println("ID del producto que deseas comprar: \n");
				
                int opcion3 = scanner.nextInt();
                
                // numero diferente que 0 porque solo los ids son desde el 1
                if (opcion3 != 0) {
                	
                	// buscamos un producto en la farmacia por su id, que es la opcion ingresada
                	// se llama a producto general porque ahi se almacena el id de los orales y topicos
                    ProductoGeneral producto = buscarProducto(farmacia, opcion3);
                	
                    
                    // si se encuentra el producto, osea no es nulo
                    if (producto != null) {
                    	
                    	// se agregara al arraylist creado anterirmente
                        carrito.add(producto);
                        System.out.println("Producto agregado al carrito.\n");
                        
                    } else {
                        System.out.println("ERROR, producto no valido\n");
                    }
                }
                
				
				break;
				
				default:
					System.out.println("ERROR, opcion no disponible");
					break;
					
			
			}
				
				// inicializamos una variable, en la cual se sumaran los precios de los producyos elegidos
				double precioTotal = 0;
				
				System.out.println("---------------------------------");
		        System.out.println("|    Ticket de Compra:");
		        
		        // reccore el arraylsit carrito
		        for (ProductoGeneral producto : carrito) {
		        	
		            System.out.println("|    Id: " + producto.getId() + "\n"
		            				+ "|    Nombre: " + producto.getNombre() + "\n"
		            				+ "|    Precio: " + producto.getPrecio() + "\n");
		            
		            // con la variable precio total se sumaran los precisos totales de todo el carrito
		            precioTotal += producto.getPrecio();
		        }
		        
		        System.out.println("|    Precio Total: " + precioTotal + "€");
		        System.out.println("---------------------------------\n");
			}
		}
	
		// como usamos una variable para buscar en farmacia el array de productosgenerales y encontrar el id
		// utilizo el private static para practicar lo que no entendi en clase, ademas 
		// en producto general buscamos un producto, y buscando en farmacia los productos con el id colocado
		private static ProductoGeneral buscarProducto(Farmacia farmacia, int id) {
			
			// for each para recorrern los productos orales
	        for (ProductoOral productoOral : farmacia.getProductosOrales()) {
	        	
	        	// si el id colocado por el usuario es igual a un id de los orales
	            if (productoOral.getId() == id) {
	            	
	            	// retornamo al producto oral, el cual sera guardado en el carrito
	                return productoOral;
	            }
	        }
	        
	        for (ProductoTopico productoTopico : farmacia.getProductosTopicos()) {
	            if (productoTopico.getId() == id) {
	                return productoTopico;
	            }
	        }
	        
	        return null; 
	        
		
	}
	
	

}
