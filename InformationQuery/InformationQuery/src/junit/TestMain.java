package junit;


import java.util.Random;

import org.junit.Test;

public class TestMain {
	@Test
	public void testMain(){
		Random fromIndex = new Random(11);
		for (int i = 0; i < 300; i++) {
			if (fromIndex.nextInt(11)<0) {
				System.out.println("cuowu 1");
			}
			if (fromIndex.nextInt(11)>10) {
				System.out.println("cuowu 2");
			}
		}
	}

}
