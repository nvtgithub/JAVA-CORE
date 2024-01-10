package btl_001.model;

import btl_001.service.CategoryService;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Category implements IEntity, Serializable {
    private static final long serialVersionUID = 1L;

    // ANSI escape code constants for text colors
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
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

        // ID
        System.out.print("Nhập mã thể loại: ");
        do {
            // ID là int
            try {
                id = Integer.parseInt(sc.next());
                // ID > 0
                if (id > 0) {
                    // ID duy nhất
                    boolean flagIdCategory = true;
                    CategoryService categoryService = new CategoryService();
                    for (Category item : categoryService.getAllFromFile()) {
                        if (id == item.getId()) {
                            flagIdCategory = false;
                            System.out.println(RED + "ID đã tồn tại!" + RESET);
                            System.out.print("Nhập lại : ");
                        } else
                            break;
                    }
                    if (flagIdCategory)
                        break;
                } else {
                    System.out.println(RED + "ID phải lớn hơn 0!");
                    System.out.print("Nhập lại id: ");
                }
            } catch (Exception e) {
                System.out.println(RED + "ID không hợp lệ. ID phải là số nguyên!!!" + RESET);
                System.out.println("Nhập lại: ");
            }
        } while (true);

        // name
        System.out.print("Nhập tên thể loại: ");
        do {
            // ký tự a-z,A-Z,6-30 ky tu
            name = sc.next();
            Pattern pattern1 = Pattern.compile("^[a-zA-Z0-9\\d]{6,30}$");
            Matcher check = pattern1.matcher(name);

            if (!check.matches()) {
                System.out.println(RED + "Tên thể loại phải từ 6 - 30 ký tự!" + RESET);
                System.out.print("Nhập lại: ");
            } else {
                // check trung name
                boolean flagNameCategory = true;
                CategoryService categoryService = new CategoryService();
                for (Category item : categoryService.getAllFromFile()) {
                    if (item.getName().equalsIgnoreCase(name)) {
                        flagNameCategory = false;
                        System.out.println(RED + "Tên thể loại đã tồn tại! " + RESET);
                        System.out.print("Nhập lại: ");
                        break;
                    }
                }
                if (flagNameCategory)
                    break;
            }
        } while (true);

        // status
        System.out.print("Nhập trạng thái thể loại (true hoặc false): ");
        do {
            try {
                Scanner sc1 = new Scanner(System.in);
                status = Boolean.parseBoolean(String.valueOf(sc1.nextBoolean()));
                if(status){
                    break;
                } else
                    break;
            } catch (InputMismatchException e) {
                System.out.println(RED + "Trạng thái không hợp lệ!" + RESET);
                System.out.print("Nhập lại (true hoặc false): ");
            }
        } while (true);
    }

    @Override
    public void output() {
        System.out.printf("\t\t\t\t\t| %-6d | %-20s | %-15s |%n",id,name,status ? "Hoạt động" : "Không hoạt động");
    }
}
