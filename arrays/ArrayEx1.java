public class ArrayEx1{
	public static void main(String args[]){
		int arr[]={3,7,4,8};
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		avg=sum/(arr.length);
		System.out.println(sum+" , "+avg);
	}
}