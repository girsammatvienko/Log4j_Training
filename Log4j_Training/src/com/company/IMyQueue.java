package com.company;

public interface IMyQueue {
    void enqueue(double val);
    double dequeue();
    double peak();
    int getSize();
    void clear();
}
