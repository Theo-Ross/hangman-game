package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Words {

    private static final Random RANDOM = new Random();

    private static ArrayList<String> words = new ArrayList<>();

    static {
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");
        words.add("fig");
        words.add("grape");
        words.add("huckleberry");
        words.add("ice cream");
        words.add("jackfruit");
        words.add("kiwi");
        words.add("lemon");
        words.add("mango");
        words.add("nectarine");
        words.add("orange");
        words.add("peach");
        words.add("plum");
        words.add("quince");
        words.add("raspberry");
        words.add("strawberry");
        words.add("tangerine");
        words.add("ugli fruit");
        words.add("watermelon");
        words.add("xigua");
        words.add("yellow watermelon");
        words.add("zucchini");
        words.add("apricot");
        words.add("blackberry");
        words.add("cantaloupe");
        words.add("durian");
        words.add("elderberry");
        words.add("fig");
        words.add("grapefruit");
        words.add("honeydew");
        words.add("ilama");
        words.add("jambul");
        words.add("kumquat");
        words.add("lime");
        words.add("melon");
        words.add("orange");
        words.add("pear");
        words.add("pineapple");
        words.add("quince");
        words.add("rambutan");
        words.add("soursop");
    }

    private String word = " ";

    public String getWord() {
        return word;
    }
    public void setWord() {
      this.word = words.get(RANDOM.nextInt(words.size()));
    }
}
