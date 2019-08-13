public class Three{
	static char[] f(char[] a, int start, int len){
		char[] res = null;
		if(a != null){
			if(len+start <= a.length && start >= 0 && len>=0){
				res = new char[len];
				int counter = 0;
				for(int i=0; i<a.length; i++){
					if(i>=start && counter < len){
						res[counter] = a[i];
						counter++;
					}
				}
			}
		}
		return res;
	}
}