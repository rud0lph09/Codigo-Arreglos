public class menu{
	
	public static int desplegarMenu(String texto, int maxopc){
		int opcion;
		do{
			opcion = Teclado.entero(texto);
			if (opcion<1 || opcion>maxopc) {
				System.out.println("Error al elegir, vuelve a elegir alguna opción");				
											} 
				return opcion;
			}while (opcion<1 || opcion>maxopc); 
		}
	}