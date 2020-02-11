package com.alevel.java.nix.maxsubstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MaxSubString {
    public int lengthOfLongestSubstring(String s)
    {
        if (s == "") {
            throw new IllegalArgumentException("Initial string can't be empty!");
        }
        Set<Character> charSet = new HashSet<Character>();
        int lengthlongessubstring = 0;
        int left = 0;
        int right = 0;
        while(right<s.length())
        {
            if(!charSet.contains(s.charAt(right)))
            {
                charSet.add(s.charAt(right));
                right++;
                lengthlongessubstring = Math.max(lengthlongessubstring,charSet.size());
            }
            else
            {
                charSet.remove(s.charAt(left));
                left++;
            }
        }
        return lengthlongessubstring;
    }
}
