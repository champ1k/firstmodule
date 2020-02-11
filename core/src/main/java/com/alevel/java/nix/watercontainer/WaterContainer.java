package com.alevel.java.nix.watercontainer;

public class WaterContainer {
    public int maxArea(int... height)
    {
        if(height.length <= 2)
        {
            throw new IllegalArgumentException("Initial array length can't be less than 2");
        }
        int maxarea = 0;
        int firstpointer = 0;
        int lastpointer = height.length-1;
        while(firstpointer<lastpointer)
        {
            if(height[firstpointer]<height[lastpointer])
            {
                maxarea = Math.max(maxarea,height[firstpointer]*(lastpointer-firstpointer));
                firstpointer++;
            }
            else
            {
                maxarea = Math.max(maxarea,height[lastpointer]*(lastpointer-firstpointer));
                lastpointer--;
            }
        }
        return maxarea;
    }
}
