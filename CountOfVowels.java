public class Main
{
	public static void main(String[] args) {
	    String s1= "malicious";
	    char[] ch = s1.toCharArray();
	    int i, count=0;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
	            count++;
	        }
	    }
	    
	    System.out.println(count);
   }
}