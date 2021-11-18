package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 5.27, 6.39);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		print(myObjs);
		copy(myDoubles, myObjs);
		print(myObjs);
	}

	public static void copy(List<? extends Number> source, List<? super Number> target) {
		for (Number num: source) {
			target.add(num);
		}
	}
	
	public static void print(List<?> list) {
		for (Object obj: list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
