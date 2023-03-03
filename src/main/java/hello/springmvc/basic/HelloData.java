package hello.springmvc.basic;

import lombok.Data;

@Data //getter setter등 롬복의 기능을 다 만들어줌
public class HelloData {
    private String username;
    private int age;
}
