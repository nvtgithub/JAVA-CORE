package btl_001.itf;

import btl_001.entity.IEntity;

import java.util.Scanner;

public class Category implements IEntity {

    // id: số nguyên lớn hơn 0, duy nhất
    private int id;

    // name: Không trùng nhau, từ 6-30 ký tự
    private String name;

    // status: Nhân true/false khi nhập
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

        // Validate dữ liệu

        System.out.println("Nhập mã thể loại: ");
        do {
            try {
                id = Integer.parseInt(sc.nextLine());
                // bắt lỗi số nguyên lớn hơn 0
                if (id <= 0) {
                    System.err.println("Mã thể loại không hợp lệ. Nhập lại!!(Phải là số nguyên lớn hơn 0)");
                } else
                    break;
            } catch (Exception e) {
                // bắt lỗi nhập ký tự
                System.err.println("Mã thể loại không hợp lệ Nhập lại!! (Phải là số nguyên)");
            }
        } while (true);

        System.out.println("Nhập tên thể loại: ");
        do {
            try{
                name = sc.nextLine();
            }catch (Exception e){

            }
        } while (true);

//        System.out.println("Nhập trạng thái thể loại: ");
//        status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void output() {
        System.out.println("Mã thể loại: " + id);
        System.out.println("Tên thể loại: " + name);
        System.out.println("Trạng thái: " + (status ? "Hoạt động" : "Không hoạt động"));
    }
}
