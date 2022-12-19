/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author tonyw
 */
public class Format 
{
    public String MataUang(double nominal, String bahasa, String negara)
    {
        Locale locale = new Locale(bahasa, negara);      
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        
        String mataUang = currencyFormatter.format(nominal);
        return mataUang;
    }
}
