
package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.Date;

public class MovimientosDAO {
    Session hSession = null;
    
    public MovimientosDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    
   
    public void create(Cuentas cuentas,String importe,Date fecha,String tipoOperacion,byte AFavor){
        Movimientos movimiento=new Movimientos(cuentas, importe, fecha, tipoOperacion, AFavor);
        this.hSession.beginTransaction();
        this.hSession.save(movimiento);
        this.hSession.getTransaction().commit();
    }
     public Movimientos get(Integer pkMovimiento){
        hSession.clear();
        Query q = hSession.createQuery("from Movimientos where pkMovimiento=:pkMovimiento");
        List<Movimientos> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    public List<Movimientos> getList(){
        hSession.clear();
        Query q = hSession.createQuery("from Movimientos");
        List<Movimientos> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    public void delete(Integer pkMovimiento){
        Movimientos movimiento = this.get(pkMovimiento);
        hSession.beginTransaction();
        hSession.delete(movimiento);
        hSession.getTransaction().commit();
    }
    public void update(Integer pkMovimiento,Cuentas cuentas,String importe,Date fecha,String tipoOperacion,byte AFavor){
        Movimientos moviento = this.get(pkMovimiento);
        moviento.setCuentas(cuentas);
        moviento.setImporte(importe);
        moviento.setFecha(fecha);
        moviento.setTipoOperacion(tipoOperacion);
        moviento.setAFavor(AFavor);
        this.hSession.beginTransaction();
        this.hSession.update(moviento);
        this.hSession.getTransaction().commit();
    }
}
