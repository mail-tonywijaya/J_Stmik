/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author tonyw
 */
public class WebApi 
{
    private JSONArray _json_array;
    private JSONObject _json;
    private String _url, _json_string;

    public String getUrl() {
        return _url;
    }

    public void setUrl(String _url) {
        this._url = _url;
    }

    public String getJson_string() {
        return _json_string;
    }

    public void setJson_string(String _json_string) {
        this._json_string = _json_string;
    }

    public JSONObject getJson() {
        _json = new JSONObject(_json_string);
        return _json;
    }

    public void setJson(JSONObject _json) {
        this._json = _json;
    }

    public JSONArray getJson_array() {
        _json_array = new JSONArray(_json_string);
        return _json_array;
    }

    public void setJson_array(JSONArray _json_array) {
        this._json_array = _json_array;
    }
    
    public void get()
    {
        try 
        {
            URLConnection uc = new URL(_url).openConnection();
            Scanner sn = new Scanner(uc.getInputStream());
            _json_string = new String();

            while (sn.hasNext())
            {
                _json_string += sn.nextLine();
            }
        } 
        catch (MalformedURLException ex) 
        {
            Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
