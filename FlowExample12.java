public class FlowExample12{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int count=0;
		for(int i=2;i<=num;i++)
			if(num%i==0){
				count++;
			}
		if(count==1){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}