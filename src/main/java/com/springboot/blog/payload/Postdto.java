package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class Postdto {
    private long id;
    // title should not be null or empty
    // title should not have atleast 2 characters
//    @NotEmpty
    @Size(min = 2, message = "Post title should have atleast 2 characters")
    private String title;
    // Post description should not be null or empty
    // Post descripton should have atleast 10 characters
//    @NotEmpty
//    @Size(min = 10, message = "Post Description should have atleast 10 characters")
    private String description;

//    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
//    private String created_by;
//    private OffsetDateTime updated_at;
}
