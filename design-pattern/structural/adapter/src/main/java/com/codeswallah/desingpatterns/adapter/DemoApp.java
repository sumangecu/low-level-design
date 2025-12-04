package com.codeswallah.desingpatterns.adapter;

public class DemoApp {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("Round peg fits the round hole");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(10);

        // Can i do this ?
//        hole.fits(smallSqPeg);
//        hole.fits(largeSqPeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largetSquarePegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSquarePegAdapter))
            System.out.println("Square peg w = 2 fits the round hole r = 5");

        if (!hole.fits(largetSquarePegAdapter))
            System.out.println("Square page w = 20 doesn't fit the round hole r = 5");
    }
}
