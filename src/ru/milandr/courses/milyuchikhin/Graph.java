package ru.milandr.courses.milyuchikhin;

import com.sun.tools.javac.Main;

public class Graph {
  private double x;
  private double y;

  public Graph(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public double Length(Graph A) {
    return Math.sqrt(Math.pow(A.x - x, 2) + Math.pow(A.y - y, 2));
  }
  public String Equation(Graph A) {
    double k = Math.pow(A.y - this.y, 2) / Math.pow(A.x - this.x, 2);
    double b = this.y - k * this.x;
    if (b > 0)
      return String.format("Y = %.3f * X + %.3f\n", k, b);
    else if (b < 0)
      return String.format("Y = %.3f * X - %.3f\n", k, Math.abs(b));
    else
      return String.format("Y = %.3f * X\n", k);
  }
  //  варианты с окружностью не реализованы
}