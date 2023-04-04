package org.example;

import javax.swing.*;

public class InversorString {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Informe a palavra para ser invertida:");
        String resultado = "";

        for (int i = palavra.length(); i > 0; i--) {
            resultado += palavra.charAt(i - 1);
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
