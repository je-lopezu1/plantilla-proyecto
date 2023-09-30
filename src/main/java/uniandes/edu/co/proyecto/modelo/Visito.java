package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="visito")
public class Visito {
    @EmbeddedId
    private VisitoPK pk;
    
    public Visito(Usuario idUsuario, Sede idSede) {
        this.pk = new VisitoPK(idUsuario, idSede);
    }

    public Visito(){;}

    public VisitoPK getPk() {
        return pk;
    }

    public void setPk(VisitoPK pk) {
        this.pk = pk;
    }
    
}
