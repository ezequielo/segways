package hibernate;
// Generated 13-jun-2013 17:50:01 by Hibernate Tools 3.2.1.GA



/**
 * Tarjetas generated by hbm2java
 */
public class Tarjetas  implements java.io.Serializable {


     private Integer pkTarjeta;
     private Cuentas cuentas;
     private String numero;
     private String codigoSeguridad;
     private String fechaCaducidad;
     private String pin;
     private String tipo;

    public Tarjetas() {
    }

    public Tarjetas(Cuentas cuentas, String numero, String codigoSeguridad, String fechaCaducidad, String pin, String tipo) {
       this.cuentas = cuentas;
       this.numero = numero;
       this.codigoSeguridad = codigoSeguridad;
       this.fechaCaducidad = fechaCaducidad;
       this.pin = pin;
       this.tipo = tipo;
    }
   
    public Integer getPkTarjeta() {
        return this.pkTarjeta;
    }
    
    public void setPkTarjeta(Integer pkTarjeta) {
        this.pkTarjeta = pkTarjeta;
    }
    public Cuentas getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCodigoSeguridad() {
        return this.codigoSeguridad;
    }
    
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    public String getFechaCaducidad() {
        return this.fechaCaducidad;
    }
    
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public String getPin() {
        return this.pin;
    }
    
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




}


