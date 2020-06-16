import java.util.*;
public class ArrayEx5{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		System.out.println("Largest num 1:"+arr[arr.length-1]+"		"+"Largest num 2:"+arr[arr.length-2]);
		System.out.println("Smallest num 1:"+arr[0]+"	"+"Smallest num 2:"+arr[1]);
	}
}