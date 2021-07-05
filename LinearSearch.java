public class Main
{
    public static void linearSearch(int[] a, int n, int s){
        int i,flag=0;
        
        for(i=0;i<n;i++){
            if(a[i]==s){
                System.out.println("\nElement "+s+" found at position "+(i+1));
                flag=1;
                break;
            }
        }
        
        if(flag==0){
            System.out.println("Element not found.");
        }
    }
    
	public static void main(String[] args) {
		int[] arr={12,23,44,58,9,71,6};
		int n = arr.length;
		int s = 9;
		linearSearch(arr, n, s);
		
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+"\t");
		}
	}
}
