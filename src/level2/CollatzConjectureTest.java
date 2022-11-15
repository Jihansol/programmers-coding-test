package level2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CollatzConjectureTest {
	CollatzConjecture collatzConjecture = new CollatzConjecture();
	@Test
	void test1() {
		double squareArea =  collatzConjecture.calcSquareArea(5, 16);
		assertEquals(10.5D, squareArea);
	}

	@Test
	void test2() {
		double squareArea =  collatzConjecture.calcSquareArea(16, 8);
		assertEquals(12, squareArea);
	}
	
	@Test
	void testSolution() {
		int[][] ranges = {{0,0}, {0,-1}, {2, -3}, {3, -3}};
		double[] squareArea = collatzConjecture.solution(5, ranges);
		double[] expected = {33.0, 31.5, 0.0, -1.0};
		assertArrayEquals(expected, squareArea);
	}
}
