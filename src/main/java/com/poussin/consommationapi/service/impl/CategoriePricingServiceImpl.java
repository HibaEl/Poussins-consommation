/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.service.impl;

import com.poussin.consommationapi.bean.CategoriePricing;
import com.poussin.consommationapi.dao.CategoriePricingDao;
import com.poussin.consommationapi.service.CategoriePricingService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class CategoriePricingServiceImpl implements CategoriePricingService {

    @Autowired
    private CategoriePricingDao categoriePricingDao;

    public int creer(CategoriePricing categoriePricing) {
        CategoriePricing p = findByReference(categoriePricing.getReference());
        if (p != null) {
            return -1;
        } else {
            categoriePricingDao.save(categoriePricing);
            return 1;
        }
    }

    @Override
    public void deleteByReference(String reference) {
        CategoriePricing categoriePricing = categoriePricingDao.findByReference(reference);
        categoriePricingDao.delete(categoriePricing);
    }

    @Override
    public Double findPrix(Date d, Date r) {
        List<CategoriePricing> categoriePricings = categoriePricingDao.findAll();
        if (categoriePricings == null && categoriePricings.isEmpty()) {
            return 0d;
        } else {
            for (CategoriePricing categoriePricing : categoriePricings) {
                System.out.println(categoriePricing);
                if (categoriePricing.getDateMax().before(r) && categoriePricing.getDateMin().after(d)) {
                    System.out.println("sir" + categoriePricing);
                    return categoriePricing.getPrix();
                }
            }
        }
        return 0d;
    }

    public CategoriePricingDao getCategoriePricingDao() {
        return categoriePricingDao;
    }

    public void setCategoriePricingDao(CategoriePricingDao categoriePricingDao) {
        this.categoriePricingDao = categoriePricingDao;
    }

    @Override
    public CategoriePricing findByReference(String reference) {
        return categoriePricingDao.findByReference(reference);
    }
}
