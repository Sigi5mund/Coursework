import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    private Library<Book> library1;
    private Library<DVD> library2;
    private DVD dvd1;
    private Book book1;
    private ArrayList<Book> items1;
    private ArrayList<DVD> items2;



    @Before
    public void before(){
        items1 = new ArrayList<Book>();
        items2 = new ArrayList<DVD>();
        library1 = new Library(items1);
        library2 = new Library(items2);
    }

    @Test
    public void libraryCheckDVD(){
        library2.addItem(dvd1);
        assertEquals(1, library2.returnSize());
    }


    @Test
    public void libraryCheckBook(){
        library1.addItem(book1);
        assertEquals (1, library1.returnSize());
    }



}
