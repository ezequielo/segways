
package com.myapp.struts;

import java.util.Random;
import hibernate.ClientesDAO;
import hibernate.Sucursales;
import hibernate.Usuarios;
import hibernate.UsuariosDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import util.Mail;

public class RegistroAction extends org.apache.struts.action.Action {

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String password = "";
        String perfil = "cliente";
        
        for(int k = 0; k < 4; k++){
            Random rand = new Random(); 
            password = password + String.valueOf(rand.nextInt(10));
        }
        
        RegistroForm f = (RegistroForm)form;
        
        UsuariosDAO usuarioDAO = new  UsuariosDAO();
        Usuarios nuevoUsuario = usuarioDAO.create(f.getIdentidad(), password, perfil);
        
        //Usuarios nuevoUsuario = new Usuarios(f.getIdentidad(), password, perfil);
        
        ClientesDAO clienteDAO = new ClientesDAO();
        clienteDAO.create(nuevoUsuario, null, f.getNombre(), f.getApellido_1(), 
                f.getApellido_2(), f.getIdentidad(), f.getDireccion(), f.getLocalidad(), f.getProvincia(), 
                f.getCp(), f.getTelefono(), f.getPais(), f.getEmail());
        
       
        //Mail.enviarMail("calveqreq@gmail.com", "Bienvenido al UPO Bank", "Gracias por darse de alta en nuestro banco.\nSu clave de acceso es "
        //        +password+ "");
        
        
        request.setAttribute("msg", "Se ha enviado un email con tu contraseña.");
        return mapping.findForward(SUCCESS);
    }
}
