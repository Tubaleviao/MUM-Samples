public class Five{

	public static int[] f(int[] a, int[] b){
		int[] res = null;
		int qtd = 0;
		if(a!=null && b!=null){
			for(int i=0; i<a.length; i++){
				for(int j=0; j<b.length; j++){
					if(a[i] == b[j]){
						qtd++;
					}
				}
			}
			res = new int[qtd];
			int in = 0;
			for(int i=0; i<a.length; i++){
				for(int j=0; j<b.length; j++){
					if(a[i] == b[j]){
						res[in] = a[i];
						in++;
					}
				}
			}
		}
		return res;
	}

}