/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._tugas2;

/**
 *
 * @author lenovo
 */
public class Tabung extends Lingkaran implements MenghitungRuang {
    
    private double tinggi, hasilVol, hasilLuasP;

    public Tabung(double r, double t) {
        super(r);
        tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return PHI * (super.getJari() * super.getJari()) * tinggi;
    }

    @Override
    public double hitungLuasP() {
        return 2 * (PHI * super.getJari()) * (super.getJari() + tinggi);
    }
    
}