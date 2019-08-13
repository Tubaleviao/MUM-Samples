import java.util.Arrays;

public class Execute{
	public static void main(String[] args){
		//one();
		//two();
		//three(); // uncomment the exercise you want to test
		//four();
		//five();
		six();
	}

	public static void six(){
		Six test = new Six();
		int[] t1 = {1,8,3,7,10,2};
		int[] t2 = {1,5,3,1,1,1,1,1,1};
		int[] t3 = {2,1,1,1,2,1,7};
		int[] t4 = {1,2,3};
		int[] t5 = {3,4,5,10};
		int[] t6 = {1,2,10,3,4};
		System.out.println(test.f(t1));
		System.out.println(test.f(t2));
		System.out.println(test.f(t3));
		System.out.println(test.f(t4));
		System.out.println(test.f(t5));
		System.out.println(test.f(t6));
	}

	public static void five(){
		Five test = new Five();
		int[] a1 = {1,8,3,2}, b1 = {4,2,6,1};
		int[] a2 = {1,8,3,2,6}, b2 = {2,6,1};
		int[] a3 = {1,3,7,9}, b3 = {7,1,9,3};
		int[] a4 = {1,2}, b4 = {3,4};
		int[] a5 = {}, b5 = {1,2,3};
		int[] a6 = {1,2}, b6 = {};
		int[] a7 = {1,2}, b7 = null;
		int[] a8 = null, b8 = {};
		int[] a9 = null, b9 = null;
		System.out.println(Arrays.toString(test.f(a1, b1)));
		System.out.println(Arrays.toString(test.f(a2, b2)));
		System.out.println(Arrays.toString(test.f(a3, b3)));
		System.out.println(Arrays.toString(test.f(a4, b4)));
		System.out.println(Arrays.toString(test.f(a5, b5)));
		System.out.println(Arrays.toString(test.f(a6, b6)));
		System.out.println(Arrays.toString(test.f(a7, b7)));
		System.out.println(Arrays.toString(test.f(a8, b8)));
		System.out.println(Arrays.toString(test.f(a9, b9)));
	}

	public static void four(){
		Four four = new Four();
		int t1 = 1234;
		int t2 = 12005;
		int t3 = 1;
		int t4 = 1000;
		int t5 = 0;
		int t6 = -12345;
		System.out.println(four.reverse(t1));
		System.out.println(four.reverse(t2));
		System.out.println(four.reverse(t3));
		System.out.println(four.reverse(t4));
		System.out.println(four.reverse(t5));
		System.out.println(four.reverse(t6));
	}

	public static void three(){
		Three test = new Three();
		char[] x0 = {'a','b','c'};
		char[] x13 = {};
		System.out.println(Arrays.toString(test.f(x0, 0, 4)));
		System.out.println(Arrays.toString(test.f(x0, 0, 3)));
		System.out.println(Arrays.toString(test.f(x0, 0, 2)));
		System.out.println(Arrays.toString(test.f(x0, 0, 1)));
		System.out.println(Arrays.toString(test.f(x0, 1, 3)));
		System.out.println(Arrays.toString(test.f(x0, 1, 2)));
		System.out.println(Arrays.toString(test.f(x0, 1, 1)));
		System.out.println(Arrays.toString(test.f(x0, 2, 2)));
		System.out.println(Arrays.toString(test.f(x0, 2, 1)));
		System.out.println(Arrays.toString(test.f(x0, 3, 1)));
		System.out.println(Arrays.toString(test.f(x0, 1, 0)));
		System.out.println(Arrays.toString(test.f(x0, -1, 2)));
		System.out.println(Arrays.toString(test.f(x0, -1, -2)));
		System.out.println(Arrays.toString(test.f(x13, 0, 1)));
	}

	public static void two(){
		Two test = new Two();
		int[] x = {1};
		int[] x1 = {1,2};
		int[] x2 = {1,2,3};
		int[] x3 = {1, 2, 3, 4};
		int[] x4 = {3,3,4,4};
		int[] x5 = {3,2,3,4};
		int[] x6 = {4,1,2,3};
		int[] x7 = {1,1};
		int[] x8 = {};
		System.out.println(test.sum(x));
		System.out.println(test.sum(x1));
		System.out.println(test.sum(x2));
		System.out.println(test.sum(x3));
		System.out.println(test.sum(x4));
		System.out.println(test.sum(x5));
		System.out.println(test.sum(x6));
		System.out.println(test.sum(x7));
		System.out.println(test.sum(x8));
	}

	public static void one(){
		One one = new One();
		int[] x = {1,2,3,4,5};
		int[] x1 = {3,2,1,4,5};
		int[] x2 = {3, 2, 1, 4, 1};
		int[] x3 = {1, 2, 3, 4};
		int[] x4 = {};
		int[] x5 = {10};
		System.out.println(one.isCenteredArray(x));
		System.out.println(one.isCenteredArray(x1));
		System.out.println(one.isCenteredArray(x2));
		System.out.println(one.isCenteredArray(x3));
		System.out.println(one.isCenteredArray(x4));
		System.out.println(one.isCenteredArray(x5));
	}
}