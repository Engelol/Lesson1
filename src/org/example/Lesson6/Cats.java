package org.example.Lesson6;

class Cats extends Animals {

    private static int count;
    protected boolean sweem;
    int jump;


    public Cats(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
        count++;
    }

    public static int getCount() {
        return count;
    }


    public void catInfo() {
        System.out.println("CatName: " + name + "\nRunLimit: " + run+ " meters" + "\nSweem:" + sweem + "\nJump: " +jump+ " meters");
    }
}

