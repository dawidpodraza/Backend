package app;

import control.PointController;
import data.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(1,1);

        PointController pointController = new PointController();

        System.out.println("0-> dodaj 1 do X\n1-> dodaj 1 do Y");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice){
            case 0 -> pointController.addX(point);
            case 1 -> pointController.addY(point);
            default -> System.out.println("Zły wybór");
        }

        System.out.println(point.getX());
        System.out.println(point.getY());

    }
}