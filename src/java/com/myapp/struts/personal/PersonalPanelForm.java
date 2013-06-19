
package com.myapp.struts.personal;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class PersonalPanelForm extends org.apache.struts.validator.ValidatorForm {
    
    private String opcion;

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
    
    public PersonalPanelForm() {
        super();
        // TODO Auto-generated constructor stub
    }
}
