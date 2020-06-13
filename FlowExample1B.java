public class FlowExample1B{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int num1=Integer.parseInt(args[1]);
		lastDigit(num,num1);
		}
		static void lastDigit(int n, int n1){
			int l1=n%10;
			int l2=n1%10;
			if(l1==l2){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
} 