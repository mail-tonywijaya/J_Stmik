/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author tonyw
 */
public class Mahasiswa 
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

            Integer tahunMasuk = json.getInt("TahunMasuk");
            String alamat = json.getString("Alamat");
            String jenisKelamin = json.getString("JenisKelamin");
            String jurusanProdi = json.getString("JP");
            String nama = json.getString("Nama");
            String nim = json.getString("NIM");
            //System.out.println(nim + " - " + nama);
            
            Vector<Object> columns = new Vector<Object>();
            columns.add(nim);
            columns.add(nama);
            columns.add(jenisKelamin);
            columns.add(jurusanProdi);
            columns.add(alamat);
            
            rows.add(columns);
        }
        
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("NIM");
        columnNames.add("Nama");
        columnNames.add("Jenis Kelamin");
        columnNames.add("JP");
        columnNames.add("Alamat");
        
        DefaultTableModel table = new DefaultTableModel(rows, columnNames);
        return table;
    }
    
    public JSONObject Simpan(String nim, String nama, String jenisKelamin, String tempatLahir, String tanggalLahir, String jurusanProdi, String alamat, String statusPernikahan, int tahunMasuk)
    {
        try 
        {
            nim = URLEncoder.encode(nim, StandardCharsets.UTF_8.toString());
            nama = URLEncoder.encode(nama, StandardCharsets.UTF_8.toString());
            jenisKelamin = URLEncoder.encode(jenisKelamin, StandardCharsets.UTF_8.toString());
            tempatLahir = URLEncoder.encode(tempatLahir, StandardCharsets.UTF_8.toString());
            tanggalLahir = URLEncoder.encode(tanggalLahir, StandardCharsets.UTF_8.toString());
            jurusanProdi = URLEncoder.encode(jurusanProdi, StandardCharsets.UTF_8.toString());
            alamat = URLEncoder.encode(alamat, StandardCharsets.UTF_8.toString());
            statusPernikahan = URLEncoder.encode(statusPernikahan, StandardCharsets.UTF_8.toString());
        }
        catch (UnsupportedEncodingException ex) 
        {
            Logger.getLogger(Mahasiswa.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        String url = "https://stmikpontianak.net/011100862/tambahMahasiswa.php" +
                "?nim=" + nim +
                "&nama=" + nama +
                "&jenisKelamin=" + jenisKelamin +
                "&tempatLahir=" + tempatLahir +
                "&tanggalLahir=" + tanggalLahir +
                "&jp=" + jurusanProdi +
                "&alamat=" + alamat +
                "&statusPernikahan=" + statusPernikahan +
                "&tahunMasuk=" + tahunMasuk;
        //System.out.println(url);
        
        WebApi wa = new WebApi();
        wa.setUrl(url);
        wa.get();
        
        //String json_string = wa.getJson_string();
        //System.out.println(json_string);
        
        JSONObject json = wa.getJson();
        return json;
    }
}
