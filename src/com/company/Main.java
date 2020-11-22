package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координаты 1-ой точки (x,y,z)");
        Scanner in = new Scanner(System.in);
        String[] xyz1 = (in.nextLine().split(" "));
        Point3d point1 = new Point3d(Double.parseDouble(xyz1[0]), Double.parseDouble(xyz1[1]), Double.parseDouble(xyz1[2]));
        System.out.println();
        System.out.println("Введите координаты 2-ой точки (x,y,z)");
        String[] xyz2 = (in.nextLine().split(" "));
        Point3d point2 = new Point3d(Double.parseDouble(xyz2[0]), Double.parseDouble(xyz2[1]), Double.parseDouble(xyz2[2]));
        System.out.println();
        System.out.println("Вевдите координаты 3-й точки (x,y,z)");
        String[] xyz3 = in.nextLine().split(" ");
        Point3d point3 = new Point3d(Double.parseDouble(xyz3[0]), Double.parseDouble(xyz3[1]), Double.parseDouble(xyz3[2]));
        if (point1.compare(point2) || point2.compare(point3) || point3.compare(point1)) {
            System.out.println();
            System.out.println("2-3 точки имеют одинаковые координаты");
        } else {
            System.out.println();
            System.out.println("Площадь треугольника = " + computerArea(point1, point2, point3));
        }
    }

    public static double computerArea(Point3d p1, Point3d p2, Point3d p3) {
        double a1 = p1.distanceTo(p2);
        double b1 = p2.distanceTo(p3);
        double c1 = p3.distanceTo(p1);
        double p = (a1 + b1 + c1) / 2.0;
        return Math.sqrt(p * (p - a1) * (p - b1) * (p - c1));
    }
}
