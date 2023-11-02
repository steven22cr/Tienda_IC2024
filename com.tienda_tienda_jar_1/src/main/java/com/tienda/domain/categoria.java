package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")
public class categoria implements Serializable{
    
    private static final long serialVersionUID= 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCategoria")
    private Long idCategoria;   
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public categoria() {
    }

    public categoria(Long idCategoria, boolean activo) {
        this.idCategoria = idCategoria;
        this.activo = activo;
    }

    
    
    
    
        
    
    
    
}
