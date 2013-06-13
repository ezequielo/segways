/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import hibernate.ClientesDAO;
import hibernate.Usuarios;
import hibernate.UsuariosDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Carlos
 */
public class RegistroAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        RegistroForm f = (RegistroForm) form;
        UsuariosDAO uDAO = new UsuariosDAO();
        ClientesDAO cDAO = new ClientesDAO();
        Usuarios usuario = uDAO.create(f.getEmail(), "1234", "cliente");
        cDAO.create(usuario, null ,f.getNombre(), f.getApellido_1(), f.getApellido_2(), f.getIdentidad(),f.getDireccion(), f.getLocalidad(), f.getProvincia(),  f.getCp(), f.getTelefono(), f.getPais(), f.getEmail());
        return mapping.findForward(SUCCESS);
    }
}
