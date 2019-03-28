/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.service;

import com.poussin.consommationapi.bean.CategorieConsommation;
import com.poussin.consommationapi.bean.CategoriePricing;
import java.util.Date;

/**
 *
 * @author hp
 */
public interface CategoriePricingService {
  public Double findPrix(Date d, Date r);
  public CategoriePricing findByReference(String reference);
  public int creer(CategoriePricing categoriePricing);
  public void deleteByReference(String reference);
}
