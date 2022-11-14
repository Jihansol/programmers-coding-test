package level2;

import java.util.Arrays;

public class DivideNumberCards {
	public int solution(int[] arrayA, int[] arrayB) {
        int findedA = findA(arrayA, arrayB);
        int findedB = findA(arrayB, arrayA);
        
        return findedA > findedB ? findedA : findedB;
    }

	private int findA(int[] arrayA, int[] arrayB) {
		int maxRepeat = (int)Math.sqrt(arrayA[0]) + 1;
		
		int maxfindA = 0;
		
		for(int i=1; i<maxRepeat; i++) {
			if(arrayA[0] % i == 0) {
				int localFindA = checkNumberA(arrayA, arrayB, i);
				if(localFindA > maxfindA) {
					maxfindA = localFindA;
				}
				
				localFindA = checkNumberA(arrayA, arrayB, arrayA[0]/i);
				if(localFindA > maxfindA) {
					maxfindA = localFindA;
				}
			}
		}
		
		return maxfindA;
	}

	private int checkNumberA(int[] arrayA, int[] arrayB, int i) {
		if(i == 1)
			return 0;
		if(allArrayDivided(arrayA, i) && allArrayNotDivided(arrayB, i)) {
			return i;
		}
		return 0;
	}

	private boolean allArrayNotDivided(int[] array, int i) {
		return Arrays.stream(array).allMatch(number -> number % i != 0);
	}

	private boolean allArrayDivided(int[] array, int i) {
		return Arrays.stream(array).allMatch(number -> number % i == 0);
	}
}
