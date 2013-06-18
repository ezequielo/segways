/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;


public class DomiciliacionesDAO {
    Session hSession = null;
    
    public DomiciliacionesDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    
   
    public void create(Cuentas cuentas,String entidad,boolean bloqueado){
        Domiciliaciones domiciliacion=new Domiciliaciones(cuentas, entidad, bloqueado);
        this.hSession.beginTransaction();
        this.hSession.save(domiciliacion);
        this.hSession.getTransaction().commit();
    }
     public Domiciliaciones get(Integer pkDomiciliacion){
        hSession.clear();
        Query q = hSession.createQuery("from Domiciliaciones where pkDomiciliacion=:pkDomiciliacion");
        List<Domiciliaciones> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    public List<Domiciliaciones> getList(){
        hSession.clear();
        Query q = hSession.createQuery("from Domiciliaciones");
        List<Domiciliaciones> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    public void delete(Integer pkDomiciliaciones){
        Domiciliaciones domiciliacion = this.get(pkDomiciliaciones);
        hSession.beginTransaction();
        hSession.delete(domiciliacion);
        hSession.getTransaction().commit();
    }
    public void update(Integer pkDomiciliacion,Cuentas cuentas,String entidad,boolean bloqueado){
        Domiciliaciones domiciliacion = this.get(pkDomiciliacion);
       domiciliacion.setCuentas(cuentas);
       domiciliacion.setEntidad(entidad);
       domiciliacion.setBloqueado(bloqueado);
        this.hSession.beginTransaction();
        this.hSession.update(domiciliacion);
        this.hSession.getTransaction().commit();
    }
}
