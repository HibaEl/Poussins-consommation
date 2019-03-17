/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.converter;

import com.poussin.consommationapi.bean.CategorieConsommation;
import com.poussin.consommationapi.bean.Consommation;
import com.poussin.consommationapi.rest.vo.CategorieConsommationVo;
import com.poussin.consommationapi.rest.vo.ConsommationVo;
import com.poussin.consommationapi.service.ConsommationService;
import com.poussin.consommationapi.util.DateUtil;
import com.poussin.consommationapi.util.NumberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author hp
 */
@Component
public class ConsommationConverter extends AbstractConverter<Consommation, ConsommationVo> {
    
   
    @Override
    public Consommation toItem(ConsommationVo vo) {
        if (vo == null) {
            return null;
        } else {
            Consommation item = new Consommation();
            item.setReference(vo.getReference());
            item.setId(vo.getId());
            item.setDateConsommation(DateUtil.parseCommandeStyle(vo.getDateConsommation()));
            item.setNbreMale(NumberUtil.toIn(vo.getNbreMale()));
            item.setNbreFemale(NumberUtil.toIn(vo.getNbreFemale()));
            item.setQte(NumberUtil.toIn(vo.getQte()));
            item.setSemaine(NumberUtil.toIn(vo.getSemaine()));
            item.setAnnee(NumberUtil.toIn(vo.getAnnee()));
            item.setMois(NumberUtil.toIn(vo.getMois()));
            item.setReferenceFirme(vo.getReferenceFirme());
            item.setCategorieConsommation(new CategorieConsommationConverter().toItem(vo.getCategorieConsommationVo()));
            return item;
        }
    }
    
    @Override
    public ConsommationVo toVo(Consommation item) {
        if (item == null) {
            return null;
        } else {
            ConsommationVo vo = new ConsommationVo();
            vo.setReference(item.getReference());
            vo.setId(item.getId());
            vo.setDateConsommation(DateUtil.formatYYYYMMDDmmhhSS(item.getDateConsommation()));
            vo.setNbreMale(NumberUtil.toStringInt(item.getNbreMale()));
            vo.setNbreFemale(NumberUtil.toStringInt(item.getNbreFemale()));
            vo.setQte(NumberUtil.toStringInt(item.getQte()));
            vo.setSemaine(NumberUtil.toStringInt(item.getSemaine()));
            vo.setAnnee(NumberUtil.toStringInt(item.getAnnee()));
            vo.setMois(NumberUtil.toStringInt(item.getMois()));
            vo.setReferenceFirme(item.getReferenceFirme());
            vo.setCategorieConsommationVo(new CategorieConsommationConverter().toVo(item.getCategorieConsommation()));
            return vo;
        }
    }
    
      
}
