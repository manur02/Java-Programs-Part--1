public class Main
{
    public static void binarySearch(int[] a, int n, int s){
        int lb = 0;
        int ub = n-1;
        int mid = (lb+ub)/2;
        
        while (lb<=ub){
            
            if(a[mid]<s){
                lb= mid+1;
            }
            else if(a[mid]==s){
                System.out.println(s+" found at position "+(mid+1));
                break;
            }
            else{
                ub = mid-1;
            }
            
            mid=(lb+ub)/2;
        }
        
    }
    
	public static void main(String[] args) {
	    int[] arr = {1,12,32,45,63,67,77,91};
	    int n = arr.length;
	    int s = 77;
	    binarySearch(arr, n, s);
	}
}




//alternate method

import java.util.Arrays;  
public class Main
{
    
	public static void main(String[] args) {
	    int[] arr = {1,12,32,45,63,67,77,91};
	    int s = 77;
	    int result = Arrays.binarySearch(arr, s);
	    if(result<0){
	        System.out.println("Element not found");
	    }
	    else{
	        System.out.println("Element found at position "+(result+1));
	    }
	}
}
