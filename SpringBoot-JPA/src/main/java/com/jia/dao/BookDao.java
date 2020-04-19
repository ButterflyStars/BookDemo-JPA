package com.jia.dao;

import com.jia.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: 2020/4/16 0:35
 * Description: No Description
 */
// 两个泛型参数，第一个表示这个repository操作的表绑定的POJO，第二个表示自增id类型
public interface BookDao extends JpaRepository<Book,Integer> {
    // @Override
    // @Query(nativeQuery = true,value = "select * from library.book where enable = 0")
    // List<Book> findAll();
}
