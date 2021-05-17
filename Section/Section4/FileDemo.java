package Section4;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("f11.txt");
        System.out.println("Ten file la: " + f.getName());
        System.out.println("Ten file tuyet doi la: " + f.getAbsoluteFile());
        System.out.println("Duong dan tuyet doi la: " + f.getAbsolutePath());
        try {
            System.out.println("Path chuan la:" + f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println("Ngay cap nhat cuoi cung la: " + new Date(f.lastModified()));
        System.out.println("Thuoc tinh Hidden:" + f.isHidden());
        System.out.println("Thuoc tinh can-read: " + f.canRead());
        System.out.println("Thuoc tinh can-write: " + f.canWrite());
        System.out.println("Kich thuoc " + f.length() + " bytes");
    }
}
