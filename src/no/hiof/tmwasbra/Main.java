package no.hiof.tmwasbra;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Film soul = new Film("soul", "animation", 123,
                LocalDate.of(2020, 12, 20));


        System.out.println(soul.getTittel() + " har en spille tid på " +
                soul.getSpilleTid() + " minutter");

        System.out.printf("%s har en spille tid på %d minutter", soul.getTittel(), soul.getSpilleTid());

    }
}
