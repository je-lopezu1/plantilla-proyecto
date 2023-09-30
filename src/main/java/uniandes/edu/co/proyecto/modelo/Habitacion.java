package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="habitacion")
public class Habitacion {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private Integer capacidad;

    private Integer camas;

    private Integer costoNoche;

    private String tipo;

    @ManyToOne
    @JoinColumn(name = "sede", referencedColumnName = "id")
    private Sede sede;

    public Habitacion(){;}

    public Habitacion(Integer id, Integer capacidad, Integer camas, Integer costoNoche, String tipo, Sede sede) {
        this.id = id;
        this.capacidad = capacidad;
        this.camas = camas;
        this.costoNoche = costoNoche;
        this.tipo = tipo;
        this.sede = sede;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(Integer costoNoche) {
        this.costoNoche = costoNoche;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    

}
