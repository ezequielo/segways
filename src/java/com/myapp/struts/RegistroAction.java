
package com.myapp.struts;

import hibernate.ClientesDAO;
import hibernate.Usuarios;
import hibernate.UsuariosDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegistroAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        
        
        RegistroForm f = (RegistroForm)form;
        
        UsuariosDAO usuarioDAO = new  UsuariosDAO();
        //Usuarios uevoUsuario = new Usuarios(f.getIdentidad(), , String perfil);
        
        ClientesDAO clienteDAO = new ClientesDAO();
        //Clientes nuevoCliente = new Clientes();
        return mapping.findForward(SUCCESS);
    }
}
