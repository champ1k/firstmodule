package firstmodule;

import java.util.HashSet;
import java.util.Set;

public class CountUniqueNum {
    public  int count(int... numbers)
    {
        if(numbers.length==0)
        {
        throw new IllegalArgumentException("Initial array is empty!!!");
        }
        else if (numbers.length==1)
        {
            return numbers.length;
        }
        int countunique = 0;
        Set<Integer> intSet = new HashSet<Integer>();
        for(int i = 0,length = numbers.length;i<length;i++){
            if(intSet.add(numbers[i]))
            {
            countunique++;
            }
        }
        return countunique;
    }
}
