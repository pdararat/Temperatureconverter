package com.example.temperatureconverter.Model;
public class body {
    private int number;
    public body(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double f_c(){
        return (number-32)/1.8;
    }
    public int c_f(){
        return (int)((number*1.8)+32);
    }
}