package implementation;

import java.util.function.Consumer;

public class PrintConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }

}
