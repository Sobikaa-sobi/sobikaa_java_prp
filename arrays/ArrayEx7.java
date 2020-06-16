import java.util.*;
public class ArrayEx7{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		int j = 0; 
        	for (int i=0; i < arr.length-1; i++){  
            		if (arr[i] != arr[i+1]){  
                	arr[j++] = arr[i];  
            		}  
        	}  
        	arr[j++] = arr[arr.length-1];  
        	for (int i=0;i<j;i++){  
           		System.out.print(arr[i]+" ");  
    		}    
	}
}