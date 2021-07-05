public class Main{
    
    static void BubbleSort(int[] a, int n)
    {
        int i,j,temp, flag=0;
        //for iteration or passes i.e. n-1
        for(i=0;i<n-1;i++){
            
            //for comparisions between adjacent values
            //n-1-i is used so as avoid unnecessary comparisions
            
            for(j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    //Swapping
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
        //flag is used so as to check if the array is already sorted
            if(flag==0){
                break;
            }
        }
    }
    
    //display function
    static void display(int[] a, int n){
        for(int i=0;i<n; i++){
            System.out.print(a[i]+"\t");
        }
    }
    
    //all the functions are made static because the main method
    //is static and it can access only static methods and variables
    //non static variable cannot be referenced from a static context in Java
    
    public static void main(String []args){
        
        int n;
        int[] arr = {14,2,65,9,22};
        n=arr.length;
        System.out.println("\nBefore Sorting:");
        display(arr,n);     
        System.out.println("\nAfter Sorting:");
        BubbleSort(arr,n);
        display(arr,n);  
    }
    
}