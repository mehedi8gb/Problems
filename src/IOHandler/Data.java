package IOHandler;

public class Data {
    private static String input;

    public static void setData(String input) {
        Data.input = input;
    }

    public static String getData() {
        return Data.input;
    }

    public static int getLength() {
        return Data.input.length();
    }
}
