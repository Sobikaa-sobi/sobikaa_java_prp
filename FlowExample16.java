public class FlowExample16{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int rem=0,ans=0;
		while(num>0){
			rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		System.out.println(ans);
	}
}
