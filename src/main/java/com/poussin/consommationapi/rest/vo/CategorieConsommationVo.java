/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.vo;

import com.poussin.consommationapi.bean.CategoriePricing;
import java.util.List;

/**
 *
 * @author hp
 */
public class CategorieConsommationVo {

    private Long id;
    private String libelle;
    private String reference;
    private TypeConsommationVo typeConsommationVo;
    private CategoriePricing categoriePricing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public TypeConsommationVo getTypeConsommationVo() {
        return typeConsommationVo;
    }

    public void setTypeConsommationVo(TypeConsommationVo typeConsommationVo) {
        this.typeConsommationVo = typeConsommationVo;
    }

    public CategoriePricing getCategoriePricing() {
        return categoriePricing;
    }

    public void setCategoriePricing(CategoriePricing categoriePricing) {
        this.categoriePricing = categoriePricing;
    }


}
