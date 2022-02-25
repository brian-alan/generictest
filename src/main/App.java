package main;

import java.util.ArrayList;

import implementation.IOperations;

public class App {

	public static void main(String[] args) {
		IOperations operations = new IOperations();
		operations.addValue(10);
		operations.addValue(2);
		operations.addValue(5);
		operations.addValue(4.2);
		operations.addValue(0.5);
		operations.addValue(11);
		operations.addValue(12.60);
		operations.addValue(9.71);
		operations.addValue(3.14);
		System.out.println("Valor maximo de arreglo de clase: " + operations.maxValue());
		System.out.println("Valor minimo de arreglo de clase: " + operations.minValue());
		
		ArrayList<Number> otraLista = new ArrayList<Number>();
		otraLista.add(7.19);
		otraLista.add(9.07);
		otraLista.add(10.10);
		otraLista.add(6.54);
		System.out.println("Valor maximo de otro arreglo: " + operations.maxValue(otraLista));
		System.out.println("Valor minimo de otro arreglo: " + operations.minValue(otraLista));
		
		try {
			System.out.println("Producto de dos indices: " + operations.product(0, 10));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Valor fuera del rango permitido");
		}
		
		try {
			System.out.println("Producto de dos indices: " +  operations.product(0, 1));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Valor fuera del rango permitido");
		}
		
		try {
			System.out.println("Suma de dos indices: " + operations.product(0, 10));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Valor fuera del rango permitido");
		}
		
		try {
			System.out.println("Suma de dos indices: " +  operations.sum(0, 1));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Valor fuera del rango permitido");
		}
		
		try {
			System.out.println("Factorial de numero 2(posicion 1): " +  operations.factorial(1));
			System.out.println("Factorial de numero 5(posicion 2): " +  operations.factorial(2));
			System.out.println("Factorial de numero 4(posicion 3): " +  operations.factorial(3));
			System.out.println("Factorial fuera de posiciones: " +  operations.factorial(100));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Valor fuera del rango permitido");
		}
		
		operations.primeNumbers();
		
	}

}
