/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.dao;

import com.poussin.consommationapi.bean.Consommation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface ConsommationDao extends JpaRepository<Consommation, Long> {

    public Consommation findByReference(String reference);

 /*   @Query("select Sum(c.qte) from Consommation c where c.semaine= :semaine and c.annee= :annee and c.refFirme= :refFirme and c.typeConsommation.libelle= 'Fourniture'")
    public int calculSommmeFourniture(@Param("semaine") int semaine, @Param("reFirme") String refFirme, @Param("annee") int annee);

    @Query("select Sum(m.qte) from Consommation m where m.semaine= :semaines and m.annee= :annees and m.refFirme= :refFirmes and c.typeConsommation.libelle= 'Medicamment'")
    public int calculSommmeMedicamment(@Param("semaines") int semaines, @Param("reFirmes") String refFirmes, @Param("annees") int annees);
*/
}
