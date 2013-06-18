
package com.myapp.struts;

public class LoginPersonalForm extends org.apache.struts.validator.ValidatorForm {
    
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public LoginPersonalForm() {
        super();
    }
}
