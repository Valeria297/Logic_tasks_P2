package com.company;

import java.io.Serializable;

public class Box implements Serializable {
    private int length;
    private int height;
    private int width;
    private int volume;

    Box (int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
        volume = length * width * height;
    }

    Box() {

    }

    public int getVolume (Box box) {
        return volume;
    }

    @Override
    public String toString() {
        return "Box " + width + ", " + height;
    }

}
