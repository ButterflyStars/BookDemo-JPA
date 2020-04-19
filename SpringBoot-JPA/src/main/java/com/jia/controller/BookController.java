package com.jia.controller;

import com.jia.dao.BookDao;
import com.jia.pojo.Book;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: 2020/4/16 0:56
 * Description: No Description
 */

@Api(tags = "Book控制类")
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookDao bookDao;
    @ApiOperation("Book查询所有书籍")
    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
        System.out.println("进入findAll！");
        // 应该在Service层使用
        PageRequest pageRequest = PageRequest.of(page,size);
        return bookDao.findAll(pageRequest);
    }

    @GetMapping("/findAll")
    public List<Book> findAll(){
        System.out.println("进入findAll！");
        // 应该在Service层使用
        // PageRequest pageRequest = PageRequest.of(page,size);
        return bookDao.findAll();
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book){
        Book result = bookDao.save(book);
        if (result != null){
            return "success";
        }else {
            return "fail";
        }
    }
    // 通过Id查询书籍
    // @GetMapping("/findById/{id}")
    // public Book findById(@PathVariable("id") Integer id){
    //     return bookDao.findById(id).get();
    // }
    @PutMapping("/update")
    public String update(@RequestBody Book book){
        Book result = bookDao.save(book);
        if (result != null){
            System.out.println("数据修改了！");
            return "success";
        }else {
            return "fail";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Integer id){
        System.out.println("进入删除");
        bookDao.deleteById(id);
    }
}
