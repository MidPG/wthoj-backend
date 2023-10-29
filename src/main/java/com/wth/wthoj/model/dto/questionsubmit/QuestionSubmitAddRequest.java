package com.wth.wthoj.model.dto.questionsubmit;

import com.wth.wthoj.model.dto.question.JudgeCase;
import com.wth.wthoj.model.dto.question.JudgeConfig;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建请求
 *
 * @author <a href="https://github.com/liwth">程序员鱼皮</a>
 * @from <a href="https://wth.icu">编程导航知识星球</a>
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