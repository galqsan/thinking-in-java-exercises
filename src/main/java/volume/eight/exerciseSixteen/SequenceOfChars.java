package volume.eight.exerciseSixteen;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

//Exercise 16:Create a class that produces a sequence of chars.
// Adapt this class so that it can be an input to a Scanner object.
public class SequenceOfChars implements Readable {
    private int count;
    Random rand = new Random(47);

    SequenceOfChars(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1;
        for (int i = 0; i < 10; i++) {
            char c = (char) (rand.nextInt(26) + 'a');
            cb.append(c);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new SequenceOfChars(5));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
