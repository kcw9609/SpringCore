package hello.hellospring.controller;

import lombok.*;


//@Getter
//@Setter
public class MemberForm {
    private String name;

    private void setName(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }



}
