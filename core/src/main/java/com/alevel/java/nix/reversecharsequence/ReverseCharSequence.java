package com.alevel.java.nix.reversecharsequence;

public class ReverseCharSequence implements CharSequence{

    private CharSequence original ;

    public ReverseCharSequence(CharSequence original)
    {
        if(original == "")
        {
            throw new IllegalArgumentException("CharSequence is empty!!!");
        }
        else
        {
            this.original = original;
        }
    }

    @Override
    public int length()
    {
        return original.length();
    }
    @Override
    public char charAt(int index)
    {
        return original.charAt(original.length() - index - 1);
    }
    @Override
    public CharSequence subSequence(int start, int end)
    {
        int originalEnd = original.length() - start;
        int originalStart = original.length() - end;
        return new ReverseCharSequence(original.subSequence(originalStart, originalEnd));
    }
    @Override
    public String toString()
    {
        return new StringBuilder(this).toString();
    }
}
