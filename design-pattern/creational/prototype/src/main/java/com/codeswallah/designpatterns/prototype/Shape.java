package com.codeswallah.designpatterns.prototype;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {}

    public abstract Shape clone();

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Shape)) return false;
        Shape shape2 = (Shape) object;
        return shape2.x == this.x && shape2.y == this.y && Objects.equals(shape2.color, this.color);
    }
}
