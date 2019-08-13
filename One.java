public class One{
	public static int isCenteredArray(int[] arr){
		int isCentered = 0;
		if(arr.length%2 != 0){
			isCentered = 1;
			int middle = arr.length/2;
			for(int i=0; i<arr.length; i++){
				if(i != middle){
					if(arr[i] <= arr[middle]){
						isCentered = 0;
					}
				}
			}
		}
		return isCentered;
	}
}