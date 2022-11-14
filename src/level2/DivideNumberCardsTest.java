package level2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DivideNumberCardsTest {
	
	DivideNumberCards card_divide = new DivideNumberCards();

	@Test
	void test1() {
		int[] arrayA = {10, 17};
		int[] arrayB = {5, 20};
		
		int resurt = card_divide.solution(arrayA, arrayB);
		assertEquals(0, resurt);
	}

	@Test
	void test2() {
		int[] arrayA = {10, 20};
		int[] arrayB = {5, 17};
		
		int resurt = card_divide.solution(arrayA, arrayB);
		assertEquals(10, resurt);
	}
	
	@Test
	void test3() {
		int[] arrayA = {14, 35, 119};
		int[] arrayB = {18, 30, 102};
		
		int resurt = card_divide.solution(arrayA, arrayB);
		assertEquals(7, resurt);
	}
}
