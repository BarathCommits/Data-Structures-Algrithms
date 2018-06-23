import java.lang.*;

public class Reversal_Algorithm{

	static void left(int Arr[],int d){
	
		int n = Arr.length;
		reverse(Arr,0,d-1);
		reverse(Arr,d,n-1);
		reverse(Arr,0,n-1);
		
		}
		
	static void right(int Arr[],int d){
		
		int n = Arr.length;
		if(d < n){
			d = n - d;
			}
		else{System.out.println("The value of d:"+d+"is greater than the value of n:"+n);}
			
		reverse(Arr,d,n-1);
		reverse(Arr,0,d-1);
		reverse(Arr,0,n-1);
		
		}
	static void reverse(int Arr[],int Start,int End){
		
		int temp;
		while(Start < End){
		
			temp = Arr[Start];
			Arr[Start] = Arr[End];
			Arr[End] = temp;
			Start ++;
			End --;
		}
	
	}
		
	static void printArray(String input,int Arr[]){
		int n = Arr.length;
		System.out.println(input);
		for(int i = 0;i < n;i++){
			System.out.println(Arr[i]+" ");
		}
	}

	public static void main(String[] args){
	
		int[] Arr = {1,2,3,4,5,6,7,8,9,0};
		String input = "Original";
		printArray(input,Arr);
		int d = 3;		
		
		left(Arr,d);
		input = "Reversed";
		printArray(input,Arr);
		
		right(Arr,d);
		input = "Rereversed";
		printArray(input,Arr);
		
	}
}