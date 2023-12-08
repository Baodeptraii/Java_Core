package Main;

import java.io.*;

public class VD_Out {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Studying Code Project\\Java\\My_Java\\QL_DSSV_Vipro\\file.txt");

            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien sv = new SinhVien("0051601","Bádảo",20004, 3F);
            oos.writeObject(sv);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
