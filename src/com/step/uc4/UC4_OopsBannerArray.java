package com.step.uc4;

public class UC4_OopsBannerArray {

    public static void main(String[] args) {

        String[] banner = {
                String.join(" ", "*   *", "****", "****", "****"),
                String.join(" ", "*   *", "*   *", "*   *", "*"),
                String.join(" ", "*   *", "****", "****", "****"),
                String.join(" ", "*   *", "*", "*", "   *"),
                String.join(" ", "*****", "****", "****", "****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}