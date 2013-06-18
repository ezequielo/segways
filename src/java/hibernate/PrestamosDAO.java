
package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class PrestamosDAO {
    Session hSession = null;
    
    public PrestamosDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void create(Cuentas cuentas,long cantidad,long cantidadPagada,long cuotaMensual,String mesesAmortizar){
        Prestamos prestamo=new Prestamos(cuentas, cantidad, cantidadPagada, cuotaMensual, mesesAmortizar);
        this.hSession.beginTransaction();
        this.hSession.save(prestamo);
        this.hSession.getTransaction().commit();
    }
    
    public void update(Integer pkPrestamo,Cuentas cuentas,long cantidad,long cantidadPagada,long cuotaMensual,String mesesAmortizar){
        Prestamos prestamo = this.get(pkPrestamo);
        prestamo.setCuentas(cuentas);
        prestamo.setCantidadPagada(cantidadPagada);
        prestamo.setCantidadPagada(cantidadPagada);
        prestamo.setCuotaMensual(cuotaMensual);
        prestamo.setMesesAmortizar(mesesAmortizar);
        this.hSession.beginTransaction();
        this.hSession.update(prestamo);
        this.hSession.getTransaction().commit();
    }
    public Prestamos get(Integer pkPrestamo){
        hSession.clear();
        Query q = hSession.createQuery("from Prestamos where pkPrestamo=:pkPrestamo");
        List<Prestamos> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    public List<Prestamos> getList(){
        hSession.clear();
        Query q = hSession.createQuery("from Prestamos");
        List<Prestamos> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    public void delete(Integer pkPrestamo){
        Prestamos prestamo = this.get(pkPrestamo);
        hSession.beginTransaction();
        hSession.delete(prestamo);
        hSession.getTransaction().commit();
    }
    
    
}
