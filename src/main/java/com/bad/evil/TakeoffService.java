package com.bad.evil;

public class TakeoffService {

    private String prefix;
    private String suffix;

    public TakeoffService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }
    public String wrap(String word) {
        return prefix + word + suffix;
    }

}
