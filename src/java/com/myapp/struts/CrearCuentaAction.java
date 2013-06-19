
package com.myapp.struts;

import hibernate.CuentasDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CrearCuentaAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        CuentaForm f = (CuentaForm)form;
        
        CuentasDAO dao = new CuentasDAO();
        dao.create(f.getCodEntidad(), f.getCodSucursal(), f.getDigito(), f.getSaldo(), f.getTipoCuenta());
        request.setAttribute("msg", "Mensaje provisional: La cuenta se ha creado correctamente\n"
                + "habria que ver a donde lleva el forward de este action");
        
        return mapping.findForward(SUCCESS);
    }
}
