import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //Comprobacio de Objeto MetodoPAago
        MetodoPago pg1 = new MetodoPago(4556,"Transferencia");
        System.out.println(pg1.toString());
        //Comprobacion de onnjeto Material
        Material material1 = new Material(7785,"Cuero");
        System.out.println(material1.toString());


        //Comprobacion de Departamento
        Departamento dpto1 = new Departamento(8558,"RRHH");
        System.out.println(dpto1.toString());

        //Metodo crear departamento insertando datos desde consola
        Departamento depto = Departamento.crearDepartamento();
        System.out.println(depto.toString());

    }
}
