/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.converter;

import com.poussin.consommationapi.bean.CategorieConsommation;
import com.poussin.consommationapi.bean.CategoriePricing;
import com.poussin.consommationapi.rest.vo.CategorieConsommationVo;
import org.springframework.stereotype.Component;

/**
 *
 * @author hp
 */
@Component
public class CategorieConsommationConverter extends AbstractConverter<CategorieConsommation, CategorieConsommationVo> {

    @Override
    public CategorieConsommation toItem(CategorieConsommationVo vo) {
        if (vo == null) {
            return null;
        } else {
            CategorieConsommation item = new CategorieConsommation();
            item.setReference(vo.getReference());
            item.setId(vo.getId());
            item.setLibelle(vo.getLibelle());
            item.setCategoriePricing(new CategoriePricingConverter().toItem(vo.getCategoriePricingVo()));
            item.setTypeConsommation(new TypeConsommationConverter().toItem(vo.getTypeConsommationVo()));
            return item;
            
        }
    }

    @Override
    public CategorieConsommationVo toVo(CategorieConsommation item) {
        if (item == null) {
            return null;
        } else {
            CategorieConsommationVo vo = new CategorieConsommationVo();
            vo.setReference(item.getReference());
            vo.setId(item.getId());
            vo.setLibelle(item.getLibelle());
            vo.setCategoriePricingVo(new CategoriePricingConverter().toVo(item.getCategoriePricing()));
            vo.setTypeConsommationVo(new TypeConsommationConverter().toVo(item.getTypeConsommation()));
            return vo;
        }
    }

}
