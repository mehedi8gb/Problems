package IOHandler;

public class ReverseModel {
    private static String output = "";

    public static void reverse() {
        for (int i = Data.getLength() - 1; i >= 0; i--) {
            ReverseModel.output += Data.getData().charAt(i);
        }
    }

    public static String show() {
        return ReverseModel.output;
    }
}
