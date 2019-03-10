/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.vo.exhange;

import java.util.List;

/**
 *
 * @author hp
 */
public class FirmeVo {
      private Long id;
    private String nom;
    private String capacite;
    private String nbrPoussinMale;
    private String nbrPoussinFemale;
    private String totalPoussin;
    private String placeRestant;
    private String reference;
    private List<AffectationVo> affectationVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public String getNbrPoussinMale() {
        return nbrPoussinMale;
    }

    public void setNbrPoussinMale(String nbrPoussinMale) {
        this.nbrPoussinMale = nbrPoussinMale;
    }

    public String getNbrPoussinFemale() {
        return nbrPoussinFemale;
    }

    public void setNbrPoussinFemale(String nbrPoussinFemale) {
        this.nbrPoussinFemale = nbrPoussinFemale;
    }

    public String getTotalPoussin() {
        return totalPoussin;
    }

    public void setTotalPoussin(String totalPoussin) {
        this.totalPoussin = totalPoussin;
    }

    public String getPlaceRestant() {
        return placeRestant;
    }

    public void setPlaceRestant(String placeRestant) {
        this.placeRestant = placeRestant;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

   public List<AffectationVo> getAffectationVo() {
        return affectationVo;
    }

    public void setAffectationVo(List<AffectationVo> affectationVo) {
        this.affectationVo = affectationVo;
    }
}
