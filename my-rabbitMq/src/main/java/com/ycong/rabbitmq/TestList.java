package com.ycong.rabbitmq;

import java.util.HashSet;
import java.util.Set;

/**
 * Project Name:spring-cloud-demo
 * Package Name:com.ycong.rabbitmq
 * File Name:
 * Date:2018-03-10 上午 10:40
 * company: zstax
 * Copyright (c) 2018, yangcong@zstax.com All Rights Reserved.
 * Description:
 */
public class TestList {
    public static void main(String[] args) {

        Set<BookInfo> bookSet = new HashSet<BookInfo>();

        BookInfo b1 = new BookInfo("zhang","001");
        BookInfo b2 = new BookInfo("li","002");
        BookInfo b3 = new BookInfo("zhang","001");

        bookSet.add(b1);
        bookSet.add(b2);
        bookSet.add(b3);

        for(BookInfo b: bookSet){
            System.out.println(b.getName() + "   " + b.getCode());
        }
    }
}

class BookInfo{
    private String name;
    private String code;

    public BookInfo(){}

    public BookInfo(String name, String code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookInfo bookInfo = (BookInfo) o;

        if (name != null ? !name.equals(bookInfo.name) : bookInfo.name != null) return false;
        return code != null ? code.equals(bookInfo.code) : bookInfo.code == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
