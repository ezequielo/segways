package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class PersonalesDAO {
    
            Session hSession = null;
    
    public PersonalesDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    public void create(Usuarios usuarios,Sucursales sucursales,String nombre,String ident,String apellido2,String apellido1){
        Personales personal = new Personales(usuarios, sucursales, nombre, ident, apellido2, apellido1);
        this.hSession.beginTransaction();
        this.hSession.save(personal);
        this.hSession.getTransaction().commit();
    }
     public Personales get(Integer pkPersonal){
        hSession.clear();
        Query q = hSession.createQuery("from Personales where pkPersonal=:pkPersonal");
        List<Personales> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    public List<Personales> getList(){
        hSession.clear();
        Query q = hSession.createQuery("from Personales");
        List<Personales> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    public void delete(Integer pkPersonal){
        Personales personal = this.get(pkPersonal);
        hSession.beginTransaction();
        hSession.delete(personal);
        hSession.getTransaction().commit();
    }
    public void update(Integer pkPersonal,Usuarios usuarios,Sucursales sucursales,String nombre,String ident,String apellido2,String apellido1){
        Personales personal = this.get(pkPersonal);
        personal.setUsuarios(usuarios);
        personal.setSucursales(sucursales);
        personal.setNombre(nombre);
        personal.setIdent(ident);
        personal.setApellido2(apellido2);
        personal.setApellido1(apellido1);
        this.hSession.beginTransaction();
        this.hSession.update(personal);
        this.hSession.getTransaction().commit();
    }
}
