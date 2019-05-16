import static org.junit.jupiter.api.Assertions.*;

public class Test {

	@org.junit.jupiter.api.Test
	public void forBreakTest() {

		forBreak();
	}
	
	@org.junit.jupiter.api.Test
	public void whileBreakTest() {
		whileBreak();
	}
	
	@org.junit.jupiter.api.Test
	public void forContinueTest() {
		forContinue();
	}
	
	@org.junit.jupiter.api.Test
	public void whileContinueTest() {
		whileContinue();
	}	
	
	@org.junit.jupiter.api.Test
	public void returnTest() {
		hap(32.2, 25.3);
	}
	
	public void forBreak() {
		int num = 0;
		
		for(;;) {
			num++;
			
			System.out.println(num);
			
			if(num == 100) {
				break;
			}
		}
	}
	
	public void whileBreak() {
		int num = 0;
		
		while(true) {
			num++;
			
			System.out.println(num);
			
			if(num == 100) {
				break;
			}
		}
	}
	
	public void forContinue() {

		for(int i = 0; i<10; i++) {
			if(i == 3) {
				System.out.println(i);
				continue;
			}else {
				break;
			}			
		}
	}
	
	public void whileContinue() {
		int num = 0;
		
		while(true) {
			num++;
			
			System.out.println(num);
			
			if(num == 124) {
				break;
			}
			else {
				continue;
			}
		}
	}
	
	public double hap(double a, double b) {

		
		double sum = a * b / 3;
		
		System.out.println(sum);
		
		return sum;
	}
}
