package pl.banaszewski.lukasz;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int pack = 0;
        do {
            if (bigCount > 0) {
                if (goal >= pack + 5) {
                    pack += 5;
                    bigCount -= 1;
                } else {
                    bigCount = 0;
                }
            }

            if (smallCount > 0) {
                if (goal >= pack + 1) {
                    pack += 1;
                    smallCount -= 1;
                } else {
                    smallCount = 0;
                }
            }

            if (pack >= goal) {
                return true;
            }

        } while (bigCount > 0 || smallCount > 0);

        return false;
    }
}
