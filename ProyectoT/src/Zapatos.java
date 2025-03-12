import java.util.Objects;

public class Zapatos extends Accesorio {
    private int tallaZapatos;

    private String tipoSuela;

    public Zapatos(String codigoArticulo, String nombre, float precio, String marca, String descripcion, String imagen, Material material, boolean activo, String estilo, boolean esPersonalizado, int tallaZapatos, String tipoSuela) {
        super(codigoArticulo, nombre, precio, marca, descripcion, imagen, material, activo, estilo, esPersonalizado);
        this.tallaZapatos = tallaZapatos;
        this.tipoSuela = tipoSuela;
    }

    public int getTallaZapatos() {
        return tallaZapatos;
    }

    public void setTallaZapatos(int tallaZapatos) {
        this.tallaZapatos = tallaZapatos;
    }

    public String getTipoSuela() {
        return tipoSuela;
    }

    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

    public void mostrarDetalles(){
        System.out.println(getNombre() + "tengo una talla : " + getTallaZapatos() + " y una suela " + getTipoSuela());
    }

    @Override
    public String toString() {
        return "Talla: " + tallaZapatos + ", Tipo de suela: " + tipoSuela;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Zapatos zapatos = (Zapatos) o;
        return tallaZapatos == zapatos.tallaZapatos && Objects.equals(tipoSuela, zapatos.tipoSuela);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tallaZapatos, tipoSuela);
    }
}