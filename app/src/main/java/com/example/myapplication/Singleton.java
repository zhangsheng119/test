package com.example.myapplication;

/**
 * description:
 * author:zhangsheng
 * create time:2020-12-31 11:14
 */
public class Singleton {
    static private Singleton instancel;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instancel == null) {

            synchronized (Singleton.class) {
                if (instancel == null) {
                    instancel = new Singleton();
                }
            }


        }
        return instancel;
    }
}
