package com.spring.mvc.chap05.repository;

import lombok.*;

@Setter@Getter@NoArgsConstructor@AllArgsConstructor@EqualsAndHashCode@ToString@Builder
public class LoginUserResponseDTO {
    private String account;
    private String nickName;
    private String email;
    private String auth;
}
