package btl_001.model;

import java.io.Serializable;
import java.util.Scanner;

public class Category implements IEntity, Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private boolean status;

    public Category() {
    }

    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin thể loại sách:");

        // Validate
        System.out.println("Nhập mã thể loại:");
        // ID > 0 , nguyên dương, duy nhất
        try {
            id = Integer.parseInt(sc.nextLine());
            if(id <= 0 ){
                System.out.println("Không hợp lệ. ID phải lớn hơn 0");
            }
        } catch (Exception e){
            System.out.println("ID không hợp lệ. ID phải là số nguyên!!!");
        }

        System.out.println("Nhập tên thể loại:");
        name = sc.nextLine();
        System.out.println("Nhập trạng thái thể loại:");
        status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void output() {
        System.out.println("Mã thể loại: " + id);
        System.out.println("Tên thể loại: " + name);
        System.out.println("Trạng thái: " + status);
    }
}
