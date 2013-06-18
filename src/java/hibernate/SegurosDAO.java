
package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class SegurosDAO {
    Session hSession = null;
    
    public SegurosDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void create(Cuentas cuentas,String nombre,long importe,String meses){
        Seguros seguro=new Seguros(cuentas, nombre, importe, meses);
        this.hSession.beginTransaction();
        this.hSession.save(seguro);
        this.hSession.getTransaction().commit();
    }
    public void update(Integer pkSeguro,Cuentas cuentas,String nombre,long importe,String meses){
        Seguros seguro = this.get(pkSeguro);
        seguro.setCuentas(cuentas);
        seguro.setNombre(nombre);
        seguro.setImporte(importe);
        seguro.setMeses(meses);
        this.hSession.beginTransaction();
        this.hSession.update(seguro);
        this.hSession.getTransaction().commit();
    }
    
    public Seguros get(Integer pkSeguro){
        hSession.clear();
        Query q = hSession.createQuery("from Seguros where pkSeguro=:pkSeguro");
        List<Seguros> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    public List<Seguros> getList(){
        hSession.clear();
        Query q = hSession.createQuery("from Seguros");
        List<Seguros> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    public void delete(Integer pkSeguro){
        Seguros seguro = this.get(pkSeguro);
        hSession.beginTransaction();
        hSession.delete(seguro);
        hSession.getTransaction().commit();
    }
}
