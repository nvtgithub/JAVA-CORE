package btl_001.validate;

import btl_001.model.Book;
import btl_001.service.BookService;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class BookValidate implements Serializable {
    private static final long serialVersionUID = 1L;

    private final BookService BOOK_SERVICE = new BookService();
    private final List<Book> LIST = BOOK_SERVICE.getAllFromFile();

    public boolean checkIsOnlyIDBook(String id) {
        for (Book book : LIST) {
            if (book.getId().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIsOnlyTitleBook(String title) {
        for (Book book : LIST) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkNullString(String str) {
        return !str.isEmpty();
    }

    // Từ năm 1970 và nhỏ hơn năm hiện tại
    public boolean checkYear(int i) {
        int yearNow = LocalDate.now().getYear();
        return i > 1970 && i < yearNow;
    }
}
