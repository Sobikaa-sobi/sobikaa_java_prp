import java.util.*;
public class ArrayEx14 {
	public static void main(String args[]){
    	int len=args.length;
    	int arr[][] = new int[3][3];
    	if(len<9){
    		System.out.println("Please enter 9 integer numbers");
    	}
    	else{
        int k=0;
    	for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
            		arr[i][j]=Integer.parseInt(args[k]);
        		k++;
        		}
        	}
    	System.out.println("The given array is :");
    	for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		System.out.print(arr[i][j]+" ");
        	}
        System.out.println();
        }
	int max=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(arr[i][j]>max){
					max=arr[i][j];
				}
				else{
					max=max;
				}
			}
		}
	System.out.println("The biggest number in the given array is : "+max);
		
	}
   }
}