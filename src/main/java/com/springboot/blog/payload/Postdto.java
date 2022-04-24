package com.springboot.blog.payload;

import lombok.Data;

@Data
public class Postdto {
    private long id;
    private String title;
    private String description;
    private String content;
//    private String created_by;
//    private OffsetDateTime updated_at;
}
