import java.util.Arrays;

public class Main
{
    public static int RemoveDuplicateElements(int[] a, int n){
	if(n==0 || n==1){
	 	return n;
	}
        int i;
        int[] t = new int[n];
        int j=0;
        for(i=0; i<n-1; i++){
            if(a[i]!= a[i+1]){
                t[j++]=a[i];
            }
        }
        
        t[j++]=a[n-1];
        
        for(int k=0;k<j;k++){
            a[k]=t[k];
        }
        return j;
    }
    
    
	public static void main(String[] args) {
		int[] arr = {3,1,2,1,4,3,3,5,6,2};
		int n = arr.length;
		Arrays.sort(arr);
		int len = RemoveDuplicateElements(arr, n);
		
		for(int i=0;i<len;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
