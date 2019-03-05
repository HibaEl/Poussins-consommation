/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
@Entity
public class Consommation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateConsommation;
    private int nbreFemale;
    private int nbreMale;
    private int qte;
    private int semaine;
    private int annee;
    private int mois;
    private String referenceFirme;
    
    @OneToOne
    private CategorieConsommation categorieConsommation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateConsommation() {
        return dateConsommation;
    }

    public void setDateConsommation(Date dateConsommation) {
        this.dateConsommation = dateConsommation;
    }

    public int getSemaine() {
        return semaine;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getNbreFemale() {
        return nbreFemale;
    }

    public void setNbreFemale(int nbreFemale) {
        this.nbreFemale = nbreFemale;
    }

    public int getNbreMale() {
        return nbreMale;
    }

    public void setNbreMale(int nbreMale) {
        this.nbreMale = nbreMale;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public String getReferenceFirme() {
        return referenceFirme;
    }

    public void setReferenceFirme(String referenceFirme) {
        this.referenceFirme = referenceFirme;
    }

    public CategorieConsommation getCategorieConsommation() {
        return categorieConsommation;
    }

    public void setCategorieConsommation(CategorieConsommation categorieConsommation) {
        this.categorieConsommation = categorieConsommation;
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
        if (!(object instanceof Consommation)) {
            return false;
        }
        Consommation other = (Consommation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.poussin.consommationapi.bean.Consommation[ id=" + id + " ]";
    }

}
