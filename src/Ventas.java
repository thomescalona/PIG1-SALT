package com.iescamp.PROYECTO;

import java.util.ArrayList;

public class Ventas {
    private ArrayList<Pedido> listaPedidos;

    // Constructor
    public Ventas() {
        this.listaPedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
        System.out.println("Pedido agregado: " + pedido.getNumeroPedido());
    }

    public void eliminarPedido(int numeroPedido) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNumeroPedido() == numeroPedido) {
                listaPedidos.remove(pedido);
                System.out.println("Pedido con número " + numeroPedido + " eliminado.");
                return;
            }
        }
        System.out.println("No se encontró el pedido con número " + numeroPedido);
    }

    public void listarPedidos() {
        if (listaPedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        } else {
            System.out.println("Lista de pedidos:");
            for (Pedido pedido : listaPedidos) {
                pedido.mostrarPedido();
                System.out.println("-------------------------");
            }
        }
    }

    public int obtenerTotalPedidos() {
        return listaPedidos.size();
    }

    public int obtenerPedidosPorEstado(Enums.EstadoPedido estado) {
        int contador = 0;
        for (Pedido pedido : listaPedidos) {
            if (pedido.getEstado() == estado) {
                contador++;
            }
        }
        return contador;
    }

    // Buscar por código de pedido
    public Pedido buscarPedido(int numeroPedido) {
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNumeroPedido() == numeroPedido) {
                return pedido;
            }
        }
        return null; // Si no se encuentra el pedido
    }

    // Filtrar por cliente
    public ArrayList<Pedido> filtrarPorCliente(String nombreCliente) {
        ArrayList<Pedido> pedidosCliente = new ArrayList<>();
        for (Pedido pedido : listaPedidos) {
            if (pedido.getNombreCliente().equalsIgnoreCase(nombreCliente)) {
                pedidosCliente.add(pedido);
            }
        }
        return pedidosCliente;
    }

    // Calcular precio de venta total de un pedido
    public double calcularPrecioVenta(int numeroPedido) {
        Pedido pedido = buscarPedido(numeroPedido);
        if (pedido != null) {
            return pedido.calcularTotal(); // Suponiendo que la clase Pedido tenga un método calcularTotal()
        }
        return 0.0;
    }
}
