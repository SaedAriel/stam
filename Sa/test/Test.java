import static org.junit.Assert.*;


public class Test {

	@org.junit.Test
	public void test() {
		A a=new A();
		//System.out.println(a.Rec1(5));
		String ExpectedOutput="543210";
		String ActualOutput=a.Rec1(5);
		assertEquals(ExpectedOutput, ActualOutput);

	}
@org.junit.Test(timeout=1)
public void test2(){
assertEquals(15, A.Rec2(50));
	
}
}
