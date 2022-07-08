package crawJena;

import ShowData.TouristDescription;

import java.io.*;
import java.util.Scanner;

public class SaveTxtFile {
    public static void main(String args[]) throws IOException {

        String pathName="src/fileout/";
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter Name of file you want to save:");
        String text =sc.nextLine();
        File file = new File(pathName+text);
        file.createNewFile();
        OutputStream outputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        TouristDescription TD = new TouristDescription();
        String[][] a= TD.getDataTourist(3);
        int dem = TD.getDem();
        for(int i=0;i<dem;i++)
        {
            System.out.println(a[i][0]+"\n"+a[i][1]+"\n"+a[i][2]+"\n\n");
            outputStreamWriter.write(a[i][0]+"\n");
            outputStreamWriter.write(a[i][1]+"\n");
            outputStreamWriter.write(a[i][2]+"\n");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.flush();
    }
}
