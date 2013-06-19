package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class CuentasDAO {

    Session hSession = null;

    public CuentasDAO() {
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }

    public void create(Integer codigoEntidad, Integer codigoSucursal, Integer digitoControl, double saldo, String tipo) {
        Cuentas cuenta = new Cuentas(codigoEntidad, codigoSucursal, digitoControl, saldo, tipo);
        this.hSession.beginTransaction();
        this.hSession.save(cuenta);
        this.hSession.getTransaction().commit();
    }

    public Cuentas get(Integer pkCuenta) {
        hSession.clear();
        Query q = hSession.createQuery("from Cuentas where pkCuenta=:Cuenta");
        List<Cuentas> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }

    public List<Cuentas> getList() {
        hSession.clear();
        Query q = hSession.createQuery("from Cuentas");
        List<Cuentas> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }

    public void delete(Integer pkCuenta) {
        Cuentas cuenta = this.get(pkCuenta);
        hSession.beginTransaction();
        hSession.delete(cuenta);
        hSession.getTransaction().commit();
    }

    public void update(Integer pkCuenta, Integer codigoEntidad, Integer codigoSucursal, Integer digitoControl, double saldo, String tipo) {
        Cuentas cuenta = this.get(pkCuenta);
        cuenta.setCodigoEntidad(codigoEntidad);
        cuenta.setCodigoSucursal(codigoSucursal);
        cuenta.setDigitoControl(digitoControl);
        cuenta.setSaldo(saldo);
        cuenta.setTipo(tipo);
        this.hSession.beginTransaction();
        this.hSession.update(cuenta);
        this.hSession.getTransaction().commit();
    }
}
