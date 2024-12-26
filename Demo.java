import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions of the Box:");
        System.out.print("length: "); int length = sc.nextInt();
        System.out.print("width: "); int width = sc.nextInt();
        System.out.print("height: "); int height = sc.nextInt();
        
        Box box = new Box(length, width, height);
        System.out.println("Volume of the Box: " + box.getVolume());
        sc.close();
    }
}
