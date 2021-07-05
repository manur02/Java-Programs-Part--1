public class Main
{
	public static void main(String[] args) {
		int i, flag=0, n;
		n= 29;
		
		for(i=2;i<n;i++){
		    if(n%i==0){
		        flag=1;
		        break;
		    }
		}
		
		if(flag==0){
		    System.out.println(n+" is prime.");
		}
		else{
		    System.out.println(n+" is not prime.");
		}
		
	}
}
