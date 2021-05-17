package Section4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteFileDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee("E001","Nguyen Van Long",111));
        employee.add(new Employee("E002","Tran Huyen Tran",211));
        employee.add(new Employee("E003","Do Duy Thu",322));

        File f = new File("Employees.txt");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employee x:
                    employee) {
                pw.println(x.getId()+"," + x.getName()+"," + x.getSalary());
            }
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
