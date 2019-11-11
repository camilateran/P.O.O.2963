package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Iterator;
import javafx.scene.chart.PieChart.Data;

public class Students {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("STUDENTS");
        System.out.println("1.- Enter students");
        System.out.println("2.- List students");
        System.out.println("3.- Exit");
        int op = in.nextInt();
        switch (op) {
            case 1:
                List<Data> data = new ArrayList<Data>();
                System.out.println("Enter lastname: ");
                String ln = in.next();
               // data.add(new Data(ln));
                System.out.println("Grade 1: ");
                float not1 = in.nextFloat();
                //guaradar en clase data
                System.out.println("Grade 2: ");
                float not2 = in.nextFloat();
                //
                System.out.println("Grade 3: ");
                float not3 = in.nextFloat();
                //
                
                if (((not1+not2+not3)/3)>=14){
                    
                }
                
                CsvWriter csvWriter = new CsvWriter("student.csv");

                for (Data data1 : data) {
                    String[] datos = data1.getArray();

                    csvWriter.writeRecord(datos);
                }
                csvWriter.close();

                break;
            case 2:
                System.out.println("List");
                Iterator iter = data.iterator();
                while (iter.hasNext()) {
                    System.out.println(iter.next());
                }

        }

    }
    /*
     public static void ExportCSV(List<Data>data){
     String file = "students.csv";
     boolean exist = new File(file).exists();
     if (exist){
     File fileStudent = new File(file);
     fileStudent.delete();
     }
     try{
     CsvWriter exitCSV = new CsvWriter(new FileWriter(file), true);
            
     exitCSV.writer("Nombre");
            
     }
     }*/

}
