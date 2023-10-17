package com.pluralsight;

public class Colors {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue"};
        String [] copy = new String[3];

//  (what array I'm copying, at which point am i copying from, where do i want to copy it to,')
//     from where do I want to  paste it on my 2nd array, and how many elements am I copying)
        System.arraycopy(colors, 0, copy, 0, 3);
    }
}
