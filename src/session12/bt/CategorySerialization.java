package session12.bt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CategorySerialization {
    public static void main(String[] args) throws IOException {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1,"Danh mục A",true));
        list.add(new Category(2,"Danh mục B",false));
        list.add(new Category(3,"Danh mục C",true));
        list.add(new Category(4,"Danh mục D",true));

        File file = new File("category.txt");
        if(file.createNewFile()){
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            for (Category category : list) {
                outputStream.writeObject(category);
            }
            outputStream.close();
            System.out.println("Ghi thành công!");
        } else {
            System.out.println("Ghi thất bại!");
        }
    }
}
