/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.service.impl;

import com.poussin.consommationapi.bean.Consommation;
import com.poussin.consommationapi.dao.ConsommationDao;
import com.poussin.consommationapi.service.ConsommationService;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class ConsommationServiceImpl implements ConsommationService {
    
    @Autowired
    private ConsommationDao consommationDao;
    @Autowired
    private ConsommationService consommationService;
    
    @Override
    public int creer(Consommation consommation) {
        Consommation c = findByReference(consommation.getReference());
        if (c != null) {
            return -1;
        } else {
            Calendar cal = Calendar.getInstance();
            cal.setTime(consommation.getDateConsommation());
            int week = cal.get(Calendar.WEEK_OF_YEAR);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            consommation.setSemaine(week);
            consommation.setAnnee(year);
            consommation.setMois(month + 1);
            consommationDao.save(consommation);
            return 1;
        }
        
    }
    
    @Override
    public int calculSommmeFourniture(Integer semaine, String referenceFirme, Integer annee) {
        return consommationDao.calculSommmeFourniture(semaine, referenceFirme, annee);
    }
    
    @Override
    public int calculSommmeMedicamment(Integer annees, Integer semaines, String referenceFirmes) {
        return consommationDao.calculSommmeMedicamment(annees, semaines, referenceFirmes);
    }
    
    @Override
    public List<Consommation> findByReferenceFirmeAndAnneeAndSemaine(String referenceFirme, Integer annee, Integer semaine) {
        return consommationDao.findByReferenceFirmeAndAnneeAndSemaine(referenceFirme, annee, semaine);
    }
    
    @Override
    public List<Consommation> findAll() {
        return consommationDao.findAll();
    }
    
    @Override
    public Consommation findByReference(String reference) {
        return consommationDao.findByReference(reference);
    }
    
    public ConsommationDao getConsommationDao() {
        return consommationDao;
    }
    
    public void setConsommationDao(ConsommationDao consommationDao) {
        this.consommationDao = consommationDao;
    }
    
    public ConsommationService getConsommationService() {
        return consommationService;
    }
    
    public void setConsommationService(ConsommationService consommationService) {
        this.consommationService = consommationService;
    }
    
    @Override
    public void deleteByReference(String reference) {
        Consommation c = consommationDao.findByReference(reference);
        consommationDao.delete(c);
    }
    
}
