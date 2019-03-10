/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.proxy;

import com.poussin.consommationapi.rest.vo.exhange.FirmeVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author hp
 */
//@FeignClient(name = "microservice1-firme",url = "localhost:8099")
public interface FirmeProxy {
    @GetMapping("Firme/firmes/reference/{reference}")
    public FirmeVo findByReference(@PathVariable("reference") String reference);

}
