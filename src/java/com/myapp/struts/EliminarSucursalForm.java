/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Winnie
 */
public class EliminarSucursalForm extends org.apache.struts.action.ActionForm {
    
    private String pkSucursal;

    public String getPkSucursal() {
        return pkSucursal;
    }

    public void setPkSucursal(String pkSucursal) {
        this.pkSucursal = pkSucursal;
    }

    public EliminarSucursalForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
      
        return errors;
    }
}
