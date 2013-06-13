package hibernate;
// Generated 13-jun-2013 17:50:01 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursales generated by hbm2java
 */
public class Sucursales  implements java.io.Serializable {


     private Integer pkSucursal;
     private String nombre;
     private String direccion;
     private String cp;
     private String localidad;
     private String provincia;
     private String codigoSucursal;
     private Set personaleses = new HashSet(0);
     private Set clienteses = new HashSet(0);

    public Sucursales() {
    }

	
    public Sucursales(String nombre, String direccion, String cp, String localidad, String provincia, String codigoSucursal) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cp = cp;
        this.localidad = localidad;
        this.provincia = provincia;
        this.codigoSucursal = codigoSucursal;
    }
    public Sucursales(String nombre, String direccion, String cp, String localidad, String provincia, String codigoSucursal, Set personaleses, Set clienteses) {
       this.nombre = nombre;
       this.direccion = direccion;
       this.cp = cp;
       this.localidad = localidad;
       this.provincia = provincia;
       this.codigoSucursal = codigoSucursal;
       this.personaleses = personaleses;
       this.clienteses = clienteses;
    }
   
    public Integer getPkSucursal() {
        return this.pkSucursal;
    }
    
    public void setPkSucursal(Integer pkSucursal) {
        this.pkSucursal = pkSucursal;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCodigoSucursal() {
        return this.codigoSucursal;
    }
    
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }
    public Set getPersonaleses() {
        return this.personaleses;
    }
    
    public void setPersonaleses(Set personaleses) {
        this.personaleses = personaleses;
    }
    public Set getClienteses() {
        return this.clienteses;
    }
    
    public void setClienteses(Set clienteses) {
        this.clienteses = clienteses;
    }




}


