
public class ordenamientos {

		private void intercambiaDatos(int []v, int i, int j){
			int aux;
			aux= v[i];
			v[i] = v[j];
			v[j] = aux;
			}
		
		public void sortIntercambiar(int []v){
			int i, j;
			for (i=0;i<v.length-1 ;i++ ) {
				for (j=i+1;j<v.length-1 ;j++ ) {
					if (v[i]<v[j]) {
						intercambiaDatos(v,i,j);
					}
				}
			}
		}
		public void sortSeleccion(int []v){
			int i,j,im;
				for (i=0;i<v.length-1 ;i++ ) {
					im =i;
				for (j=i+1;j<v.length ;j++ ) {
					if (v[im]>v[j]) 
					im=j;
				}
					if (i != im) 
					intercambiaDatos(v,i,im);
			}
		}
	}
