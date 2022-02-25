package implementation;

import java.util.ArrayList;

import interfaces.Operations;

public class IOperations implements Operations<Number, ArrayList<Number>>{
	
	private ArrayList<Number> array;
	
	public IOperations() {
		array = new ArrayList<Number>();
	}
	
	public void addValue(Number add) {
		array.add(add);
	}
	

	@Override
	public Number product(int index, int index2) {
		Float v1 = array.get(index).floatValue();
		Float v2 = array.get(index2).floatValue();
		return v1 * v2;
	}
	
	public Number maxValue() {
		if(!array.isEmpty()) {
			Float max = array.get(0).floatValue();
			for(int i = 0; i<array.size(); i++) {
				if(max<array.get(i).floatValue()) {
					max = array.get(i).floatValue();
				}
			}
			return max;
		}
		return null;
	}

	@Override
	public Number maxValue(ArrayList<Number> collection) {
		if(!collection.isEmpty()) {
			Float max = collection.get(0).floatValue();
			for(int i = 0; i<collection.size(); i++) {
				if(max<collection.get(i).floatValue()) {
					max = collection.get(i).floatValue();
				}
			}
			return max;
		}
		return null;
	}
	
	public Number minValue() {
		if(!array.isEmpty()) {
			Float min = array.get(0).floatValue();
			for(int i = 0; i<array.size(); i++) {
				if(min>array.get(i).floatValue()) {
					min = array.get(i).floatValue();
				}
			}
			return min;
		}
		return null;
	}

	@Override
	public Number minValue(ArrayList<Number> collection) {
		if(!collection.isEmpty()) {
			Float min = collection.get(0).floatValue();
			for(int i = 0; i<collection.size(); i++) {
				if(min>collection.get(i).floatValue()) {
					min = collection.get(i).floatValue();
				}
			}
			return min;
		}
		return null;
	}

	@Override
	public Number sum(int index, int index2) {
		Float v1 = array.get(index).floatValue();
		Float v2 = array.get(index2).floatValue();
		return v1 + v2;
	}
	
	public int factorial(int index) {
		return calculateFactorial(array.get(index).intValue());
	}
	
	private int calculateFactorial(int value) {
		if (value>1) {
			return value * calculateFactorial(value-1);
		}
		return 1;
	}
	
	public void primeNumbers() {
		for(int i = 0; i < array.size(); i++) {
			int x = array.get(i).intValue();
			boolean bandera = true;
			if(x == 0 || x == 1) {
				bandera = false;
			}
			for(int j = 2; j < x; j++) {
				if (x%j == 0) {
					bandera = false;
				}
			}
			if(bandera) {
				System.out.println(x + " es primo");
			}
		}
	}

}
