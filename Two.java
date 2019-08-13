public class Two{
	public static int sum(int[] arr){
		int evens = 0;
		int odds = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 == 0){ // even
				evens += arr[i];
			}else{
				odds += arr[i];
			}
		}
		return odds - evens;
	}
}