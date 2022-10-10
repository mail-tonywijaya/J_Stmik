/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tonywijaya.stmik;

/**
 *
 * @author tonyw
 */
public class Nilai 
{
    private double _presensi, _tugasTerstruktur, _uts, _uas, _totalNilai;
    private String _nilaiHuruf;

    public double getPresensi() {
        return _presensi;
    }

    public void setPresensi(double _presensi) {
        this._presensi = _presensi;
    }

    public double getTugasTerstruktur() {
        return _tugasTerstruktur;
    }

    public void setTugasTerstruktur(double _tugasTerstruktur) {
        this._tugasTerstruktur = _tugasTerstruktur;
    }

    public double getUts() {
        return _uts;
    }

    public void setUts(double _uts) {
        this._uts = _uts;
    }

    public double getUas() {
        return _uas;
    }

    public void setUas(double _uas) {
        this._uas = _uas;
    }

    public double getTotalNilai() {
        return _totalNilai;
    }

    public void setTotalNilai(double _totalNilai) {
        this._totalNilai = _totalNilai;
    }

    public String getNilaiHuruf() {
        return _nilaiHuruf;
    }

    public void setNilaiHuruf(String _nilaiHuruf) {
        this._nilaiHuruf = _nilaiHuruf;
    }
    
    public void hitungNilai()
    {
        _totalNilai = _presensi + _tugasTerstruktur + _uts + _uas;
        
        if (_totalNilai >= 80)
        {
            _nilaiHuruf = "A";
        }
        else if (_totalNilai >= 70)
        {
            _nilaiHuruf = "B";
        }
        else if (_totalNilai >= 60)
        {
            _nilaiHuruf = "C";
        }
        else if (_totalNilai >= 40)
        {
            _nilaiHuruf = "D";
        }
        else
        {
            _nilaiHuruf = "E";
        }
        
        if (_presensi < 7.5)
        {
            _nilaiHuruf = "E";
        }
        
        if (_tugasTerstruktur <= 0)
        {
            _nilaiHuruf = "E";
        }
        
        if (_uts <= 0)
        {
            _nilaiHuruf = "E";
        }
        
        if (_uas <= 0)
        {
            _nilaiHuruf = "E";
        }
    }
    
    public boolean validasiPresensi()
    {
        if (_presensi < 0 || _presensi > 10)
        {
            return false;
        }
        
        return true;
    }
    
    public boolean validasiTugasTerstruktur()
    {
        if (_tugasTerstruktur < 0 || _tugasTerstruktur > 20)
        {
            return false;
        }
        
        return true;
    }
    
    public boolean validasiUts()
    {
        if (_uts < 0 || _uts > 30)
        {
            return false;
        }
        
        return true;
    }
    
    public boolean validasiUas()
    {
        if (_uas < 0 || _uas > 40)
        {
            return false;
        }
        
        return true;
    }
}
