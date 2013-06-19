
package com.myapp.struts.personal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class PersonalPanelAction extends org.apache.struts.action.Action {

    private static final String CLIENTES = "clientes";
    private static final String CUENTAS = "cuentas";
    private static final String TARJETAS = "tarjetas";
    private static final String OPERAR = "operar";
    private static final String DOMICILIACIONES = "domiciliaciones";
    private static final String SUCURSALES = "sucursales";
    private static final String SEGUROS = "seguros";
    private static final String PRESTAMOS = "prestamos";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        PersonalPanelForm f = (PersonalPanelForm)form;
        
        String opcion = f.getOpcion();
        
        if(opcion.equals("clientes"))
            return mapping.findForward(CLIENTES);
        else if (opcion.equals("cuentas"))
            return mapping.findForward(CUENTAS);
        else if (opcion.equals("tarjetas"))
            return mapping.findForward(TARJETAS);
        else if (opcion.equals("oeprar"))
            return mapping.findForward(OPERAR);
        else if (opcion.equals("domiciliaciones"))
            return mapping.findForward(DOMICILIACIONES);
        else if (opcion.equals("sucursales"))
            return mapping.findForward(SUCURSALES);
        else if (opcion.equals("seguros"))
            return mapping.findForward(SEGUROS);
        else
            return mapping.findForward(PRESTAMOS);
        
    }
}
