/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest;

import com.poussin.consommationapi.bean.CategoriePricing;
import com.poussin.consommationapi.dao.CategoriePricingDao;
import com.poussin.consommationapi.service.CategoriePricingService;
import com.poussin.consommationapi.util.DateUtil;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hp
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping({"/consommation-api/categoriePricings"})
public class CategoriePricingRest {

    @Autowired
    private CategoriePricingService categoriePricingService;

    @DeleteMapping("/{reference}")
    public void deleteByReference(@PathVariable("reference") String reference)
     {
        categoriePricingService.deleteByReference(reference);
    }
    
    @PostMapping("/")
    public int creer(@RequestBody CategoriePricing categoriePricing) {
        return categoriePricingService.creer(categoriePricing);
    }

    @GetMapping("/dateMin/{d}/dateMax/{r}")
    public Double findPrix(@PathVariable String d, @PathVariable String r) {
        Date depart = DateUtil.parse(d);
        Date arrive = DateUtil.parse(r);
        return categoriePricingService.findPrix(depart, arrive);
    }

    public CategoriePricingService getCategoriePricingService() {
        return categoriePricingService;
    }

    public void setCategoriePricingService(CategoriePricingService categoriePricingService) {
        this.categoriePricingService = categoriePricingService;
    }

}
