public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        Coche primero = new Coche("Toyota","provox","AEZ-588",1000) ;
        Coche segundo = new Coche("Hyunday","premiun","AFG-423",400) ;
        Coche tercero = new Coche("Chevrolet","provox","KXW-563",500) ;
        cocheCRUD.save(primero);
        cocheCRUD.save(segundo);
        cocheCRUD.save(tercero);
        cocheCRUD.findAll();

        System.out.println("Borrando el Segundo");
        cocheCRUD.delete(segundo);
        cocheCRUD.findAll();
    }
}