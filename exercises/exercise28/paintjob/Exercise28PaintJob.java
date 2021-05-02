package de.renemeier.udemy.timbuchalka.exercises.exercise28.paintjob;

import java.util.Scanner;

public class Exercise28PaintJob {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inform the width: ");
        double width = keyboard.nextDouble();
        System.out.print("Inform the height: ");
        double height = keyboard.nextDouble();
        System.out.print("Area per bucket: ");
        double areaPerBucket = keyboard.nextDouble();
        System.out.print("Any extra buckets? if yes how many: ");
        int extraBuckets = keyboard.nextInt();
        System.out.println("Area to be painted = " + (width * height) + "\nArea per bucket = "
                + areaPerBucket + "\nExtra buckets = " + extraBuckets + "\nRequired additional buckets: " + getBucketCount(width, height, areaPerBucket, extraBuckets));

        keyboard.close();
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double bucketsNeeded = Math.ceil((width * height) / areaPerBucket);
            return (int) (bucketsNeeded - extraBuckets);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double bucketsNeeded = Math.ceil((width * height) / areaPerBucket);
            return (int) bucketsNeeded;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double bucketsNeeded = Math.ceil(area/areaPerBucket);
            return (int) bucketsNeeded;
        }
    }

}
