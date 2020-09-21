package book.service;


import org.springframework.stereotype.Repository;


/**
 * BookDaoExtends 继承了 BookDao 类，这样就相当于有2个 BookDao类，用来验证 自动注入的匹配顺序
 */
@Repository
public class BookDaoExtends extends BookDao{

    public void save() {
        System.out.println("BookDaoExtends 被调用。。。");
    }

}
