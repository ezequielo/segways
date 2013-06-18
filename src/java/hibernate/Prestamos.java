package hibernate;
// Generated 17-jun-2013 20:09:01 by Hibernate Tools 3.2.1.GA



/**
 * Prestamos generated by hbm2java
 */
public class Prestamos  implements java.io.Serializable {


     private Integer pkPrestamo;
     private Cuentas cuentas;
     private long cantidad;
     private long cantidadPagada;
     private long cuotaMensual;
     private String mesesAmortizar;

    public Prestamos() {
    }

    public Prestamos(Cuentas cuentas, long cantidad, long cantidadPagada, long cuotaMensual, String mesesAmortizar) {
       this.cuentas = cuentas;
       this.cantidad = cantidad;
       this.cantidadPagada = cantidadPagada;
       this.cuotaMensual = cuotaMensual;
       this.mesesAmortizar = mesesAmortizar;
    }
   
    public Integer getPkPrestamo() {
        return this.pkPrestamo;
    }
    
    public void setPkPrestamo(Integer pkPrestamo) {
        this.pkPrestamo = pkPrestamo;
    }
    public Cuentas getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    public long getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }
    public long getCantidadPagada() {
        return this.cantidadPagada;
    }
    
    public void setCantidadPagada(long cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }
    public long getCuotaMensual() {
        return this.cuotaMensual;
    }
    
    public void setCuotaMensual(long cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }
    public String getMesesAmortizar() {
        return this.mesesAmortizar;
    }
    
    public void setMesesAmortizar(String mesesAmortizar) {
        this.mesesAmortizar = mesesAmortizar;
    }




}

