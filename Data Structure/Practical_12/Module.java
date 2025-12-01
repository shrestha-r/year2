package Practical_12;

public class Module implements Comparable{
    private String module_code, name, grade;
    int credits;
    enum Year {Year1, Year2, PlacementYear,FinalYear};


@Override
public int compareTo(Module other) {
    return this.module_code.compareTo(other.module_code);
}

}
