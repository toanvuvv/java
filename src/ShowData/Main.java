package ShowData;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadTxt a =new ReadTxt();
        String[][] b = a.GetData(2);
        for(int i=0;i<a.getDem();i++)
        {
            for(int j=0;j<a.getSizes();j++)
                System.out.print(b[i][j]+'\n');
            System.out.print("\n");
        }
    }
}
