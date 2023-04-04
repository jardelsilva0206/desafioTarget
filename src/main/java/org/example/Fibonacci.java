package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        int numeroVerificador = 0;
        lista.add(0);
        lista.add(1);
        boolean pertence = false;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para verificação de" +
                " pertencimento a sequência Fibonacci:"));
        while (numeroVerificador <= numero) {
            numeroVerificador = lista.get(lista.size() - 1) + lista.get(lista.size() - 2);
            lista.add(numeroVerificador);
            if (numeroVerificador == numero) {
                pertence = true;
            }
        }
        if (pertence) {
            JOptionPane.showMessageDialog(null, "Número "+numero+" pertence a sequência Fibonacci");
        } else {
            JOptionPane.showMessageDialog(null, "Número não pertence a sequência Fibonacci");
        }
    }
}
