package com.wth.wthoj.service;

import javax.annotation.Resource;

import com.wth.wthoj.common.ErrorCode;
import com.wth.wthoj.exception.BusinessException;
import com.wth.wthoj.model.entity.Question;
import com.wth.wthoj.model.entity.QuestionSubmit;
import com.wth.wthoj.model.enums.QuestionSubmitStatusEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用户服务测试
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private QuestionSubmitService questionSubmitService;

    @Resource
    private UserService userService;

    @Resource
    private QuestionService questionService;
    @Test
    void userRegister() {
        String userAccount = "wth";
        String userPassword = "";
        String checkPassword = "123456";
        try {
            long result = userService.userRegister(userAccount, userPassword, checkPassword);
            Assertions.assertEquals(-1, result);
            userAccount = "yu";
            result = userService.userRegister(userAccount, userPassword, checkPassword);
            Assertions.assertEquals(-1, result);
        } catch (Exception e) {

        }
    }

    @Test
    void test2() {

        QuestionSubmit questionSubmit = questionSubmitService.getById(1);
        if (questionSubmit == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "提交信息不存在");
        }
        Long questionId = questionSubmit.getQuestionId();
        Question question = questionService.getById(questionId);
        if (question == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR, "题目不存在");
        }
        // 2）如果题目提交状态不为等待中，就不用重复执行了 //todo 有bug
        Integer status = questionSubmit.getStatus();
        System.out.println(status);
        Integer status1 = QuestionSubmitStatusEnum.WAITING.getStatus();
        System.out.println(status1);

    }

}
