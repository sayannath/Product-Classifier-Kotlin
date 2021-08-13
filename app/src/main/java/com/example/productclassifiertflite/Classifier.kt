package com.example.productclassifiertflite

abstract class Classifier {
    enum class Device {
        CPU,
        NNAPI,
        GPU
    }
}