public class FlowExample15{
	public static void main(String args[]){
		int len=args.length;
		if(len>0){
		int i,j;
		int n=Integer.parseInt(args[0]); 
		for(i=1;i<=n;i++) 
            	{           
            	for(j=1;j<=i;j++) 
            	{       
                	System.out.print("*  "); 
            	}           
            		System.out.println(); 
           	} 
		}
		else{
			System.out.println("Please enter an integer number");
		}
	}
}
			