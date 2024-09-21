
package com.mycompany.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.*;

/**
 *
 * 
 */
@Data
@Entity
@Table(name = "persona")

public class Persona implements Serializable{

    private static final long serialVersionUID=1L;
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long idPersona;
    
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

 
    
}
