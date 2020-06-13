public class FlowExample13{
	public static void main(String args[]){
		int count;
		for(int num=10;num<=99;++num){
			count=0;
			for(int i=2;i<=num/2;++i){
				if(num%i==0){
					count++;
					break;
				}
				}
			if(count==0){
				System.out.print("\t"+num);
				}
		}
		
	}
}