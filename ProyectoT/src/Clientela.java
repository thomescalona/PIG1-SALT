import java.util.ArrayList;
import java.util.Iterator;

public class Clientela {


    ArrayList<Cliente> lclientela;

    public Clientela(ArrayList<Cliente> lcliente) {
        this.lclientela = lcliente;
    }

    public Clientela() {
        lclientela = new ArrayList<>();
    }

    public ArrayList<Cliente> getCliente() {
        return lclientela;
    }

    public void setCliente(ArrayList<Cliente> lcliente) {
        this.lclientela = lcliente;
    }


    public Cliente getCliente(String dni){
        for(Cliente cliente : lclientela) {
            if(cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }

    //CRUD
    public void addCliente(Cliente nuevo){
        Cliente existente = getCliente(nuevo.getDni());
        if (existente == null){
            lclientela.add(nuevo);
        }else{
            System.out.println("Cliente duplicado");
        }
    }

    public boolean updateCliente(Cliente nuevo){
        Cliente existente = getCliente(nuevo.getDni());

        if (existente != null){
            existente.setNombre(nuevo.getNombre());
            return true;
        }
        System.out.println("Cliente encontrado");
        return false;
    }

    public boolean deleteCliente(String dni){
        boolean encontrado= false;

        Iterator<Cliente> iterator = lclientela.iterator();

        while(iterator.hasNext()){
            Cliente cliente = iterator.next();
            if (cliente.getDni().equals(dni)){
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("Cliente no encontrado");
        }
        return encontrado;
    }



    //Metodos que me piden
    public Cliente buscarDni (String dni){
        for(Cliente cliente :lclientela){
            if (cliente.getDni().equals(dni)){
                return cliente;
            }
        }
        return null;
    }

    public Clientela filtrarMetodoPago (int id){

        Clientela filtrado = new Clientela();

        for (Cliente cliente : lclientela){
            if(cliente.getMetodoPago().getId() == id){
                filtrado.getCliente().add(cliente);
            }
        }
        return filtrado;
    }

    public Clientela filtrarNombreApellidos (String nombre,String apellidos){

        Clientela filtrado = new Clientela();

        for (Cliente cliente : lclientela){
            if(cliente.getNombre().equals(nombre) && cliente.getApellidos().equals(apellidos)){
                filtrado.getCliente().add(cliente);
            }
        }
        return filtrado;
    }


}