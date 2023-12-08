package Main;

import java.io.File;
import java.util.Scanner;

public class Work_w_File {

    File file;

    public Work_w_File(String tenFile) {
        this.file = new File(tenFile);
    }

    public boolean checkExe() {
        return this.file.canExecute();
    }

    public boolean checkRead() {
        return this.file.canRead();
    }

    public boolean checkWrite() {
        return this.file.canWrite();
    }

    public void inPath() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inName() {
        System.out.println(this.file.getName());
    }

    public void checking() {
        if (this.file.isFile()) {
            System.out.println("Đây là file");
        } else if (this.file.isDirectory()) {
            System.out.println("Đây là thư mục");
        } else {
            System.out.println("Đây chả là cđj");
        }
    }

    public void inDS() {
        if (this.file.isDirectory()) {
            File[] con = this.file.listFiles();
            for (File file : con) {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public void inTree() {
        this.inTreeee(this.file, 1);
    }

    public void inTreeee(File f, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }

        System.out.println("|"+f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] con = f.listFiles();
            for (File file : con) {
                inTreeee(file, level + 1);
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luachon = 0;
        System.out.print("Nhập tên file : ");
        String f1;
        f1 = sc.nextLine();
        Work_w_File vdf = new Work_w_File(f1);
        do {
            System.out.println("---------MENU---------");
            System.out.println("1. Kiểm tra file có thể thực thi");
            System.out.println("2. Kiếm tra file có thể đọc");
            System.out.println("3. Kiểm tra file có thể ghi");
            System.out.println("4. In đường dẫn ");
            System.out.println("5. In tên file");
            System.out.println("6. Kiểm tra file là thư mục hay tập tin");
            System.out.println("7. In ra danh sách các file con");
            System.out.println("8. In ra cây thư mục");
            System.out.println("0. Thoát");

            luachon = sc.nextInt();
            sc.nextLine();
            if (luachon == 1) {
                if (vdf.checkExe()) {
                    System.out.println("File này có thể thực thi");
                } else {
                    System.out.println("File này không thể thực thi");
                }
            } else if (luachon == 2) {
                if (vdf.checkRead()) {
                    System.out.println("File này có thể đọc ");
                } else {
                    System.out.println("File này không thể đọc");
                }

            } else if (luachon == 3) {
                if (vdf.checkWrite()) {
                    System.out.println("File này có thể ghi ");
                } else {
                    System.out.println("File này không thể ghi");
                }

            } else if (luachon == 4) {
                vdf.inPath();

            } else if (luachon == 5) {
                vdf.inName();
            } else if (luachon == 6) {
                vdf.checking();
            } else if (luachon == 7) {
                vdf.inDS();
            } else if (luachon == 8) {
                vdf.inTree();
            }
        } while (luachon != 0);
    }
}
