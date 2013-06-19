package hibernate;
// Generated 19-jun-2013 14:01:36 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer pkUsuario;
     private String usuario;
     private String password;
     private String perfil;
     private Set personals = new HashSet(0);
     private Set clienteses = new HashSet(0);

    public Usuarios() {
    }

	
    public Usuarios(String usuario, String password, String perfil) {
        this.usuario = usuario;
        this.password = password;
        this.perfil = perfil;
    }
    public Usuarios(String usuario, String password, String perfil, Set personals, Set clienteses) {
       this.usuario = usuario;
       this.password = password;
       this.perfil = perfil;
       this.personals = personals;
       this.clienteses = clienteses;
    }
   
    public Integer getPkUsuario() {
        return this.pkUsuario;
    }
    
    public void setPkUsuario(Integer pkUsuario) {
        this.pkUsuario = pkUsuario;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    public Set getPersonals() {
        return this.personals;
    }
    
    public void setPersonals(Set personals) {
        this.personals = personals;
    }
    public Set getClienteses() {
        return this.clienteses;
    }
    
    public void setClienteses(Set clienteses) {
        this.clienteses = clienteses;
    }




}


