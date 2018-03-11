package com.codeclan.wordcountchecker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 18/12/2017.
 */


public class wordCounter {
    String words;

    public wordCounter(String words) {
        this.words = words;
    }

    public String[] splitTheWords(String target) {
        return target.split("\\s");
    }

    public Integer countTheWords() {
        return splitTheWords(words).length;
    }

    public HashMap extraSpecialWordCount() {
        HashMap hash;
        String[] new_list = words.split(" ");
        hash = new HashMap();
        int x;
        for (int i = 0; i < splitTheWords(words).length; i++) {
            hash.put(new_list[i], i);
            if (hash.containsKey(new_list[i])) {
                x = ((Integer) hash.get(new_list[i])).intValue();
                hash.put(new_list[i], new Integer(x + 1));
            }
        }
        return hash;

    }
}