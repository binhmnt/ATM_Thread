package Section4;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File f = new File("../f11");
        String S = f.isDirectory() ? "Thu muc" : "Tap tin";
        System.out.println("../f11 la: " + S);
        String L[] = f.list();
        System.out.println("Noi dung thu muc: ");
        for (int i = 0; i < L.length; ++i){
            File f2 = new File(L[i]);
            System.out.println(L[i] + " " + (f2.isFile()? "Tap tin" : "Thu muc"));
        }
    }

}
