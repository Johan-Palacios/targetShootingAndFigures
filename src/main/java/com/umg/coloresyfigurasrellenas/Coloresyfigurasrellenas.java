package com.umg.coloresyfigurasrellenas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Coloresyfigurasrellenas {

  public static void main(String[] args) {
    Figuras panel = new Figuras();
    RandomFiguras randomFiguras = new RandomFiguras();
    JFrame aplicacion = new JFrame();
    String option = JOptionPane.showInputDialog(null, "1. Tiro al blanco\n2. Figuras al Azar");
    int number = Integer.parseInt(option);

    aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    aplicacion.setSize(1000, 1000);
    aplicacion.setVisible(true);
    switch (number) {
      case 1:
        while (true) {
          try {
            panel = new Figuras();
            aplicacion.add(panel);
            aplicacion.setSize(1000, 1000);
            aplicacion.setVisible(true);
            Thread.sleep(1000);
          } catch (InterruptedException e) {
          }
        }
      case 2:
        aplicacion.add(randomFiguras);
        aplicacion.setSize(1000, 1000);
        aplicacion.setVisible(true);
        break;

      default:
        break;
    }
  }
}
