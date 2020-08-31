package com.example.pproject.model.dto;

import com.example.pproject.model.Theme;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThemeRespDto {
    private Theme theme;
    private String name;
    private String themeImg;
    private String genre;
    private int rating;
}
