package com.google.mlkit.vision.demo;

public class PoseCounter {
    private static int x=0;
    private static int y=0;
    private static int z=0;

    public static void countLeftInit(){
        x=1;
    }
    public static void countLeftDeInit(){
        x=0;
    }
    public static void countRightInit(){
        z=1;
    }
    public static void countRightDeInit(){
        z=0;
    }
    public static void count(){
        y++;
    }
    public static int getCount(){
        return y;
    }
    public static int getInit(){
        return x;
    }
}
