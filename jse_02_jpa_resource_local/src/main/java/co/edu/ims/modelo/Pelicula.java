package co.edu.ims.modelo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pelicula {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private List<Genero> genero;
    private Persona director;

    public Pelicula(long id, List<Genero> genero, Persona director) {
        this.id = id;
        this.genero = genero;
        this.director = director;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }
    
    
    
}