package com.example.javasedemo.refeletion.enums;

/**
 * @author lktbz
 * @version 1.0.0
 * @date 2021/8/7
 * @desc
 */
public enum PhoneOsEnum {
    ANDROID(1,"android"),
    IOS(2,"ios");
    private final Integer type;
    private final String typeName;

    PhoneOsEnum(Integer type, String typeName) {
        this.type = type;
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

}
