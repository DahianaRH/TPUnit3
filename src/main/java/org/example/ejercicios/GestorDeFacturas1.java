package org.example.ejercicios;

import java.util.List;

public class GestorDeFacturas1 {
	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

		double valorTotal1 = calcularValorTotal(factura1);
		double valorTotal2 = calcularValorTotal(factura2);

		System.out.println(retornarDetallesFactura("Factura 1", factura1, valorTotal1));
		System.out.println(retornarDetallesFactura("Factura 2", factura2, valorTotal2));
	}

	record Factura(String cliente, String fechaFactura, List<Double> precioProducto) {
	}
	private static double calcularValorTotal(Factura factura) {
		double valorTotal = 0;
		for (Double precio : factura.precioProducto) {
			valorTotal += precio;
		}
		return valorTotal;
	}

	private static String retornarDetallesFactura(String titulo, Factura factura, double valorTotal) {
		String detallesFactura = "\n"+titulo + "\n\tCliente: " + factura.cliente()+ "\n\tTotal: " + valorTotal;
		return detallesFactura;
	}

}
