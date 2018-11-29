package com.company;

public class CodeChecker {
    private int minLen, maxLen;
    private String symbol;
    public CodeChecker(int minLen, int maxLen, String symbol)
    {
        this.maxLen = maxLen;
        this.minLen = minLen;
        this.symbol = symbol;
    }
    public CodeChecker(String symbol)
    {
        this.maxLen = 20;
        this.symbol = symbol;
    }
}
