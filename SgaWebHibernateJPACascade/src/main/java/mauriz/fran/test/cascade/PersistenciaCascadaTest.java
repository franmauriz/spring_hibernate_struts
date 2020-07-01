package mauriz.fran.test.cascade;

import javax.persistence.*;
import mauriz.fran.domain.Alumno;
import mauriz.fran.domain.Contacto;
import mauriz.fran.domain.Domicilio;

public class PersistenciaCascadaTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em= emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Mexico");
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@gmail.com");
        contacto.setTelefono("123567345");
        Alumno alumno = new Alumno();
        alumno.setNombre("carlos");
        alumno.setApellido("lara");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        System.out.println("alumno = " + alumno);
    }
}
