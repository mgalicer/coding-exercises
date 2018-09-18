import java.util.List;
import java.util.ArrayList;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> signs = new ArrayList<>();

        if((number & 1) == 1) signs.add(Signal.WINK);
        if((number & 2) == 2) signs.add(Signal.DOUBLE_BLINK);
        if((number & 4) == 4) signs.add(Signal.CLOSE_YOUR_EYES);
        if((number & 8) == 8) signs.add(Signal.JUMP);
        if((number & 16) == 16) signs = reverseList(signs);

        return signs;
    }

    private List<Signal> reverseList(List<Signal> list) {
        for(int i = 0; i < list.size()/2; i++) {
            Signal s = list.get(i);

            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, s);
        }
        return list;
    }

}