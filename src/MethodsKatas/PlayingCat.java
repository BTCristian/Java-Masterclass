package MethodsKatas;

public class PlayingCat {
    public static void main(String[] args) {

        System.out.println (isCatPlaying(true, 10));
        System.out.println (isCatPlaying(false, 33));
        System.out.println (isCatPlaying(true, 46));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature > 24 && temperature < 46;

        }else {
            return temperature > 24 && temperature < 36;
        }
    }
}
