//
// Created by dyc on 2018/1/4.
//
#include <com_example_dyc_opencvtest_JniKit.h>

JNIEXPORT jint JNICALL Java_com_example_dyc_opencvtest_JniKit_calculate(JNIEnv *env, jclass cls, jint num){
    return num*num;
}
