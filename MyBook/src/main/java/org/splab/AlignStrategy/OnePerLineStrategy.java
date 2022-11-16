package org.splab.AlignStrategy;

public class OnePerLineStrategy implements AlignStrategy {
    public void render(String p) {
        String[] words = p.split(" ");
        for (String word: words) {
            System.out.println(word);
        }
    }
}
