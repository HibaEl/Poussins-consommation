/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.converter;

import com.poussin.consommationapi.bean.CategoriePricing;
import com.poussin.consommationapi.rest.vo.CategoriePricingVo;
import com.poussin.consommationapi.util.DateUtil;
import com.poussin.consommationapi.util.NumberUtil;
import org.springframework.stereotype.Component;

/**
 *
 * @author hp
 */
@Component
public class CategoriePricingConverter extends AbstractConverter<CategoriePricing, CategoriePricingVo> {

    @Override
    public CategoriePricing toItem(CategoriePricingVo vo) {
        if (vo == null) {
            return null;
        } else {
            CategoriePricing item = new CategoriePricing();
            item.setId(vo.getId());
            item.setPrix(NumberUtil.toIn(vo.getPrix()));
            item.setDateMin(DateUtil.parse(vo.getDateMin()));
            item.setDateMax(DateUtil.parse(vo.getDateMax()));
       //     item.setCategorieConsommation(new CategorieConsommationConverter().toItem(vo.getCategorieConsommationVo()));
            return item;
        }
    }

    @Override
    public CategoriePricingVo toVo(CategoriePricing item) {
        if (item == null) {
            return null;
        } else {
            CategoriePricingVo vo = new CategoriePricingVo();
            vo.setId(item.getId());
            vo.setPrix(NumberUtil.toDouble(item.getPrix()));
            vo.setDateMin(DateUtil.formateDate("yyyy-MM-dd",item.getDateMin()));
            vo.setDateMax(DateUtil.formateDate("yyyy-MM-dd",item.getDateMax()));
         //   vo.setCategorieConsommationVo(new CategorieConsommationConverter().toVo(item.getCategorieConsommation()));
            return vo;

        }

    }
}
