public class ArrayEx12{
	public static void main(String args[]){
		int arr[]=new int[6];
		int arr1[]=new int[3];
		int arr2[]=new int[3];
		int ans[]=new int[2];
		for(int i=0;i<6;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		for(int i=0;i<3;i++){
			arr1[i]=arr[i];
		}
		int k=0;
		for(int i=3;i<6;i++){
			arr2[k++]=arr[i];
		}
		int j=0;
		for(int i=0;i<3;i++){
			ans[j]=arr1[1];
			ans[j+1]=arr2[1];
		}
		for(int i=0;i<2;i++){
			System.out.print(ans[i]+" ");
		}
}
}