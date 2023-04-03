import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    List<Coche> cocheList = new ArrayList<>();
    @Override
    public void save(Coche coche) {
        //System.out.println("Metodo Save");
        cocheList.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        //System.out.println("Metodo findAll");
        for (Coche coche:  cocheList){
            System.out.println(coche.toString());
        }
        return null;
    }

    @Override
    public void delete(Coche coche) {
        //System.out.println("Metodo delete");
        cocheList.remove(coche);
    }
}
