package com.example.dyc.opencvtest;

/**
 * Created by dyc on 2018/1/4.
 */

public class JniKit {
    public static native int calculate(int num);
    static {
        System.loadLibrary("JniDemo");
    }

}
