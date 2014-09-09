public class verificaDato
{
	public void verificar(int v[], dato)
	int  i, j = 0;
	for (i=0; i<v.lenght-1; i++)
	{
		if (v[i] == dato) 
		{
			System.out.println("Dato repetido...");
			j = j +1;
		}
	}
	if (j != 0)
    {
		System.out.println("El dato se repite:" + j + "veces");
	}
	else
		insertar(dato);
}