import java.lang.*;


public class Left_Rotation{

	static void left(int[] ar,int n,int k){

		int m = k % n;

		for (int i=0;i < n ; ++i){

		System.out.println(ar[(i + m) % n] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int[] a = {3,4,5,6,7,2};
		int n = a.length;

		int k;
		k = 2;
		left(a,n,k);
	
		k = 3;
		left(a,n,k);
	}
}