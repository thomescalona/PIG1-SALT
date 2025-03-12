import java.util.Objects;

public class Material {
    private int id;
    private String descripcion;



    //CONSTRUCTOR
    public Material(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Material: " + id +'\n'+ "Descripcion: " + descripcion;
    }
    //GETTER Y SETTER
    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return id == material.id && Objects.equals(descripcion, material.descripcion);
    }
    //HASH
    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion);
    }




}