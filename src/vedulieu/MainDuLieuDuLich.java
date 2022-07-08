package vedulieu;

import org.apache.jena.rdf.model.Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MainDuLieuDuLich {
    public static void main(String[] args) throws IOException {
        /*String pathName="D:\\20212\\midtermjava\\testjena\\src\\fliesaved\\";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Name of file you want to save:");
        String text =sc.nextLine();
        File file = new File(pathName+text);
        file.createNewFile();
        OutputStream outputStream = new FileOutputStream(file);*/
        DuLieuDuLich Data= new DuLieuDuLich();
        Data.setQuery(2);
        System.out.println(Data.getDem());
        for (int i = 0; i < Data.getDem(); i++)
        {
            Data.setData(i);
            System.out.println(Data.getLinkDulieu()+"\n"+Data.getAbtractDulieu()+"\n"+Data.getThumnailDulieu());
        }
    }
}
