package interfaces;

public class InterfaceTask5 {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();

    public static void main(String[] args) {
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();


    }
}

public interface CocheCRUD {

    void save();

    void findAll();

    void delete();
}

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("this is the method; save()");
    }

    @Override
    public void findAll() {
        System.out.println("this is the method; findAll()");
    }

    @Override
    public void delete() {
        System.out.println("this is the method; delete()");

    }
}
