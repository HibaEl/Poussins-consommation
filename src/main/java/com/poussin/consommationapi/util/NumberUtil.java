/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.consommationapi.util;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author hp
 */
public class NumberUtil {

    private static final String CHAINE_VIDE = "";
    

    public static Integer toIn(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
    }
    public static String toStringInt(int value) {
        if (value == 0) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }
    }

    public static String toString(BigDecimal value) {
        if (value == null) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }
    }
    public static String toDouble(double value) {
        if (value == 0D) {
            return CHAINE_VIDE;
        } else {
            return String.valueOf(value);
        }
    }

    public static String toStringDate(Date value) {
        if (value == null) {
            return null;
        } else {
            return value.toString();
        }
    }

}
