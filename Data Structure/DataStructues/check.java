package DataStructues;

import DataStructues.MyList;

public class check {
    public static void main(String[] args) {
        MyList<String> l = new MyList<>();
        l.add("3");
        l.add("2");
        l.add("1");

        System.out.println(l);
        System.out.println(l.size());
        l.add("0", 3);
        System.out.println(l);
        System.out.println(l.size());

        l.remove(1);
        System.out.println(l);
        System.out.println(l.size());
    }
}
