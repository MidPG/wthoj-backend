package com.wth.wthoj.model.dto.question;

import lombok.Data;

/**
 *  题目配置
 */
@Data
public class JudgeCase {

    /**
     *  时间限制
     */
    private String input;


    /**
     *  内存限制
     */
    private String output;


}
