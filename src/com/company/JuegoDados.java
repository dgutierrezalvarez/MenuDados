package com.company;

import java.sql.SQLOutput;

public class JuegoDados {
    Dados[] dados = new Dados[3];

    void juego() {
        for (int i = 0; i < 3; i++) {
            dados[i] = new Dados();
            dados[i].tirar();
        }

    }

    public boolean jugar()  {
        dados[0].tirar();
        dados[1].tirar();
        dados[2].tirar();
        return dados[0].getValor() == dados[1].getValor() && dados[1].getValor() == dados[2].getValor();
    }

    @Override
    public String toString() { return "JuegoDados{" +
                "dados1: " + dados[0].getValor() +  " " +
                "dados2: " + dados[1].getValor() + " " +
                "dados3: " + dados[2].getValor() + " " +
                '}';
    }
}
