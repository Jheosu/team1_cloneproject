package com.sparta.clone.controller.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PostRequestDto {
    String title;
    String content;
    String imageUrl;
}
