

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int i = 1;
        while (i < 11)
            System.out.print(" " + i++);
        System.out.println();
        for (int i1 = 10; i1 > 0; i1--) {
            System.out.print(" " + i1);
        }
        System.out.println();
        System.out.println("Задача №2");
        int friday = 5;
        System.out.println(" Сегодня пятница" + friday + "-е число");
        for (int i1 = 0; i1 < 3; i1++) {
             if(friday <= 31);
             friday=friday +7;
                System.out.println("Сегодня пятница " + friday + "-е число");
                }
        System.out.println("Задача №3");
        int star = 1822;
        for (int year = 1822;year <= 2122; year++ ){
            if(year %79 == 0){
                System.out.println(year);
            }
        }
            }
        }
