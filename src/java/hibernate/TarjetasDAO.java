package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class TarjetasDAO {
     
      Session hSession = null;
    
    public TarjetasDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void create(Cuentas cuentas, String numero,String codigoSeguridad,String fechaCaducidad,String pin,String tipo){
        Tarjetas tarjeta= new Tarjetas(cuentas, numero, codigoSeguridad, fechaCaducidad, pin, tipo);
        this.hSession.beginTransaction();
        this.hSession.save(tarjeta);
        this.hSession.getTransaction().commit();
    }
    public void update(Integer pkTarjeta,Cuentas cuentas, String numero,String codigoSeguridad,String fechaCaducidad,String pin,String tipo){
        Tarjetas tarjeta = this.get(pkTarjeta);
        tarjeta.setCuentas(cuentas);
        tarjeta.setNumero(numero);
        tarjeta.setCodigoSeguridad(codigoSeguridad);
        tarjeta.setFechaCaducidad(fechaCaducidad);
        tarjeta.setPin(pin);
        tarjeta.setTipo(tipo);
        this.hSession.beginTransaction();
        this.hSession.update(tarjeta);
        this.hSession.getTransaction().commit();
    }
    
    public Tarjetas get(Integer pkTarjeta){
        hSession.clear();
        Query q = hSession.createQuery("from Tarjetas where pkTarjeta=:pkTarjeta");
        List<Tarjetas> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    public List<Tarjetas> getList(Integer pkCuenta){
        hSession.clear();
        Query q = hSession.createQuery("from Tarjetas, Cuentas where Cuentas.pkCuenta=Tarjetas.pkTarketas and Cuentas.pkCuenta = '"+pkCuenta+"'");
        List<Tarjetas> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    public void delete(Integer pkTarjeta){
        Tarjetas tarjeta = this.get(pkTarjeta);
        hSession.beginTransaction();
        hSession.delete(tarjeta);
        hSession.getTransaction().commit();
    }
}
