package com.umg.coloresyfigurasrellenas;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class RandomFiguras extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawRandomShapes(g);
  }

  private void drawRandomShapes(Graphics g) {
    int shapeId;
    int x;
    int y;
    int width;
    int height;
    Color color;
    for (int i = 0; i <= 10; i++) {
      shapeId = getRandomNumber(2);
      x = getRandomNumber(getWidth());
      y = getRandomNumber(getHeight());
      width = getRandomNumber(getWidth());
      height = getRandomNumber(getHeight());
      color = getRandomColor();
      g.setColor(color);
      if (shapeId == 0) {
        g.fillOval(x, y, width, height);
      }
      if (shapeId == 1) {
        g.fillRect(x, y, width, height);
      }
    }
  }

  public Color getRandomColor() {
    int r = getRandomNumber(256);
    int gr = getRandomNumber(256);
    int b = getRandomNumber(256);
    int a = getRandomNumber(256);
    Color color = new Color(r, gr, b, a);
    return color;
  }

  public int getRandomNumber(int a) {
    Random random = new Random();
    return random.nextInt(a);
  }
}
