/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classebigdecimalbiginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author hbraga
 */
public class ClasseBigDecimalBigInteger {

    public static void main(String[] args) {
        // Tentando fazer um calculo exata em java (resposta errada)
        double a = 0.3;
        double b = 0.4;
        double c = b - a;
        System.out.println(c);
        
        
        // Usando classe BigDecimal (Sempre que precisarmos de precisão nos calculos é recomendado que usemos as classes BigDecimal e BigInteger)
        // Também podemos usar a classe BigDecimal no lugar do long
        
        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println(_c);
        
        // Usando a classe BigInteger
        
        BigInteger _n = new BigInteger("4000000000000000000");
        BigInteger _m = new BigInteger("90990361616161665165");
        BigInteger _k = _m.subtract(_n);
        System.out.println(_k);
    }
}
