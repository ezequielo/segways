package hibernate;
// Generated 19-jun-2013 14:01:36 by Hibernate Tools 3.2.1.GA



/**
 * CuentasHasClientes generated by hbm2java
 */
public class CuentasHasClientes  implements java.io.Serializable {


     private CuentasHasClientesId id;
     private Cuentas cuentas;
     private Clientes clientes;
     private String tipoCliente;

    public CuentasHasClientes() {
    }

    public CuentasHasClientes(CuentasHasClientesId id, Cuentas cuentas, Clientes clientes, String tipoCliente) {
       this.id = id;
       this.cuentas = cuentas;
       this.clientes = clientes;
       this.tipoCliente = tipoCliente;
    }
   
    public CuentasHasClientesId getId() {
        return this.id;
    }
    
    public void setId(CuentasHasClientesId id) {
        this.id = id;
    }
    public Cuentas getCuentas() {
        return this.cuentas;
    }
    
    public void setCuentas(Cuentas cuentas) {
        this.cuentas = cuentas;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public String getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }




}


