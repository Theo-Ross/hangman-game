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
        words.add("cream");
        words.add("cloud");
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
        words.add("fruit");
        words.add("watermelon");
        words.add("laptop");
        words.add("watermelon");
        words.add("zucchini");
        words.add("apricot");
        words.add("blackberry");
        words.add("cantaloupe");
        words.add("pergola");
        words.add("elderberry");
        words.add("fig");
        words.add("grapefruit");
        words.add("honeydew");
        words.add("llama");
        words.add("garden");
        words.add("kumquat");
        words.add("lime");
        words.add("melon");
        words.add("orange");
        words.add("pear");
        words.add("pineapple");
        words.add("quince");
        words.add("ramen");
        words.add("xylophone");
        words.add("yellow");
        words.add("joker");
        words.add("screen");
        words.add("book");
        words.add("colour");
        words.add("keyboard");
        words.add("tea");
        words.add("piano");
        words.add("phone");
        words.add("desk");
        words.add("pen");
        words.add("sofa");
        words.add("window");
        words.add("jigsaw");
        words.add("puzzle");
        words.add("picture");
        words.add("flower");
        words.add("mirror");
    }

    private String word = " ";

    public String getWord() {
        return word;
    }
    public void setWord() {
      this.word = words.get(RANDOM.nextInt(words.size()));
    }
}
