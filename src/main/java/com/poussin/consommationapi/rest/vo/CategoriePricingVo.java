/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.vo;

import java.util.Date;

/**
 *
 * @author hp
 */
public class CategoriePricingVo {

    private Long id;
    private String prix;
    private String dateMin;
    private String dateMax;
  //  private CategorieConsommationVo categorieConsommationVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getDateMin() {
        return dateMin;
    }

    public void setDateMin(String dateMin) {
        this.dateMin = dateMin;
    }

    public String getDateMax() {
        return dateMax;
    }

    public void setDateMax(String dateMax) {
        this.dateMax = dateMax;
    }
/*
    public CategorieConsommationVo getCategorieConsommationVo() {
        return categorieConsommationVo;
    }

    public void setCategorieConsommationVo(CategorieConsommationVo categorieConsommationVo) {
        this.categorieConsommationVo = categorieConsommationVo;
    }
*/
    
}
