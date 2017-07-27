package FieldAndComponents;

import java.lang.reflect.*;

/**
 * Created by Liuba on 18.05.2017.
 */
public class FieldSize {
    int length;
    int width;

    public FieldSize(int length, int width)
    {
        if (length <= 0) length = 1;
        if (width <= 0) width = 1;
        this.length = length;
        this.width = width;
    }
    public FieldSize(int n)
    {
        if (n <= 0) n = 1;
        length = n;
        width = n;
    }

    public int getLength()
    {
        return length;
    }
    public int getWidth() { return width; }
}
