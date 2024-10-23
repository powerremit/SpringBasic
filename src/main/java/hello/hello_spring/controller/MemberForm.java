package hello.hello_spring.controller;

public class MemberForm {
    private String name; // html 에서 input name 값이 여기 들어옴

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
