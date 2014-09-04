public class arregloEnteros {

	//Atributos
	private int []arreglo;
	private int indice;

	//constructores
	public arregloEnteros (int max) 
	{
		arreglo = new int [max];
		
		indice= -1;
	}


public void insertar(int dato) //Int solo se modifica
{
	System.out.println("s");
	indice++;
	arreglo[indice] = dato;
}
public boolean validaEspacio()
{
	return (indice < arreglo.length-1);
}
public void listar(int pos)
{
	int i;
	for (i=0;i<= indice ;i++ )
		/*indice representa el ultimo dato del arreglo */
	 {
		System.out.println(arreglo[i]);
	}
}
public int buscarDato(int dato)
{
	int i;
	for (i=0;i<=arreglo.length-1 ;i++) {
		if (dato==arreglo[i]) 
		{
			System.out.println(i);
			return i;
		}
	}
    return -1;
}
public void actualizar(int pos)
{
	arreglo[pos]=Teclado.entero("Dame un nuevo valor: ");
}
public int borrar(int pos){
	if (pos > -1 && pos<=arreglo.length) {
	int dato = arreglo[pos];
	arreglo[pos]=arreglo[indice];
	indice --;
	return indice;
}
return -1;
}
}


//Tarea#2 modificar los algoritmos que tengamos 
//para que no solo funcione con la primera ocurrencia
// sino que trabaje ya con todas las ocurrencias de un dato
//jueves 28-agosto




//Tarea #3 hacer una plantilla de entreros pero
//para numeros ordenados donde no se permite dupolicidad 
//de información, con el menú del test. Equipo de 3 personas 
//se entrega 4 de septiemnbre.