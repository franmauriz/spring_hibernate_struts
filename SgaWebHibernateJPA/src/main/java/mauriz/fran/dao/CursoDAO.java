package mauriz.fran.dao;

import java.util.List;
import javax.persistence.Query;
import static mauriz.fran.dao.GenericDAO.em;
import mauriz.fran.domain.Curso;

public class CursoDAO extends GenericDAO{
    
    public List<Curso> listar() {
        String consulta = "SELECT d from Curso d";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void actualizar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(curso);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void eliminar(Curso curso) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(curso));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    
    public Object buscarPorId(Curso curso){
        em = getEntityManager();
        return em.find(Curso.class, curso.getIdCurso());
    }
}
