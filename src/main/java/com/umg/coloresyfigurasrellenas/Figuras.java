package com.umg.coloresyfigurasrellenas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Figuras extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawCircles(g);
  }

  public void drawCircles(Graphics g) {
    int radius = 40;
    int diameter = 80;
    boolean state = true;
    Color color1 = getRandomColor();
    Color color2 = getRandomColor();
    for (int i = 5; i > 0; i--) {
      if (state) {
        g.setColor(color2);
        state = false;
      } else {
        g.setColor(color1);
        state = true;
      }
      g.fillOval(
          getWidth() / 2 - i * radius, getHeight() / 2 - i * radius, diameter * i, diameter * i);
    }
  }

  public Color getRandomColor() {
    int r = getRandomNumber();
    int gr = getRandomNumber();
    int b = getRandomNumber();
    int a = getRandomNumber();
    Color color = new Color(r, gr, b, a);
    return color;
  }

  public int getRandomNumber() {
    Random random = new Random();
    return random.nextInt(256);
  }
}
