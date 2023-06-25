import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {10, 25, 16, 2, 3};
        int[] a2 = {5, 8, 6, 1};

        Logger logger = Logger.getAnonymousLogger();

        int[] c = makeArray(a1, a2);
        if (c.length == 0) {
            logger.info("Массивы не заполнены или имеют несовместимый размер!");
        } else {
            logger.info("Массив сформирован!");
            logger.info(Arrays.toString(c));
        }
    }

    public static int[] makeArray(int[] array1, int[] array2) {
        int[] c;
        if (array1.length != array2.length) {
            c = new int[]{};
        } else {
            c = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                c[i] = array1[i] - array2[i];
            }
        }
        return c;
    }
}
