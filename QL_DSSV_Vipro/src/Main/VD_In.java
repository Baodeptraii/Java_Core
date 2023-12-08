package Main;

import java.io.*;

public class VD_In {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Studying Code Project\\Java\\My_Java\\QL_DSSV_Vipro\\file.txt");

            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien sv =(SinhVien) ois.readObject();
            System.out.println(sv.getMaSV());
            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
