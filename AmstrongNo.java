public class Main
{
	public static void main(String[] args) {
		    int i,n,rem,sum=0, cube;
		    n = 371;
		    int org = n;
		    for(i=0;i<3;i++){
		        rem = n%10;
		        cube = rem*rem*rem;
		        sum = sum + cube;
		        n = n/10;
		    }
		    if(org==sum){
		        System.out.println(org+" is an amstrong number.");
		    }
		    else{
		        System.out.println(org+" is not an amstrong number.");
		    }
	}
}
