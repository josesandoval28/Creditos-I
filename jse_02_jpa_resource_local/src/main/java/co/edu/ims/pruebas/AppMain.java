package co.edu.ims.pruebas;

import co.edu.ims.modelo.Genero;
import co.edu.ims.modelo.Persona;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppMain {
    
    public static void main (String[] args){
        
        EntityManagerFactory emf;
        EntityManager em; 
        
        emf = Persistence.createEntityManagerFactory("peliculasPU");        
        em = emf.createEntityManager();
        
        // Se crea objeto en memoria (sin persistir aun).
        Genero accion = new Genero("Accion", "Peliculas de accion");
        
        EntityTransaction tx = em.getTransaction();//se hace transaccion
        tx.begin();//realiza una transaccion
        em.persist(accion); // Se persiste objeto en base de datos., guarda el objeto en la base de datos
        tx.commit();
        
        // Se crea objeto en memoria (sin persistir aun).
        Persona guillermoDelToro = new Persona(
                "Guillermo del Toro", 
                "MX",
                (new GregorianCalendar(1964, 9, 9)).getTime() );
        
        tx.begin();// inicializa una transaacion
        em.persist(guillermoDelToro); // Se persiste objeto en base de datos. 
        tx.commit();
        
        // Se crea objeto en memoria (sin persistir aun).
        Genero romance = new Genero("Romance", "Peliculas de romance");
    }
    
}
