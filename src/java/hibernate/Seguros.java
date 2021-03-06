package hibernate;
// Generated 19-jun-2013 14:01:36 by Hibernate Tools 3.2.1.GA



/**
 * Seguros generated by hbm2java
 */
public class Seguros  implements java.io.Serializable {


     private Integer pkSeguro;
     private Cuentas cuentas;
     private String nombre;
     private long importe;
     private String meses;

    public Seguros() {
    }

    public Seguros(Cuentas cuentas, String nombre, long importe, String meses) {
       this.cuentas = cuentas;
       this.nombre = nombre;
       this.importe = importe;
       this.meses = meses;
    }
   
    public Integer getPkSeguro() {
        return this.pkSeguro;
    }
    
    public void setPkSeguro(Integer pkSeguro) {
        this.pkSeguro = pkSeguro;
    }
    public Cuentas getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getImporte() {
        return this.importe;
    }
    
    public void setImporte(long importe) {
        this.importe = importe;
    }
    public String getMeses() {
        return this.meses;
    }
    
    public void setMeses(String meses) {
        this.meses = meses;
    }




}


