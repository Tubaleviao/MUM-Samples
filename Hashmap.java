import java.util.HashMap;

public class Hashmap{
	public static void main(String[] args){
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Savanah");
		map.put(2, "Ashlie");
		map.put(3, "Jodi");
		map.put(4, "Danieli");
		map.put(5, "Carol");

		System.out.println(map.toString());
		System.out.println(map.get(2));
		System.out.println(map.remove(4));
		System.out.println(map.toString());
		System.out.println(map.size());
	}
}