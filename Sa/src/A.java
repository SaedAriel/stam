
public class A {

	public static String Rec1(int n) {
		if(n==0)
			return Integer.toString(n);
		else
			return Integer.toString(n)+Rec1(n-1); 
		
	}
	public static int Rec2(int n) {
		if(n==0)
			return (n);
		else
			return (n)+Rec2(n-1); 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Good Morning!");
		
	}

}
