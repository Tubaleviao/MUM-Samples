public class Four{
	public static int reverse(int i){
		int res = 0;
		int new_i = i;
		while(Math.abs(new_i)>=10){
			res += new_i%10;
			new_i = new_i/10;
			res = res*10;
		}
		res += new_i;
		return res;
	}
}