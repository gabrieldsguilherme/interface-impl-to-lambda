package implementation;

import java.util.Comparator;

public class AscComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {
        return n1.compareTo(n2);
    }

}
