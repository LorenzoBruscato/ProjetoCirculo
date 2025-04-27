/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;
import model.Circulo;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setPi(Double.parseDouble(JOptionPane.
                showInputDialog("Digite o valor de pi:")));

        circulo.setRaio(Double.parseDouble(JOptionPane.
                showInputDialog("Digite o valor do raio: ")));

        JOptionPane.showMessageDialog(null, "A área do circulo é " + circulo.getArea());
    }
}
