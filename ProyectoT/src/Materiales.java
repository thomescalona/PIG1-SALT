import java.util.ArrayList;
import java.util.Iterator;

public class Materiales {
    private ArrayList<Material> lmaterial;

    public Materiales(){
        lmaterial= new ArrayList<>();
    }

    public Materiales(ArrayList<Material> lmaterial) {
        this.lmaterial = lmaterial;
    }

    public ArrayList<Material> getLmaterial() {
        return lmaterial;
    }

    public void setLmaterial(ArrayList<Material> lmaterial) {
        this.lmaterial = lmaterial;
    }


    public Material getMaterial(int id){
        for(Material material : lmaterial){
            if(material.getId() == id)
                return material;
        }
        return null;
    }

    public void addMaterial(Material nuevo){
        Material existente = getMaterial(nuevo.getId());
        if (existente == null){
            lmaterial.add(nuevo);
        }else{
            System.out.println("Material duplicado");
        }
    }

    public boolean updateMaterial(Material nuevo){
        Material existente = getMaterial(nuevo.getId());

        if (existente != null){
            existente.setDescripcion(nuevo.getDescripcion());
            return true;
        }
        System.out.println("Material encontrado");
        return false;
    }

    public boolean deleteMaterial(int id){
        boolean encontrado= false;

        Iterator<Material> iterator = lmaterial.iterator();

        while(iterator.hasNext()){
            Material material = iterator.next();
            if (material.getId()==id){
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("No encontrado");
        }
        return encontrado;
    }

}