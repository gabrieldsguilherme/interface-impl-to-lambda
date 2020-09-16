package implementation;

import java.util.Comparator;

public class DescComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer n1, Integer n2) {
        return n2.compareTo(n1);
    }

}
