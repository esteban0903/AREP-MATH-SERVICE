package com.example.catalanaux;

import java.util.ArrayList;
public class CatalanLogic {
    public int catalan(int n) {
        if (n == 0){
            return 1;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += catalan(i) * catalan(n - 1 - i);
        }
        return result;
    }


    public String catalanSequence(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= value; i++) {
            list.add(catalan(i));
        }
        return list.toString();
    }
}