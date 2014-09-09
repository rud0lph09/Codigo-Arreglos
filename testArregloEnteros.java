public class testArregloEnteros{
	
	public static void inicia() {
	
		//variables locales
	arregloEnteros miarreglo;
	int dato, opcion, max, pos=1;
	max = Teclado.entero("Tamaño del arreglo:");
	miarreglo = new arregloEnteros(max);
	
	do {
		opcion = menu.desplegarMenu("1)insertar\n2)Listar\n3)Buscar\n4)Actualizar\n5)Borrar\n6)Ordenar\n7)Salir\n",9);
		switch (opcion) {
			case 1: if (miarreglo.validaEspacio()) {
				dato = Teclado.entero("Dato: ");
				verificaDato.verificar(miarreglo, dato);
			}
			else {
				System.out.println("Error:...");
			}
			break;
			case 2: 
			miarreglo.listar(pos);
			break;
			case 3: dato = Teclado.entero("Dame dato a buscar: ");
			pos = miarreglo.buscarDato(dato);
			if (pos != -1) {
				miarreglo.listar(pos);
			}
			else {
				System.out.println("Error: No existe el dato "+ dato);
			}
			break;
			case 4: pos = miarreglo.buscarDato(Teclado.entero("Dato a buscar: "));
			if (pos!= -1) {
				miarreglo.actualizar(pos);}
				else{
					System.out.println("Error: No existe el dato");
				}
			break;	
			case 5:
			miarreglo.borrar(miarreglo.buscarDato(Teclado.entero("Dato a borrar")));
			break;				
			}}while(opcion !=7); 
	
	}
}