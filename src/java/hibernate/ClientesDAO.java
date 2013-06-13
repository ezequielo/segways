package hibernate;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Carlos
 */
public class ClientesDAO {

    Session hSession = null;

    public ClientesDAO() {
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
    public void create(Usuarios usuario, Sucursales sucursal, String nombre, String apellido_1, String apellido_2, String ident, String direccion, String localidad, String provincia, String cp, String telefono, String pais, String email) {
        Clientes cliente = new Clientes(usuario, sucursal, nombre, apellido_1, apellido_2, ident, direccion, localidad, provincia, cp, telefono, pais, email);
        hSession.beginTransaction();
        hSession.save(cliente);
        hSession.getTransaction().commit();
    }

    public Usuarios get(String usuario) {
        hSession.clear();
        Query q = hSession.createQuery("from Usuarios where usuario='" + usuario + "'");
        List<Usuarios> lista = q.list();
        if (!lista.isEmpty()) {
            return lista.get(0);
        }
        return null;
    }
    /*public List<Recurso> consultaRecursosDisponibles() throws SQLException {
     hSession.clear();
     Query q = hSession.createQuery("from Recurso");
     List resultados = (List<Recurso>) q.list();
     return resultados;
     }*/
}