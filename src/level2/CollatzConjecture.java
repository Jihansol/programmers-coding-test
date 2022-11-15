package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollatzConjecture {

	public double[] solution(int k, int[][] ranges) {
		List<Double> accumulateArea = new ArrayList<Double>();
		accumulateArea.add(0.0D);
		
		int left = k;
		int right = k;
		double areaSum = 0;
		
		while(right != 1) {
			left = right;
			right = conjecture(right);
			double squareArea = calcSquareArea(left, right);
			areaSum += squareArea;
			accumulateArea.add(areaSum);
		}
		
        return Arrays.stream(ranges).map(range -> sumSquareArea(range, accumulateArea))
        		.mapToDouble(i -> i).toArray();
    }

	private double sumSquareArea(int[] range, List<Double> accumulateArea) {
		if(range[1] + accumulateArea.size() <= range[0]) {
			return -1.0d;
		}
		
		return accumulateArea.get(accumulateArea.size() + range[1] -1) - accumulateArea.get(range[0]);
	}

	private int conjecture(int number) {
		if (number % 2 == 0) {
			return number / 2;
		} else {
			return (number * 3) + 1;
		}
	}

	public double calcSquareArea(int left, int right) {
		double squareArea = Math.min(left, right);
		squareArea += (Math.abs(right - left) / (double) 2);
		return squareArea;
	}
}
