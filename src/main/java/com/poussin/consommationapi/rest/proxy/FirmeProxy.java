/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.rest.proxy;

import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 * @author hp
 */
@FeignClient(name = "microservice-firme",url = "localhost:8099")
public class FirmeProxy {
    
}
