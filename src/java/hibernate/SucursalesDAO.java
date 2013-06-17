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
    

    
    public void create(String nombre, String direccion, String cp, String localidad, String provincia, String codigoSucursal,String latitud,String longitud) {
        Sucursales sucursal=new Sucursales(nombre, direccion, cp, localidad, provincia, codigoSucursal,latitud,longitud);
        hSession.beginTransaction();
        hSession.save(sucursal);
        hSession.getTransaction().commit();
    }
    public List<Sucursales> getList() {
        hSession.clear();
        Query q = hSession.createQuery("from Sucursales");
        List<Sucursales> lista = q.list();
        if (!lista.isEmpty()) {
            return lista;
        }
        return null;
    }
    
    public void update(Integer pkSucursal,String nombre, String direccion, String cp, String localidad, String provincia, String codigoSucursal,String latitud,String longitud){
        Sucursales sucursal = this.get(pkSucursal);
        sucursal.setNombre(nombre);
        sucursal.setDireccion(direccion);
        sucursal.setCp(cp);
        sucursal.setLocalidad(localidad);
        sucursal.setProvincia(provincia);
        sucursal.setCodigoSucursal(codigoSucursal);
        sucursal.setLatitud(latitud);
        sucursal.setLongitud(longitud);
        hSession.beginTransaction();
        hSession.update(sucursal);
        hSession.getTransaction().commit();
    }
    
    public void delete(Integer pkSucursal){
        Sucursales sucursal = this.get(pkSucursal);
        hSession.beginTransaction();
        hSession.delete(sucursal);
        hSession.getTransaction().commit();
    } 
    public Sucursales get(Integer pkSucursal){
        hSession.clear();
        Query q = hSession.createQuery("from Sucursales where pkSucursal=:pkSucursal");
        List<Sucursales> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    
}
    