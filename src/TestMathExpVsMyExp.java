import org.junit.Test;
import org.junit.Assert;

public class TestMathExpVsMyExp {
	int x = 3;
	int n = 20;
	
	@Test
	public void testMathExpVsMyExp(){
		Assert.assertEquals(Math.exp(x), myexp.main(x,n), 0.00000001 );
	}
}