/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.sql.SQLException;
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

    /*public int bajaRecurso(int recursoID, String fechaBaja) throws SQLException {
     String hql = "update Recurso set fechaBaja = :fechaBaja where recursoID = :recursoID";
     Query query = hSession.createQuery(hql);
     query.setInteger("recursoID", recursoID);
     query.setString("fechaBaja", fechaBaja);
     hSession.beginTransaction();
     int rowCount = query.executeUpdate();
     hSession.getTransaction().commit();
     return rowCount;
     }*/
    public void create(String usuario, String password, String perfil) {     
        Usuarios usuarios = new Usuarios(usuario, password, perfil);
        hSession.beginTransaction();
        hSession.save(usuarios);
        hSession.getTransaction().commit();
    }
    
    public Usuarios get(String usuario) {
        hSession.clear();
        Query q = hSession.createQuery("from Usuarios where usuario='"+usuario+"'");
        List<Usuarios> lista=q.list();
        if(!lista.isEmpty())
            return lista.get(0);
        return null;
    }
    

    /*public List<Recurso> consultaRecursosDisponibles() throws SQLException {
        hSession.clear();
        Query q = hSession.createQuery("from Recurso");
        List resultados = (List<Recurso>) q.list();
        return resultados;
    }*/
}
