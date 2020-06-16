public class ArrayEx3{
	public static void main(String args[]){
		int arr[]={3,7,4,8};
		int count=0,index=0;
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				count++;
				index=i;
				break;
				
			}
			else{
				count=0;
			}
		}
		if(count==0){
			System.out.println(-1);
		}
		else{
			System.out.println(index);
		}
	}
}