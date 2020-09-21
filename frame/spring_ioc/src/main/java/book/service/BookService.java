package book.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


/**
 * Service 类，调用 Dao 类
 */
@Service
public class BookService {

    @Qualifier("bookDao")   //没有这行代码，会根据属性名 bookDaoExtends，最终寻找的是 BookDaoExtends，增加这行代码后，强制 id 为 bookDao
    @Autowired(required = false)    //默认 required = true ，必须装配成功，required = false 允许出现空指针的情况（1.找不到对应类，2.找不到对应 id）
    BookDao bookDaoExtends;

    public void method() {
        bookDaoExtends.save();
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDaoExtends +
                '}';
    }
}
