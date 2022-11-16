package org.splab;

import org.splab.AlignStrategy.AlignLeftStrategy;
import org.splab.AlignStrategy.AlignRightStrategy;
import org.splab.AlignStrategy.OnePerLineStrategy;

public class Main {
        public static void main(String[] args) {

                Section cap1 = new Section("Capitolul 1");
                Paragraph p1 = new Paragraph("Paragraph 1");
                cap1.add(p1);
                Paragraph p2 = new Paragraph("Paragraph 2");
                cap1.add(p2);
                Paragraph p3 = new Paragraph("Paragraph 3");
                cap1.add(p3);
                Paragraph p4 = new Paragraph("Paragraph 4");
                cap1.add(p4);
                System.out.println("Printing without Alignment");
                System.out.println();
                cap1.print();
                p1.setAlignStrategy(new OnePerLineStrategy());
                p2.setAlignStrategy(new AlignRightStrategy());
                p3.setAlignStrategy(new AlignLeftStrategy());
                System.out.println();
                System.out.println("Printing with Alignment");
                System.out.println();
                cap1.print();
        }
}