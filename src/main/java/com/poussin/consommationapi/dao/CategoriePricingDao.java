/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.dao;

import com.poussin.consommationapi.bean.CategoriePricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface CategoriePricingDao extends JpaRepository<CategoriePricing, Long>{
   public  CategoriePricing findByReference(String reference);
   public void deleteByReference(String reference);
}
