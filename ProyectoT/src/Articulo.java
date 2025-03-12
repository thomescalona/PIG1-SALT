import java.util.ArrayList;
import java.util.Objects;

public class Articulo {
    private String codigoArticulo;
    private String nombre;
    private float precio;
    private String marca;
    private String descripcion;
    private String imagen;
    private Material material;
    private boolean activo;


    private ArrayList<Articulo> articulos = new ArrayList<>();

    public Articulo(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, Material material, boolean activo) {
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.material = material;
        this.activo = activo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Float.compare(precio, articulo.precio) == 0 && activo == articulo.activo && Objects.equals(codigoArticulo, articulo.codigoArticulo) && Objects.equals(nombre, articulo.nombre) && Objects.equals(marca, articulo.marca) && Objects.equals(descripcion, articulo.descripcion) && Objects.equals(imagen, articulo.imagen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoArticulo, nombre, precio, marca, descripcion, imagen, activo);
    }

    @Override
    public String toString() {
        return "Código: " + codigoArticulo + ", Nombre: " + nombre + ", Precio: " + precio +
                ", Marca: " + marca + ", Descripción: " + descripcion + ", Imagen: " + imagen +
                ", Activo: " + activo;
    }

    // MWTODOSSSSSSSSSSS

    public Articulo buscarPorCodigo(String codigo) {
        for (Articulo a : articulos) {
            if (a.getCodigoArticulo().equals(codigo)) {
                return a;
            }

        }
        System.out.println("Este articulo con este codigo no existe");
        return null;
    }

    public Articulo filtrarPorArticulo (Articulo articulo){
        for (Articulo a: articulos){
            if (a instanceof Ropa){
                System.out.println(a);
                return  a;
            } else if (a instanceof Accesorio) {
                System.out.println(a);
                return a;

            } else {
                System.out.println("Este articulo no existe");

            }

        }
        return null;
    }

    public Articulo filtrarPorAritculo(Articulo articulo){
        for (Articulo a: articulos){
            if (a.activo){
                return  a;
            } else{
                System.out.println("Articulo no activo");
            }

        }
        return null;
    }

    // filtrar por material
    public Articulo filtrarPorArticulo(Material material){
        for (Articulo a: articulos){
            if (a.material.equals(material)){
                System.out.println(a);
                return a;
            } else {
                System.out.println("Este articulo no tiene este material");
            }

        }
        return null;
    }



}
