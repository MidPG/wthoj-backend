package com.wth.wthoj.model.dto.question;

import lombok.Data;

/**
 *  判题配置
 */
@Data
public class JudgeConfig {


    /**
     *  时间限制
     */
    private Long timeLimit;


    /**
     *  内存限制
     */
    private Long memoryLimit;

    /**
     *  堆栈限制
     */
    private Long stackLimit;


    /**
     *  消耗时间
     */
    private Long time;



}
