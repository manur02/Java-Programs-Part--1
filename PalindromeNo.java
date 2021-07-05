public class Main
{
	public static void main(String[] args) {
		    int i,n,rem, rev=0, cube;
		    n = 454;
		    int org = n;
		    while(n!=0){
		        rem = n%10;
		        rev = rev*10 + rem;
		        n=n/10;
		    }
		    if(org==rev){
		        System.out.println(org+" is a palindrome.");
		    }
		    else{
		        System.out.println(org+" is not a palindrome.");
		    }
	}
}
