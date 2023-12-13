package app;

import control.PointController;
import data.Point;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(1,1);

        PointController pointController = new PointController();

        pointController.addX(point);
        pointController.addY(point);

        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}