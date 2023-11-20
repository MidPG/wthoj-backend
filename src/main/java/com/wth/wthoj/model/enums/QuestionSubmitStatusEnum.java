package com.wth.wthoj.model.enums;

import cn.hutool.core.util.ObjectUtil;


/**
 *  题目提交状态枚举值
 */
public enum QuestionSubmitStatusEnum {

    WAITING("待判题", 0),

    RUNNING("判题中", 1),

    /**
     *  判题成功失败不是判题结果正确还是错误，是判题流程是否正确完成执行
     */
    SUCCEED("成功", 2),

    FAILED("失败", 3);
    private final String text;
    private final Integer value;


    public static QuestionSubmitStatusEnum getEnumByValue(Integer value) {
        if (ObjectUtil.isEmpty(value)) {
            return null;
        }
        for (QuestionSubmitStatusEnum anEnum : QuestionSubmitStatusEnum.values()) {
            if (anEnum.value.equals(value)){
                return anEnum;
            }
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public Integer getStatus() {
        return value;
    }

    QuestionSubmitStatusEnum(String text, Integer status) {
        this.text = text;
        this.value = status;
    }
}
