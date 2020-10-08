package com.company;

public class Dados {
    private int valor;


    public int getValor() {
        return valor;
    }

    public int tirar() {
        valor = (int)(Math.random() * 6.0D) + 1;
        return  valor;
    }

    public String toString(){
        return "Resultado: " + valor;
    }
}
