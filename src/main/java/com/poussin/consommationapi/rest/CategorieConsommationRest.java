/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest;

import com.poussin.consommationapi.bean.CategorieConsommation;
import com.poussin.consommationapi.rest.converter.AbstractConverter;
import com.poussin.consommationapi.rest.vo.CategorieConsommationVo;
import com.poussin.consommationapi.service.CategorieConsommationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping({"/consommation-api/categories"})
public class CategorieConsommationRest {

    @Autowired
    public CategorieConsommationService categorieConsommationService;

    @Autowired
    @Qualifier("categorieConsommationConverter")
    private AbstractConverter<CategorieConsommation, CategorieConsommationVo> categorieConsommatioConverter;

    @GetMapping("/categorie")
    public List<CategorieConsommationVo> findAllCat() {
        return categorieConsommatioConverter.toVo(categorieConsommationService.findAllCat());
    }

    public CategorieConsommationService getCategorieConsommationService() {
        return categorieConsommationService;
    }

    public void setCategorieConsommationService(CategorieConsommationService categorieConsommationService) {
        this.categorieConsommationService = categorieConsommationService;
    }

    public AbstractConverter<CategorieConsommation, CategorieConsommationVo> getCategorieConsommatioConverter() {
        return categorieConsommatioConverter;
    }

    public void setCategorieConsommatioConverter(AbstractConverter<CategorieConsommation, CategorieConsommationVo> categorieConsommatioConverter) {
        this.categorieConsommatioConverter = categorieConsommatioConverter;
    }

}
