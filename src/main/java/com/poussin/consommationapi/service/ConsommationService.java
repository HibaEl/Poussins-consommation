/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.service;

import com.poussin.consommationapi.bean.Consommation;


/**
 *
 * @author hp
 */
public interface ConsommationService {
    public Consommation findByReference(String reference);
    public int creer(Consommation consommation );
}
