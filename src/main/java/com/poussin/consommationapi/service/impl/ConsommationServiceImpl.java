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

    @Override
    public int creer(Consommation consommation) {
        Consommation c = findByReference(consommation.getReference());
        if (c != null) {
            return -1;
        } else {
            Calendar cal = Calendar.getInstance();
            cal.setTime(consommation.getDateConsommation());
            int week=cal.get(Calendar.WEEK_OF_YEAR);
            int year=cal.get(Calendar.YEAR);
            int month=cal.get(Calendar.MONTH);
            consommation.setSemaine(week);
            consommation.setAnnee(year);
            consommation.setMois(month+1);
            consommationDao.save(consommation);
            return 1;
        }

    }
 @Override
    public int calculSommmeFourniture(int semaine, String refFirme, int annee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calculSommmeMedicamment(int semaines, String refFirmes, int annees) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

   

}
