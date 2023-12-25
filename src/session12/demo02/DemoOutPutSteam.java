package session12.demo02;

import java.io.*;

public class DemoOutPutSteam {
    public static void main(String[] args) throws IOException {
        File output = new File("data.txt");
//        if(output.isFile()){
//
//        }
        if (output.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
            outputStream.writeInt(500);
            outputStream.writeUTF("Nguyễn Văn Tiến");
            outputStream.writeBoolean(true);
            outputStream.close();
            System.out.println("Ghi file thành công");
        } else {
            System.out.println("Ghi thất bại!");
        }
    }
}
