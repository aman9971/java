package com.company;
class RectangleShape
{
    int length, width;
    void getData(int l , int b)
{
length = l;
width = b;
}
int findArea()
        {
        return(length*width);
        }
}
public class rectanglearea {
    public static void main(String[] args) {
RectangleShape obj = new RectangleShape();
obj.getData (10 ,8);
        System.out.println(obj.findArea());
    }
}
