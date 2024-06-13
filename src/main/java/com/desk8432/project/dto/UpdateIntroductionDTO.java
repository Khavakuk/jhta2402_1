package com.desk8432.project.dto;


import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateIntroductionDTO {
    private String username;
    private String introduction;
}
