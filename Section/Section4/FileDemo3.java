package Section4;

import java.io.*;

public class FileDemo3 {
    public static void main(String[] args) {
        File f = new File("Employees.txt");
        if (!f.exists()) return;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details = bf.readLine();
            System.out.println(details);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
