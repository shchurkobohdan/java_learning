package com.training.calculator;

import com.training.model.Point;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorImplTest {
    private final Calculator calculator = new CalculatorImpl();

    @Test
    public void calculateDistanceBetween2Points() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(1, 0);

        final double dist = calculator.calculateDistance(point1, point2);
        assertEquals(1.0, dist);
    }

    @Test
    public void calculateDistanceBetweenSamePoint() {
        Point point1 = new Point(0, 0);

        final double dist = calculator.calculateDistance(point1, point1);
        assertEquals(0.0, dist);
    }
}