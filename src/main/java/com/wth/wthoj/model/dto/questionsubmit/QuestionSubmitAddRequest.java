package com.wth.wthoj.model.dto.questionsubmit;

import com.wth.wthoj.model.dto.question.JudgeCase;
import com.wth.wthoj.model.dto.question.JudgeConfig;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  用户提交题目的对象
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 提交代码
     */
    private String code;

    /**
     * 题目Id
     */
    private Long questionId;


    private static final long serialVersionUID = 1L;
}