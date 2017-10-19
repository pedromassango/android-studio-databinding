package com.pedromassango.databinding;

/**
 * Created by JM on 19/10/2017.
 */

public class Usuario {

    private String primeiroNome;
    private String segundoNome;
    private String idate;

    public Usuario(){

    }

    public Usuario(String primeiroNome, String segundoNome, String idate) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.idate = idate;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getIdate() {
        return idate;
    }

    public void setIdate(String idate) {
        this.idate = idate;
    }
}
