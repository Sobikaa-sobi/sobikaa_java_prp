public class ArrayEx10{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		int temp[]=new int[args.length];
		int j=0;
		for(int i=0;i<args.length;i++){
			if(arr[i]%2==0){
				temp[j++]=arr[i];
				}
		}
		for(int i=0;i<args.length;i++){
			if(arr[i]%2!=0){
				temp[j++]=arr[i];
				}
		}
		
		for(int k=0;k<args.length;k++){
			System.out.print(temp[k]+" ");
		}
	}
}