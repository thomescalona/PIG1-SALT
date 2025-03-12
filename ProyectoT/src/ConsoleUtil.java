import java.time.LocalDate;

public class ConsoleUtil {

    public static MetodoPago crearMetodoPago(){
        System.out.println("Nuevo metodo de Pago: ");

        int id = ConsoleReader.readInt("Inserta el código del metodo de pago");
        String descripcion = ConsoleReader.readString("Inserta la descripcion del Metodo de pago");

        return new MetodoPago(id,descripcion);

    }

    public static Material crearMaterial(){
        System.out.println("Nuevo material: ");


        int id = ConsoleReader.readInt("Dame el código del material");
        String descripcion = ConsoleReader.readString("Dame la descripcion del Metodo de pago");

        return new Material(id,descripcion);
    }

    public static Departamento crearDepartamento(){
        System.out.println("Nuevo departamento: ");

        int id = ConsoleReader.readInt("Dame el codigo del departamento");
        String descripcion = ConsoleReader.readString("Dame la descripcion del repartamento");

        return new Departamento(id,descripcion);
    }

    public static Cliente crearCliente(MetodoPago metodoPago){
        System.out.println("Nuevo cliente: ");

        String dni = ConsoleReader.readString("Inserta el DNI: ");
        String nombre = ConsoleReader.readString("Inserta el nombre: ");
        String apellidos  = ConsoleReader.readString("Inserta los apellidos ");
        String direccion = ConsoleReader.readString("Inserta la direccion: ");
        String telefono = ConsoleReader.readString("Inserta el telefono: ");
        String correoElectronico = ConsoleReader.readString("Iserta el email: ");
        LocalDate fechaNacimiento = LocalDate.parse(ConsoleReader.readString("Inserta la fecha en el formato DD-MM-YYYY: "));
        String pass = ConsoleReader.readString("Inserta la contraseña: ");
        boolean activo =ConsoleReader.readBoolean("Esta activo? ");


        String direccionEnvio = ConsoleReader.readString("Inserta la direccion de envio");
        float saldoCuenta = ConsoleReader.readFloat("Inserta el saldo de cuenta");
        boolean tarjetaFidelidad= ConsoleReader.readBoolean("Dispone de tarjeta de fidelidad? ");
        int numerosPedidosRealizados= ConsoleReader.readInt("Inserta el numero de Pedidos realizados: ");


        return new Cliente(dni,nombre,apellidos,direccion,telefono,correoElectronico,fechaNacimiento,
                pass,activo, direccionEnvio, saldoCuenta,tarjetaFidelidad,numerosPedidosRealizados,metodoPago);
    }

    public static Bolso crearBolso(Material mAterial){
        System.out.println("Creando un nuevo bolso...");


        String codigoArticulo = ConsoleReader.readString("Introduce el código del bolso:");
        String nombre = ConsoleReader.readString("Introduce el nombre del bolso:");
        float precio = ConsoleReader.readFloat("Introduce el precio del bolso:");
        String marca = ConsoleReader.readString("Introduce la marca del bolso:");
        String descripcion = ConsoleReader.readString("Introduce la descripción del bolso:");
        String imagen = ConsoleReader.readString("Introduce la ruta de la imagen del bolso:");


        boolean activo = ConsoleReader.readBoolean("¿El bolso está activo? (true/false):");
        String estilo = ConsoleReader.readString("Introduce el estilo del bolso:");
        boolean esPersonalizado = ConsoleReader.readBoolean("¿El bolso es personalizado? (true/false):");
        String tipoCierre = ConsoleReader.readString("Introduce el tipo de cierre del bolso:");
        int capacidad = ConsoleReader.readInt("Introduce la capacidad en litros del bolso:");

        return new Bolso(
                codigoArticulo, nombre, precio, marca, descripcion, imagen,
                mAterial, activo, estilo, esPersonalizado, tipoCierre, capacidad
        );
    }


    public static Camisa crearCamisa(Material material){
        System.out.println("Creando una nueva camisa...");

        String codigoArticulo = ConsoleReader.readString("Introduce el código de la camisa:");
        String nombre = ConsoleReader.readString("Introduce el nombre de la camisa:");
        float precio = ConsoleReader.readFloat("Introduce el precio de la camisa:");
        String marca = ConsoleReader.readString("Introduce la marca de la camisa:");
        String descripcion = ConsoleReader.readString("Introduce la descripción de la camisa:");
        String imagen = ConsoleReader.readString("Introduce la ruta de la imagen de la camisa:");
        boolean activo = ConsoleReader.readBoolean("La camisa estan en activo? (true/false)");
        int talla = ConsoleReader.readInt("¿Que talla tiene la camisa?");
        String color = ConsoleReader.readString("Introduce el color de la camisa");
        String tipoCierre = ConsoleReader.readString("Introduce el tipo de cierre de la camisa");
        String tipoManga = ConsoleReader.readString("Introduce el tipo de manga que tiene la camisa");
        boolean esEstampada = ConsoleReader.readBoolean("La camisa tiene estampado? (true/false)");

        return new Camisa(codigoArticulo,nombre,precio,marca,descripcion,imagen,material,activo,talla,color,tipoCierre,tipoManga,esEstampada);


    }

