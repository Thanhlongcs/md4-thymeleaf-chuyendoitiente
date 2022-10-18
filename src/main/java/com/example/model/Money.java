package com.example.model;

public class Money {
    private double vnd;
    private double usd;
    private double rate;
    private double result;

    public Money() {
    }

    public Money(double vnd, double usd, double rate, double result) {
        this.vnd = vnd;
        this.usd = usd;
        this.rate = rate;
        this.result = result;
    }

    public double getVnd() {
        return vnd;
    }

    public void setVnd(double vnd) {
        this.vnd = vnd;
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Money{" +
                "vnd=" + vnd +
                ", usd=" + usd +
                ", rate=" + rate +
                ", result=" + result +
                '}';
    }
}
