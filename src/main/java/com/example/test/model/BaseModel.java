package com.example.test.model;

import lombok.Data;

@Data
public class BaseModel {

    private int pageNum=1;
    private int pageSize=10;
    private long total;
    private String countSql;
}
