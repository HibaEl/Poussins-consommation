/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.vo;

import com.poussin.consommationapi.bean.CategorieConsommation;
import java.util.List;

/**
 *
 * @author hp
 */
public class ConsommationVo {

    private Long id;
    private String reference;
    private String dateConsommation;
    private String nbreFemale;
    private String nbreMale;
    private String qte;
    private String semaine;
    private String annee;
    private String mois;
    private String referenceFirme;
    private CategorieConsommationVo categorieConsommationVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDateConsommation() {
        return dateConsommation;
    }

    public void setDateConsommation(String dateConsommation) {
        this.dateConsommation = dateConsommation;
    }

    public String getNbreFemale() {
        return nbreFemale;
    }

    public void setNbreFemale(String nbreFemale) {
        this.nbreFemale = nbreFemale;
    }

    public String getNbreMale() {
        return nbreMale;
    }

    public void setNbreMale(String nbreMale) {
        this.nbreMale = nbreMale;
    }

    public String getQte() {
        return qte;
    }

    public void setQte(String qte) {
        this.qte = qte;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getReferenceFirme() {
        return referenceFirme;
    }

    public void setReferenceFirme(String referenceFirme) {
        this.referenceFirme = referenceFirme;
    }

    public CategorieConsommationVo getCategorieConsommationVo() {
        return categorieConsommationVo;
    }

    public void setCategorieConsommationVo(CategorieConsommationVo categorieConsommationVo) {
        this.categorieConsommationVo = categorieConsommationVo;
    }

}
