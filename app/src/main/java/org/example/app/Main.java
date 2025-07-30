package org.example.app;


import org.apache.commons.lang3.StringUtils;
import org.example.mylib.Util;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, World!";

        String reversed1= StringUtils.reverse(text);
        System.out.println("Reversed (Commons Lang): " + reversed1);

        String reversed2 = Util.customReverse(text);
        System.out.println("Reversed (Custom Util): " + reversed2);
    }
}
