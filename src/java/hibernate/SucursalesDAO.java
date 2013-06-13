/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Nacho
 */
public class SucursalesDAO {
       
    Session hSession = null;
    
    public SucursalesDAO(){
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }
    

    
    public void create(String nombre, String direccion, String cp, String localidad, String provincia, String codigoSucursal) {
        Sucursales sucursal=new Sucursales(nombre, direccion, cp, localidad, provincia, codigoSucursal);
        hSession.beginTransaction();
        hSession.save(sucursal);
        hSession.getTransaction().commit();
    }
    public Sucursales get(String sucursal) {
        hSession.clear();
        Query q = hSession.createQuery("from Sucursales where usuario='" + sucursal + "'");
        List<Sucursales> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    
}
    