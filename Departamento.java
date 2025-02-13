import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Departamento {

    //ATRIBUTOS
    private int id;
    private String nombre;

    //CONSTRUCTOR
    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


 //Funcion crear apartamento

    public static Departamento crearDepartamento(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el id de departamento: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre del departamento: ");
        String nombre = scanner.nextLine();

        return new Departamento(id, nombre);


    }




    //TOSTRING
    @Override
    public String toString() {
        return

                "Departamento: "+id+ '\n' +"Nombre: "+nombre;
    }
    //GETTER Y SETTER
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }

    //EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return id == that.id && Objects.equals(nombre, that.nombre);
    }
    //HASH
    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }



    //contruir el constructor


}
