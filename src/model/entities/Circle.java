package model.entities;

import model.entities.enums.Color;

public class Circle extends AbstractShape {
    private Double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
