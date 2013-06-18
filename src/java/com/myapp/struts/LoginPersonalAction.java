/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import hibernate.Usuarios;
import hibernate.UsuariosDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Winnie
 */
public class LoginPersonalAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";
    private static final String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginPersonalForm f = (LoginPersonalForm) form;
        UsuariosDAO dao = new UsuariosDAO();

        Usuarios usuario = dao.get(f.getUsuario(), f.getPassword());

        if (usuario == null) {
            request.setAttribute("msg", "El usuario y/o la clave son incorrectas");
            return mapping.findForward(FAILURE);
        } else if (!usuario.getPerfil().equals("admin")) {
            request.setAttribute("msg", "El usuario no tiene permiso de administrador");
            return mapping.findForward(FAILURE);
        } else {
            return mapping.findForward(SUCCESS);
        }

    }
}
