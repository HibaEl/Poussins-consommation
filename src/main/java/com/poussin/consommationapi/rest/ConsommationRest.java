/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest;

import com.poussin.consommationapi.bean.Consommation;
import com.poussin.consommationapi.rest.converter.AbstractConverter;
import com.poussin.consommationapi.rest.vo.ConsommationVo;
import com.poussin.consommationapi.service.ConsommationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping({"/consommation-api/consommations"})
public class ConsommationRest {

    @Autowired
    private ConsommationService consommationService;

    @Autowired
    @Qualifier("consommationConverter")
    private AbstractConverter<Consommation, ConsommationVo> consommationConverter;

   /* @PostMapping("/")
    public int creer(@RequestBody ConsommationVo consommationVo) {
        Consommation consommation = new ConsommationConverter().toItem(consommationVo);
        return consommationService.creer(consommation);
    }
*/
      @PostMapping("/")
    public int creer(@RequestBody Consommation consommation) {
        return consommationService.creer(consommation);
    }
    @GetMapping("/reference/{reference}")
    public Consommation findByReference(String reference) {
        return consommationService.findByReference(reference);
    }

    public AbstractConverter<Consommation, ConsommationVo> getConsommationConverter() {
        return consommationConverter;
    }

    public void setConsommationConverter(AbstractConverter<Consommation, ConsommationVo> consommationConverter) {
        this.consommationConverter = consommationConverter;
    }

    public ConsommationService getConsommationService() {
        return consommationService;
    }

    public void setConsommationService(ConsommationService consommationService) {
        this.consommationService = consommationService;
    }

}
