package com.knoldus.LSP;

class Square extends Shape{
int length;

public Square(int length){
    this.length=length;
}
    @Override
    int getArea() {

        return length*length;
    }
}
