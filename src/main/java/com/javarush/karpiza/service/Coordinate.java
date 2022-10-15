package com.javarush.karpiza.service;

public record Coordinate(int x, int y) {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}