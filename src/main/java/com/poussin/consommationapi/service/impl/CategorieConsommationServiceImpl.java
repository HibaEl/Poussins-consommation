/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.service.impl;

import com.poussin.consommationapi.bean.CategorieConsommation;
import com.poussin.consommationapi.dao.CategorieConsommationDao;
import com.poussin.consommationapi.service.CategorieConsommationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class CategorieConsommationServiceImpl implements CategorieConsommationService {

    @Autowired
    public CategorieConsommationDao categorieConsommationDao;

    @Override
    public List<CategorieConsommation> findAllCat() {
        return categorieConsommationDao.findAll();
    }

}
