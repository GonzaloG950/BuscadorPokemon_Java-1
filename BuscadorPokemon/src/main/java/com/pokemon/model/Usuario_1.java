/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pokemon.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aprendiz
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario_1.findAll", query = "SELECT u FROM Usuario_1 u"),
    @NamedQuery(name = "Usuario_1.findById", query = "SELECT u FROM Usuario_1 u WHERE u.id = :id"),
    @NamedQuery(name = "Usuario_1.findByNombreCompleto", query = "SELECT u FROM Usuario_1 u WHERE u.nombreCompleto = :nombreCompleto"),
    @NamedQuery(name = "Usuario_1.findByTipoDeIdentificacion", query = "SELECT u FROM Usuario_1 u WHERE u.tipoDeIdentificacion = :tipoDeIdentificacion"),
    @NamedQuery(name = "Usuario_1.findByNumeroDeIdentificacion", query = "SELECT u FROM Usuario_1 u WHERE u.numeroDeIdentificacion = :numeroDeIdentificacion"),
    @NamedQuery(name = "Usuario_1.findByFechaDeNacimiento", query = "SELECT u FROM Usuario_1 u WHERE u.fechaDeNacimiento = :fechaDeNacimiento"),
    @NamedQuery(name = "Usuario_1.findByCorreoElectronico", query = "SELECT u FROM Usuario_1 u WHERE u.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Usuario_1.findByPass", query = "SELECT u FROM Usuario_1 u WHERE u.pass = :pass"),
    @NamedQuery(name = "Usuario_1.findByPaisDeDomicilio", query = "SELECT u FROM Usuario_1 u WHERE u.paisDeDomicilio = :paisDeDomicilio"),
    @NamedQuery(name = "Usuario_1.findByCiudadDeDomicilio", query = "SELECT u FROM Usuario_1 u WHERE u.ciudadDeDomicilio = :ciudadDeDomicilio")})
public class Usuario_1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "tipo_de_identificacion")
    private String tipoDeIdentificacion;
    @Column(name = "numero_de_identificacion")
    private String numeroDeIdentificacion;
    @Column(name = "fecha_de_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaDeNacimiento;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "pass")
    private String pass;
    @Column(name = "pais_de_domicilio")
    private String paisDeDomicilio;
    @Column(name = "ciudad_de_domicilio")
    private String ciudadDeDomicilio;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Mochila> mochilaCollection;

    public Usuario_1() {
    }

    public Usuario_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoDeIdentificacion() {
        return tipoDeIdentificacion;
    }

    public void setTipoDeIdentificacion(String tipoDeIdentificacion) {
        this.tipoDeIdentificacion = tipoDeIdentificacion;
    }

    public String getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setNumeroDeIdentificacion(String numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPaisDeDomicilio() {
        return paisDeDomicilio;
    }

    public void setPaisDeDomicilio(String paisDeDomicilio) {
        this.paisDeDomicilio = paisDeDomicilio;
    }

    public String getCiudadDeDomicilio() {
        return ciudadDeDomicilio;
    }

    public void setCiudadDeDomicilio(String ciudadDeDomicilio) {
        this.ciudadDeDomicilio = ciudadDeDomicilio;
    }

    public Collection<Mochila> getMochilaCollection() {
        return mochilaCollection;
    }

    public void setMochilaCollection(Collection<Mochila> mochilaCollection) {
        this.mochilaCollection = mochilaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario_1)) {
            return false;
        }
        Usuario_1 other = (Usuario_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pokemon.model.Usuario_1[ id=" + id + " ]";
    }
    
}
