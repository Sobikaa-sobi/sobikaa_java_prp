public class ArrayEx8{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		int sum=0;
		o:
		for(int i=0;i<args.length;i++){
			if(arr[i]==6){
        		   for (int j=i+1;j<arr.length;j++){
            			if (arr[j]==7){
                			i = j;
					continue o;
            				}
        			}
				
			}
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}