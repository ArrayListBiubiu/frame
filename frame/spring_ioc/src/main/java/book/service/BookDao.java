package book.service;


import org.springframework.stereotype.Repository;


/**
 * Dao 类
 */
@Repository
public class BookDao {

    public void save() {
        System.out.println("BookDao 被调用。。。");
    }

}
