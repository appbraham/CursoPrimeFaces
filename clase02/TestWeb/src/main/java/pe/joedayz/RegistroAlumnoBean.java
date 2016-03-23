package pe.joedayz;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by josediaz on 3/22/16.
 */


@ManagedBean
@ViewScoped
public class RegistroAlumnoBean implements Serializable{


    private static final long serialVersionUID = 1L;

    private String nombre;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void registrar(){
        System.out.println("Nombre " + nombre);
    }
}
