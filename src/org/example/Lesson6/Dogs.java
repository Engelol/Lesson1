package org.example.Lesson6;

class Dogs extends Animals {

    private static int count;
    public double jump;
    public int sweem;


    public Dogs(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void dogInfo() {
        System.out.println("DogName: " + name  + " \nRunLimit: " + run+ " meters" + "\nSweem:" + sweem + "\nJump: " +jump+ "  meters");
    }
}

