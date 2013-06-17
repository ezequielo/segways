package hibernate;
// Generated 17-jun-2013 20:09:01 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer pkCliente;
     private Usuarios usuarios;
     private Sucursales sucursales;
     private String nombre;
     private String apellido1;
     private String apellido2;
     private String ident;
     private String direccion;
     private String localidad;
     private String provincia;
     private String cp;
     private String telefono;
     private String pais;
     private String email;
     private Set cuentasHasClienteses = new HashSet(0);

    public Clientes() {
    }

	
    public Clientes(Usuarios usuarios, Sucursales sucursales, String nombre, String apellido1, String apellido2, String ident, String direccion, String localidad, String provincia, String cp, String telefono, String pais, String email) {
        this.usuarios = usuarios;
        this.sucursales = sucursales;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.ident = ident;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.cp = cp;
        this.telefono = telefono;
        this.pais = pais;
        this.email = email;
    }
    public Clientes(Usuarios usuarios, Sucursales sucursales, String nombre, String apellido1, String apellido2, String ident, String direccion, String localidad, String provincia, String cp, String telefono, String pais, String email, Set cuentasHasClienteses) {
       this.usuarios = usuarios;
       this.sucursales = sucursales;
       this.nombre = nombre;
       this.apellido1 = apellido1;
       this.apellido2 = apellido2;
       this.ident = ident;
       this.direccion = direccion;
       this.localidad = localidad;
       this.provincia = provincia;
       this.cp = cp;
       this.telefono = telefono;
       this.pais = pais;
       this.email = email;
       this.cuentasHasClienteses = cuentasHasClienteses;
    }
   
    public Integer getPkCliente() {
        return this.pkCliente;
    }
    
    public void setPkCliente(Integer pkCliente) {
        this.pkCliente = pkCliente;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    public Sucursales getSucursales() {
        return this.sucursales;
    }
    
    public void setSucursales(Sucursales sucursales) {
        this.sucursales = sucursales;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return this.apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return this.apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public String getIdent() {
        return this.ident;
    }
    
    public void setIdent(String ident) {
        this.ident = ident;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
    public String getCp() {
        return this.cp;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getCuentasHasClienteses() {
        return this.cuentasHasClienteses;
    }
    
    public void setCuentasHasClienteses(Set cuentasHasClienteses) {
        this.cuentasHasClienteses = cuentasHasClienteses;
    }




}


