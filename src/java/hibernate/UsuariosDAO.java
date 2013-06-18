package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Carlos
 */
public class UsuariosDAO {

    Session hSession = null;

    public UsuariosDAO() {
        this.hSession = HibernateUtil.getSessionFactory().openSession();
    }

    public Usuarios create(String usuario, String password, String perfil) {     
        Usuarios usuarios = new Usuarios(usuario, password, perfil);
        hSession.beginTransaction();
        hSession.save(usuarios);
        hSession.getTransaction().commit();
        return usuarios;
    }
    /**
     * @param usuario Buscar por el nombre de usuario
     */
    public Usuarios get(String usuario) {
        hSession.clear();
        Query q = hSession.createQuery("from Usuarios where usuario='"+usuario+"'");
        List<Usuarios> lista=q.list();
        if(!lista.isEmpty())
            return lista.get(0);
        return null;
    }
    /**
     * @param pkUsuario Buscar por la clave primaria de usuario
     */
    public Usuarios get(Integer pkUsuario) {
        hSession.clear();
        Query q = hSession.createQuery("from Usuarios where pkUsuario='"+pkUsuario+"'");
        List<Usuarios> lista=q.list();
        if(!lista.isEmpty())
            return lista.get(0);
        return null;
    }
    
    public List<Usuarios> getList() {
        hSession.clear();
        Query q = hSession.createQuery("from Usuarios");
        List<Usuarios> lista=q.list();
        if(!lista.isEmpty())
            return lista;
        return null;
    }
    public void delete(Integer pkUsuario){
        this.get(pkUsuario);
        hSession.beginTransaction();
        hSession.delete(pkUsuario);
        hSession.getTransaction().commit();
    }
    public void update(Integer pkUsuario,String usuario, String password, String perfil){
        Usuarios user = this.get(pkUsuario);
        user.setUsuario(usuario);
        user.setPassword(password);
        user.setPerfil(perfil);
        this.hSession.beginTransaction();
        this.hSession.update(user);
        this.hSession.getTransaction().commit();
    }
    
}