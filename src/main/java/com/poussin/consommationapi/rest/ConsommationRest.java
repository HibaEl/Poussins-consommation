/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest;

import com.poussin.consommationapi.bean.Consommation;
import com.poussin.consommationapi.rest.converter.AbstractConverter;
import com.poussin.consommationapi.rest.converter.ConsommationConverter;
import com.poussin.consommationapi.rest.vo.ConsommationVo;
import com.poussin.consommationapi.rest.vo.RechercheConsommationVo;
import com.poussin.consommationapi.service.CategorieConsommationService;
import com.poussin.consommationapi.service.ConsommationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@RequestMapping({"/consommation-api/consommations"})
public class ConsommationRest {

    @Autowired
    private ConsommationService consommationService;
    @Autowired
    private CategorieConsommationService categorieConsommationService;

    @Autowired
    @Qualifier("consommationConverter")
    private AbstractConverter<Consommation, ConsommationVo> consommationConverter;

    @PostMapping("/find")
    public List<ConsommationVo> findByReferenceFirmeAndAnneeAndSemaine(@RequestBody RechercheConsommationVo rechercheVo) {
        final List<Consommation> consommations = consommationService.findByReferenceFirmeAndAnneeAndSemaine(rechercheVo.getReferenceFirme(), new Integer(rechercheVo.getAnnee()), new Integer(rechercheVo.getSemaine()));
        return consommationConverter.toVo(consommations);

    }

    @DeleteMapping("/{reference}")
    public void deleteByReference(@PathVariable("reference") String reference) {
        consommationService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int creer(@RequestBody ConsommationVo consommationVo) {
        Consommation consommation = new ConsommationConverter().toItem(consommationVo);
        return consommationService.creer(consommation);
    }

    /*
    @PostMapping("/")
    public int creer(@RequestBody Consommation consommation) {
        return consommationService.creer(consommation);
    }*/
    @GetMapping("/semaine/{semaine}/referenceFirme/{referenceFirme}/annee/{annee}")
    public int calculSommmeFourniture(@PathVariable Integer semaine, @PathVariable String referenceFirme, @PathVariable Integer annee) {
        return consommationService.calculSommmeFourniture(semaine, referenceFirme, annee);
    }

    @GetMapping("/annees/{annees}/semaines/{semaines}/referenceFirmes/{referenceFirmes}")
    public int calculSommmeMedicamment(@PathVariable Integer annees, @PathVariable Integer semaines, @PathVariable String referenceFirmes) {
        return consommationService.calculSommmeMedicamment(annees, semaines, referenceFirmes);
    }

    @GetMapping("/reference/{reference}")
    public ConsommationVo findByReference(@PathVariable("reference") String reference) {
        final Consommation consommation = consommationService.findByReference(reference);
        return consommationConverter.toVo(consommation);
    }

    /* @GetMapping("/reference/{reference}")
    public ConsommationVo findByReference(@PathVariable String reference) {
        return consommationConverter.toVo(consommationService.findByReference(reference));
    }
     */
    @GetMapping("/")
    public List<ConsommationVo> findAll() {
        return consommationConverter.toVo(consommationService.findAll());
    }

    public ConsommationService getConsommationService() {
        return consommationService;
    }

    public void setConsommationService(ConsommationService consommationService) {
        this.consommationService = consommationService;
    }

    public CategorieConsommationService getCategorieConsommationService() {
        return categorieConsommationService;
    }

    public void setCategorieConsommationService(CategorieConsommationService categorieConsommationService) {
        this.categorieConsommationService = categorieConsommationService;
    }

    public AbstractConverter<Consommation, ConsommationVo> getConsommationConverter() {
        return consommationConverter;
    }

    public void setConsommationConverter(AbstractConverter<Consommation, ConsommationVo> consommationConverter) {
        this.consommationConverter = consommationConverter;
    }

}
