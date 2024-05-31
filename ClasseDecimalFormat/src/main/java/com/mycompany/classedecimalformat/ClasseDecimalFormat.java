/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classedecimalformat;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author hbraga
 */
public class ClasseDecimalFormat {

    public static void main(String[] args) {
        // Formatando números de acordo com a localidade do computador
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        
        //df.applyLocalizedPattern(padrao);
        //df.applyPattern(padrao);
        
        System.out.println(df.format(123456789.123));
        
        // Formatando números de acordo com a localidade de outros paises
        
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        
        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(123456789.123));
        
        // Escolhendo o agrupamento de números
        String padrao3 = "###,###.###";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(1234567890.123));
        
        // Mostrando casas decimais
        String padrao4 = "###,###,###.00";
        df = new DecimalFormat(padrao4, dfs);
        System.out.println(df.format(1234567890.1));
    }
}
