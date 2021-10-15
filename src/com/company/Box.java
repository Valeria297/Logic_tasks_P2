package com.company;

import java.io.Serializable;

public class Box implements Serializable {
    private int height;
    private int width;

    Box (int height, int width){
        this.height = height;
        this.width = width;
    }

    Box() {

    }

    @Override
    public String toString() {
        return "Box " + width + ", " + height;
    }

}
