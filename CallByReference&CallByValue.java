public class Main
{
	public static void main(String[] args) {
		
		int l = 20;
		func1(l);
		System.out.println(l);
		
		shape s1 = new shape();
		s1.length = 10;
		s1.func2(s1);
		System.out.println(s1.length);
		
	}
	
	 public static void func1(int len){
	     len = 98;
        System.out.println(len);
    }
}

class shape{
    int length;
    int breadth;
    
    public void func2(shape s2){
        s2.length = 56;
        System.out.println(s2.length);
    }
}