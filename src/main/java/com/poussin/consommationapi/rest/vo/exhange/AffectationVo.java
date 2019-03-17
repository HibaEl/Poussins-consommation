/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.vo.exhange;

/**
 *
 * @author Elitebook folio
 */
public class AffectationVo {

    private Long id;
    private String nbrMale;
    private String nbrFemale;
    private String dateAffectation;
    private String refe;
    private String referenceImport;
    private FirmeVo firmeVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNbrMale() {
        return nbrMale;
    }

    public void setNbrMale(String nbrMale) {
        this.nbrMale = nbrMale;
    }

    public String getNbrFemale() {
        return nbrFemale;
    }

    public void setNbrFemale(String nbrFemale) {
        this.nbrFemale = nbrFemale;
    }

    public String getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(String dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public String getRefe() {
        return refe;
    }

    public void setRefe(String refe) {
        this.refe = refe;
    }

    public String getReferenceImport() {
        return referenceImport;
    }

    public void setReferenceImport(String referenceImport) {
        this.referenceImport = referenceImport;
    }

    public FirmeVo getFirmeVo() {
        return firmeVo;
    }

    public void setFirmeVo(FirmeVo firmeVo) {
        this.firmeVo = firmeVo;
    }

}
