package org.example.ejercicios;

public class CalcularAreaTriangulo3 {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo", 5.0, 4.0);

		double valorAreaTriangulo = 0D;
		valorAreaTriangulo = 0.5 * triangulo.getBase() * triangulo.getAltura();

		System.out.println("Altura del triángulo: " + triangulo.getAltura());
		System.out.println("Base del triángulo: " + triangulo.getBase());
		System.out.println("Área del triángulo: " + valorAreaTriangulo);
	}

	record Triangulo(String color, double base, double altura) {
		public double getBase() {
			return base;
		}

		public double getAltura() {
			return altura;
		}
	}
}
