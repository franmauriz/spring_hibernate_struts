package mauriz.fran.dao;

import java.util.List;
import javax.persistence.*;
import mauriz.fran.domain.Persona;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        this.emf = Persistence.createEntityManagerFactory("HibernatePU");
        this.em = emf.createEntityManager();
    }

    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println("p desde DAO= " + p);
        }
    }

    public void insertar(Persona persona) {
        try {
            this.em.getTransaction().begin();
            em.persist(persona);
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally {
//            if (this.em != null) {
//                this.em.close();
//            }
//        }
    }

    public void modificar(Persona persona) {
        try {
            this.em.getTransaction().begin();
            this.em.merge(persona);
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            this.em.getTransaction().rollback();
        }
//        finally {
//            if (this.em != null) {
//                this.em.close();
//            }
//        }
    }

    public void eliminar(Persona persona) {
        try {
            this.em.getTransaction().begin();
            this.em.remove(this.em.merge(persona));
            this.em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            this.em.getTransaction().rollback();
        }
//        finally {
//            if (this.em != null) {
//                this.em.close();
//            }
//        }
    }

    public Persona buscarPersonaPorId(Persona persona) {
        return this.em.find(Persona.class, persona.getIdPersona());
    }

}
