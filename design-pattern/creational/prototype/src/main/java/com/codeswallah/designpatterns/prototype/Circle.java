package com.codeswallah.designpatterns.prototype;

import java.util.Objects;

public class Circle extends Shape {
    public int radius;

    public Circle() {}

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle || !super.equals(object))) return false;
        Circle circle2 = (Circle) object;
        return circle2.radius == this.radius;
    }
}