    public static Chaqueta crearChaqueta(Material material){

        System.out.println("Creando una nueva chaqueta ");
        String codigoArticulo = ConsoleReader.readString("Introduce el código del bolso:");
        String nombre = ConsoleReader.readString("Introduce el nombre del bolso:");
        float precio = ConsoleReader.readFloat("Introduce el precio del bolso:");
        String marca = ConsoleReader.readString("Introduce la marca del bolso:");
        String descripcion = ConsoleReader.readString("Introduce la descripción del bolso:");
        String imagen = ConsoleReader.readString("Introduce la ruta de la imagen del bolso:");
        boolean activo = ConsoleReader.readBoolean("La camisa estan en activo? (true/false)");
        int talla = ConsoleReader.readInt("¿Que talla tiene la camisa?");
        String color = ConsoleReader.readString("Introduce el color de la chaqueta");
        String tipoCierre = ConsoleReader.readString("Introduce el tipo de cierre que la chaqueta");
        boolean impermeable = ConsoleReader.readBoolean("Introduce si la chauqeta es impermeable (true/flase)");

        return new  Chaqueta(codigoArticulo,nombre,precio,marca,descripcion,imagen,material,activo,talla,color,tipoCierre,impermeable);
    }

    public static Pantalon crearPantalon(Material material){

        System.out.println("Creando una nueva chaqueta ");
        String codigoArticulo = ConsoleReader.readString("Introduce el código del pantalon:");
        String nombre = ConsoleReader.readString("Introduce el nombre del pantalon:");
        float precio = ConsoleReader.readFloat("Introduce el precio del pantalon:");
        String marca = ConsoleReader.readString("Introduce la marca del pantalon:");
        String descripcion = ConsoleReader.readString("Introduce la descripción del pantalon:");
        String imagen = ConsoleReader.readString("Introduce la ruta de la imagen del pantalon:");
        boolean activo = ConsoleReader.readBoolean("El pantalon estan en activo? (true/false)");
        int talla = ConsoleReader.readInt("¿Que talla tiene la camisa?");
        String color = ConsoleReader.readString("Introduce el color del pantalon");
        String tipoCierre = ConsoleReader.readString("Introduce el tipo de cierre que tiene el pantalon");
        boolean tieneBolsillo = ConsoleReader.readBoolean("Tiene bolsillos este pantalon? (true/false)");
        String tipoPantalon = ConsoleReader.readString("Introduce que tipo de Pantalon es");

        return new Pantalon(codigoArticulo,nombre,precio,marca,descripcion,imagen,material,activo,talla,color,tipoCierre,tieneBolsillo,tipoPantalon);

    }

    public static Zapatos crearZapato(Material material){
        System.out.println("Creando una nueva chaqueta ");
        String codigoArticulo = ConsoleReader.readString("Introduce el código del pantalon:");
        String nombre = ConsoleReader.readString("Introduce el nombre del pantalon:");
        float precio = ConsoleReader.readFloat("Introduce el precio del pantalon:");
        String marca = ConsoleReader.readString("Introduce la marca del pantalon:");
        String descripcion = ConsoleReader.readString("Introduce la descripción del pantalon:");
        String imagen = ConsoleReader.readString("Introduce la ruta de la imagen del pantalon:");
        boolean activo = ConsoleReader.readBoolean("El pantalon estan en activo? (true/false)");
        String estilo = ConsoleReader.readString("Introduce el estilo del zapato");
        boolean esPersonalizado = ConsoleReader.readBoolean("Introduce si el bolso es personalizado (true/false)");
        int tallaZapatos = ConsoleReader.readInt("Introduce la talla del zapato");
        String tipoSuela = ConsoleReader.readString("Introduce el tipo de suela que tiene el zapato");

        return new Zapatos(codigoArticulo,nombre,precio,marca,descripcion,imagen,material,activo,estilo,esPersonalizado,tallaZapatos,tipoSuela);
    }

    public static LineaPedido crearLineaPedido(Pedido pedido, Articulo articulo) {
        System.out.println("Creando Línea de Pedido...");
        int idLinea = ConsoleReader.readInt("Inserte idLinea: ");
        int cantidad = ConsoleReader.readInt("Cantidad: ");
        return new LineaPedido(idLinea,pedido,cantidad,articulo);
    }

}