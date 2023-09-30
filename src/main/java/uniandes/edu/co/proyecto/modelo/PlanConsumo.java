package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva")
public class PlanConsumo {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String nombre;

    private Integer descuentoEstadia;

    private Integer costoFijo;

    public PlanConsumo(){;}

    public PlanConsumo(Integer id, String nombre, Integer descuentoEstadia, Integer costoFijo) {
        this.id = id;
        this.nombre = nombre;
        this.descuentoEstadia = descuentoEstadia;
        this.costoFijo = costoFijo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDescuentoEstadia() {
        return descuentoEstadia;
    }

    public void setDescuentoEstadia(Integer descuentoEstadia) {
        this.descuentoEstadia = descuentoEstadia;
    }

    public Integer getCostoFijo() {
        return costoFijo;
    }

    public void setCostoFijo(Integer costoFijo) {
        this.costoFijo = costoFijo;
    }

    
    
}
