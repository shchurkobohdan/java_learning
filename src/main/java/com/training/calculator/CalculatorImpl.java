package com.training.calculator;

import com.training.model.Point;

public class CalculatorImpl implements Calculator {
    @Override
    public double calculateDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }
}
