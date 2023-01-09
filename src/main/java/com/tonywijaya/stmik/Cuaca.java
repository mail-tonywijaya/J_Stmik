/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author tonyw
 */
public class Cuaca 
{
    private JSONArray json_array;

    public JSONArray getJson_array() {
        return json_array;
    }

    public void setJson_array(JSONArray json_array) {
        this.json_array = json_array;
    }
    
    public DefaultTableModel getDefaultTableModel()
    {
        Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
        
        for (Object json_array_item : json_array)
        {
            //System.out.println(json_array_item);
            String json_string = String.valueOf(json_array_item);
            JSONObject json = new JSONObject(json_string);

            String tanggalWaktu = json.getString("dt_txt");
            //System.out.println(tanggalWaktu);
            
            JSONArray json_array_weather = json.getJSONArray("weather");
            JSONObject json_weather = json_array_weather.getJSONObject(0);
            String cuaca = json_weather.getString("main") + " - " + json_weather.getString("description");
            
            JSONObject json_main = json.getJSONObject("main");
            double tempMin = json_main.getDouble("temp_min");
            double tempMax = json_main.getDouble("temp_max");
            
            tempMin = KelvinKeCelcius(tempMin);
            tempMax = KelvinKeCelcius(tempMax);
            
            Format f = new Format();
            String suhu = f.Angka2Desimal(tempMin) + " - " + f.Angka2Desimal(tempMax) + "°C";
            
            Vector<Object> columns = new Vector<Object>();
            columns.add(tanggalWaktu);
            columns.add(cuaca);
            columns.add(suhu);
            
            rows.add(columns);
        }
        
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("Tanggal / Waktu");
        columnNames.add("Cuaca");
        columnNames.add("Suhu");
        
        DefaultTableModel table = new DefaultTableModel(rows, columnNames);
        return table;
    }
    
    private double KelvinKeCelcius(double Kelvin)
    {
        double celcius = Kelvin - 273;
        return celcius;
    }
}
