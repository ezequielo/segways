package hibernate;
// Generated 13-jun-2013 17:50:01 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Cuentas generated by hbm2java
 */
public class Cuentas  implements java.io.Serializable {


     private Integer pkCuenta;
     private String codigoEntidad;
     private String codigoSucursal;
     private String digitoControl;
     private String numeroCuenta;
     private String saldo;
     private String tipo;
     private Set cuentasHasClienteses = new HashSet(0);
     private Set tarjetases = new HashSet(0);

    public Cuentas() {
    }

	
    public Cuentas(String codigoEntidad, String codigoSucursal, String digitoControl, String numeroCuenta, String saldo, String tipo) {
        this.codigoEntidad = codigoEntidad;
        this.codigoSucursal = codigoSucursal;
        this.digitoControl = digitoControl;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    public Cuentas(String codigoEntidad, String codigoSucursal, String digitoControl, String numeroCuenta, String saldo, String tipo, Set cuentasHasClienteses, Set tarjetases) {
       this.codigoEntidad = codigoEntidad;
       this.codigoSucursal = codigoSucursal;
       this.digitoControl = digitoControl;
       this.numeroCuenta = numeroCuenta;
       this.saldo = saldo;
       this.tipo = tipo;
       this.cuentasHasClienteses = cuentasHasClienteses;
       this.tarjetases = tarjetases;
    }
   
    public Integer getPkCuenta() {
        return this.pkCuenta;
    }
    
    public void setPkCuenta(Integer pkCuenta) {
        this.pkCuenta = pkCuenta;
    }
    public String getCodigoEntidad() {
        return this.codigoEntidad;
    }
    
    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }
    public String getCodigoSucursal() {
        return this.codigoSucursal;
    }
    
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }
    public String getDigitoControl() {
        return this.digitoControl;
    }
    
    public void setDigitoControl(String digitoControl) {
        this.digitoControl = digitoControl;
    }
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getCuentasHasClienteses() {
        return this.cuentasHasClienteses;
    }
    
    public void setCuentasHasClienteses(Set cuentasHasClienteses) {
        this.cuentasHasClienteses = cuentasHasClienteses;
    }
    public Set getTarjetases() {
        return this.tarjetases;
    }
    
    public void setTarjetases(Set tarjetases) {
        this.tarjetases = tarjetases;
    }




}


