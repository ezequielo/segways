package hibernate;
// Generated 19-jun-2013 14:01:36 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Movimientos generated by hbm2java
 */
public class Movimientos  implements java.io.Serializable {


     private Integer pkMovimiento;
     private Cuentas cuentas;
     private String importe;
     private Date fecha;
     private String tipoOperacion;
     private byte AFavor;

    public Movimientos() {
    }

    public Movimientos(Cuentas cuentas, String importe, Date fecha, String tipoOperacion, byte AFavor) {
       this.cuentas = cuentas;
       this.importe = importe;
       this.fecha = fecha;
       this.tipoOperacion = tipoOperacion;
       this.AFavor = AFavor;
    }
   
    public Integer getPkMovimiento() {
        return this.pkMovimiento;
    }
    
    public void setPkMovimiento(Integer pkMovimiento) {
        this.pkMovimiento = pkMovimiento;
    }
    public Cuentas getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    public String getImporte() {
        return this.importe;
    }
    
    public void setImporte(String importe) {
        this.importe = importe;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getTipoOperacion() {
        return this.tipoOperacion;
    }
    
    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    public byte getAFavor() {
        return this.AFavor;
    }
    
    public void setAFavor(byte AFavor) {
        this.AFavor = AFavor;
    }




}


