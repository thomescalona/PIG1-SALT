import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date fechaPedido;
    private EstadoPedido estado; // Cambia el tipo de String a EstadoPedido
    private String direccEntrega;
    private ArrayList<LineaPedido> LineaPedido;

    public Pedido(int numeroPedido, Date fechaPedido, EstadoPedido estado, String direccEntrega) {
        this.numeroPedido = numeroPedido;
        this.fechaPedido = fechaPedido;
        this.estado = estado; // Acepta un valor de tipo EstadoPedido
        this.direccEntrega = direccEntrega;
        this.LineaPedido = new ArrayList<>();
    }

    // Métodos setter y getter para el estado
    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public String getDireccEntrega() {
        return direccEntrega;
    }

    // Modificar el método para mostrar el estado como un valor de enum
    public void mostrarPedido(){
        System.out.println("Numero de pedido: " + getNumeroPedido());
        System.out.println("Fecha de pedido: " + getFechaPedido());
        System.out.println("Estado: " + getEstado()); // Esto mostrará el nombre del estado del enum
        System.out.println("Dirección de entrega: " + getDireccEntrega());
    }
}