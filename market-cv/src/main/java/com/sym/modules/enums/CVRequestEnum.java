package com.sym.modules.enums;

/**
 * @author suyongming
 * @date 创建时间：2019/8/21 14:15
 */
public enum CVRequestEnum {
    /**
     * 在线人脸识别
     */
    CV_FACE_ONLINE(1),
    /**
     * 本地人脸识别
     */
    CV_FACE_LOCAL(2),
    /**
     * 本地人脸对比
     */
    CV_FACE_EQUALS(3);

    private int value;

    CVRequestEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
