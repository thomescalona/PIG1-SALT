import java.util.Objects;

public class LineaPedido {
    private int cod_art;
    private Articulo articulo;   // Relación con la clase Articulo
    private Pedido pedido;       // Relación con la clase Pedido
    private int cantidad;        // Cantidad del artículo en el pedido

    // Constructor

    public LineaPedido(int idLinea, Articulo articulo, Pedido pedido, int cantidad) {
        this.idLinea = idLinea;
        this.articulo = articulo;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        if (articulo == null) {
            throw new IllegalArgumentException("El artículo no puede ser nulo.");
        }
        this.articulo = articulo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("El pedido no puede ser nulo.");
        }
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
        }
        this.cantidad = cantidad;
    }

    // Método para mostrar los detalles de la línea de pedido
    public void mostrarDetalles() {
        System.out.println("Artículo: " + articulo.getNombre() + " - Cantidad: " + cantidad);
    }

    // Método para mostrar los detalles en un formato similar a los otros objetos
    @Override
    public String toString() {
        return "- Línea de Pedido -\n" +
                "\tArtículo    : " + articulo.getNombre() + "\n" +
                "\tCantidad    : " + cantidad + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineaPedido that = (LineaPedido) o;
        return idLinea == that.idLinea && cantidad == that.cantidad && Objects.equals(articulo, that.articulo) && Objects.equals(pedido, that.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLinea, articulo, pedido, cantidad);
    }
}