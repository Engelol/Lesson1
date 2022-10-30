package org.example.Lesson6;

public class main {
    public static void main(String[] args) {

        Cats[] cats = new Cats[10];
        cats[0] = new Cats("Люцифер", 200, false, 3);
        cats[1] = new Cats("Китти", 150, false, 2);

        System.out.println("КОШКИ");
        cats[0].catInfo();
        cats[1].catInfo();
        System.out.println();

        System.out.println("СОБАКИ");
        Dogs[] dogs = new Dogs[10];
        dogs[0] = new Dogs("Кубик", 500, 10, 1);
        dogs[1] = new Dogs("Тишка", 450, 9, 2);
        dogs[2] = new Dogs("Барсик", 470, 9, 1);

        dogs[0].dogInfo();
        dogs[1].dogInfo();
        dogs[2].dogInfo();
        System.out.println();

        System.out.println();
        System.out.println("Всего кошек создано: " + (Cats.getCount()));
        System.out.println("Всего собак создано: " + (Dogs.getCount()));

           }
}
