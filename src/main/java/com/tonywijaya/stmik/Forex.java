/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/**
 *
 * @author tonyw
 */
public class Forex 
{
    private JSONObject _json;

    public JSONObject getJson() {
        return _json;
    }

    public void setJson(JSONObject _json) {
        this._json = _json;
    }
    
    public DefaultTableModel getDefaultTableModel()
    {
        Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
        
        JSONObject rates = _json.getJSONObject("rates");
        double usd = rates.getDouble("IDR");
        double myr = usd / rates.getDouble("MYR");
        double bnd = usd / rates.getDouble("BND");
        double sgd = usd / rates.getDouble("SGD");
        double aud = usd / rates.getDouble("AUD");
        
        System.out.println("USD : " + usd);
        System.out.println("MYR : " + myr);
        System.out.println("BND : " + bnd);
        System.out.println("SGD : " + sgd);
        System.out.println("AUD : " + aud);
        
        Format f = new Format();
        
        Vector<Object> columns = new Vector<Object>();
        columns.add("USD");
        columns.add(f.MataUang(usd, "id", "ID"));
        rows.add(columns);
        
        columns = new Vector<Object>();
        columns.add("MYR");
        columns.add(f.MataUang(myr, "id", "ID"));
        rows.add(columns);
        
        columns = new Vector<Object>();
        columns.add("BND");
        columns.add(f.MataUang(bnd, "id", "ID"));
        rows.add(columns);
        
        columns = new Vector<Object>();
        columns.add("SGD");
        columns.add(f.MataUang(sgd, "id", "ID"));
        rows.add(columns);
        
        columns = new Vector<Object>();
        columns.add("AUD");
        columns.add(f.MataUang(aud, "id", "ID"));
        rows.add(columns);
        
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("Kode");
        columnNames.add("Kurs");
        
        DefaultTableModel table = new DefaultTableModel(rows, columnNames);
        return table;
    }
}
