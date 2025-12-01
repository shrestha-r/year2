package DataStructues;

import DataStructues.MyList;

public class check {
    public static void main(String[] args) {
        MyList<String> l = new MyList<>();
        l.append("5");
        l.append("5");
        l.append("5");
        l.append("5");
        l.append("5");
        l.append("5");
        l.append("5");
        l.append("5");
        l.append("5");
        System.out.println(l.size);
        System.out.println(l);
    }
}
