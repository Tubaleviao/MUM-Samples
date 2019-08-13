public class Six{
	public static int f(int[] a){
		int res = -1;
		int firstSum = 0;
		for(int i=0; i<a.length; i++){
			firstSum += a[i];
			int secondSum = 0;
			for(int j=i+2; j<a.length; j++){
				secondSum += a[j];
			}
			if(firstSum == secondSum){
				res = i+1;
			}
		}
		return res;
	}
}