package com.jun.mybatisplus.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum AgeEnum implements IEnum<Integer> {
    ONE(1, "1岁"),
    TWO(2, "2岁"),
    THREE(3, "3岁"),
    FOUR(4, "4岁"),
    ;

    private Integer code;
    private String msg;

    AgeEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}
