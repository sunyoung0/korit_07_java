package ch17_bean;

import lombok.Data;
import lombok.Setter;

@Data
// 여기에 어노테이션을 달면 class level
public class UserEntityLombok {
    // 여기에 달면 field level
    private int userName;
    @Setter
    private int password;
    private String email;
    private String name;
}
