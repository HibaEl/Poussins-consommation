/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.converter;

import com.poussin.consommationapi.bean.TypeConsommation;
import com.poussin.consommationapi.rest.vo.TypeConsommationVo;

/**
 *
 * @author hp
 */
public class TypeConsommationConverter extends AbstractConverter<TypeConsommation, TypeConsommationVo> {

    @Override
    public TypeConsommation toItem(TypeConsommationVo vo) {
        if (vo == null) {
            return null;
        } else {
            TypeConsommation item = new TypeConsommation();
            item.setId(vo.getId());
            item.setLibelle(vo.getLibelle());
            return item;
        }
    }

    @Override
    public TypeConsommationVo toVo(TypeConsommation item) {
        if (item == null) {
            return null;
        } else {
            TypeConsommationVo vo = new TypeConsommationVo();
            vo.setId(item.getId());
            vo.setLibelle(item.getLibelle());
            return vo;
        }
    }

}
