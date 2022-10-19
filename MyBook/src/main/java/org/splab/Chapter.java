package org.splab;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String name;

    private final List<SubChapter> subChapterList;
    Chapter(String name) {
        this.name = name;
        subChapterList = new ArrayList<>();
    }

    int createSubChapter(String subChapterName) {
        subChapterList.add(new SubChapter(subChapterName));
        return subChapterList.size() - 1;
    }

    SubChapter getSubChapter(int subChapterIndex) {
        return subChapterList.get(subChapterIndex);
    }

    void print() {
        System.out.printf("Chapter title: %s%n", name);

        for (SubChapter sc: subChapterList) {
            sc.print();
        }
    }
}
