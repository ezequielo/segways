package hibernate;
// Generated 19-jun-2013 14:01:36 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Cuentas generated by hbm2java
 */
public class Cuentas  implements java.io.Serializable {


     private Integer pkCuenta;
     private int codigoEntidad;
     private int codigoSucursal;
     private int digitoControl;
     private double saldo;
     private String tipo;
     private Set seguroses = new HashSet(0);
     private Set domiciliacioneses = new HashSet(0);
     private Set prestamoses = new HashSet(0);
     private Set cuentasHasClienteses = new HashSet(0);
     private Set tarjetases = new HashSet(0);
     private Set movimientoses = new HashSet(0);

    public Cuentas() {
    }

	
    public Cuentas(int codigoEntidad, int codigoSucursal, int digitoControl, double saldo, String tipo) {
        this.codigoEntidad = codigoEntidad;
        this.codigoSucursal = codigoSucursal;
        this.digitoControl = digitoControl;
        this.saldo = saldo;
        this.tipo = tipo;
    }
    public Cuentas(int codigoEntidad, int codigoSucursal, int digitoControl, double saldo, String tipo, Set seguroses, Set domiciliacioneses, Set prestamoses, Set cuentasHasClienteses, Set tarjetases, Set movimientoses) {
       this.codigoEntidad = codigoEntidad;
       this.codigoSucursal = codigoSucursal;
       this.digitoControl = digitoControl;
       this.saldo = saldo;
       this.tipo = tipo;
       this.seguroses = seguroses;
       this.domiciliacioneses = domiciliacioneses;
       this.prestamoses = prestamoses;
       this.cuentasHasClienteses = cuentasHasClienteses;
       this.tarjetases = tarjetases;
       this.movimientoses = movimientoses;
    }
   
    public Integer getPkCuenta() {
        return this.pkCuenta;
    }
    
    public void setPkCuenta(Integer pkCuenta) {
        this.pkCuenta = pkCuenta;
    }
    public int getCodigoEntidad() {
        return this.codigoEntidad;
    }
    
    public void setCodigoEntidad(int codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }
    public int getCodigoSucursal() {
        return this.codigoSucursal;
    }
    
    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }
    public int getDigitoControl() {
        return this.digitoControl;
    }
    
    public void setDigitoControl(int digitoControl) {
        this.digitoControl = digitoControl;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getSeguroses() {
        return this.seguroses;
    }
    
    public void setSeguroses(Set seguroses) {
        this.seguroses = seguroses;
    }
    public Set getDomiciliacioneses() {
        return this.domiciliacioneses;
    }
    
    public void setDomiciliacioneses(Set domiciliacioneses) {
        this.domiciliacioneses = domiciliacioneses;
    }
    public Set getPrestamoses() {
        return this.prestamoses;
    }
    
    public void setPrestamoses(Set prestamoses) {
        this.prestamoses = prestamoses;
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
    public Set getMovimientoses() {
        return this.movimientoses;
    }
    
    public void setMovimientoses(Set movimientoses) {
        this.movimientoses = movimientoses;
    }




}


