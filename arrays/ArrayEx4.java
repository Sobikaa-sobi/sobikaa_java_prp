public class ArrayEx4{
	public static void main(String args[]){
		int arr[]={65,97,66,100};
		char ch[]=new char[arr.length];
		for(int i=0;i<arr.length;i++){
			ch[i]=(char)arr[i];
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(ch[i]+" ");
		}
	}
}
		