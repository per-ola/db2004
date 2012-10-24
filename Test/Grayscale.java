import java.awt.Color;
public class Grayscale {
private static void grayscale(Picture pic){...}
public static void main(String[] cmdLn) {
Picture pic = new Picture(cmdLn[0]);
grayscale(pic);
pic.save("gray"+cmdLn[0]);
pic.show();
}
}