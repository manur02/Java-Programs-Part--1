public class Main
{
    static int factorial(int n){
       if(n==0){
           return 1;
       } 
       else{
            n= n* factorial(n-1);
       }
       return n;
    }
	public static void main(String[] args) {
	    int n = 10;
	    int f = factorial(n);
	    System.out.println(f);
	}
}


//Recursion is a technique of making a function call itself.