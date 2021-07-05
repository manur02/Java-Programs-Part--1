public class Main{
    
    public static void insertionSort(int[] a, int n){
        
        int i,j,temp;
        //unsorted part is from a[1] to a[n] and sorted part is a[0]
        for(i=1;i<n;i++){
            //store the value of a[1] in temp
            temp=a[i];
            // j is decremented so as to obtain the sorted part
            j=i-1;
            while(j>=0 && temp<a[j]){
                a[j+1]=a[j];
                j--;
            }
            //store the value in the correct place
            a[j+1]=temp;
        }
    }
    
    
    public static void display(int[] a, int n){
        for(int i=0;i<n; i++){
            System.out.print(a[i]+"\t");
        }
    }
    
    
    public static void main(String []args){
        int n;
        int[] arr={91,23,44,7,1,5};
        n=arr.length;
        display(arr,n);
        insertionSort(arr, n);
        System.out.println("\n");
        display(arr,n);
        
    }
}