package com.wth.wthoj.controller;

import com.wth.wthoj.common.BaseResponse;
import com.wth.wthoj.common.ErrorCode;
import com.wth.wthoj.common.ResultUtils;
import com.wth.wthoj.exception.BusinessException;
import com.wth.wthoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.wth.wthoj.model.entity.User;
import com.wth.wthoj.service.QuestionSubmitService;
import com.wth.wthoj.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 题目提交接口
 *
 * @author <a href="https://github.com/liwth">程序员鱼皮</a>
 * @from <a href="https://wth.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/question_submit")
@Slf4j
public class QuestionSubmitController {

    @Resource
    private QuestionSubmitService postQuestionService;

    @Resource
    private UserService userService;


    @PostMapping("/")
    public BaseResponse<Integer> doQuestionSubmit(@RequestBody QuestionSubmitAddRequest postQuestionAddRequest,
            HttpServletRequest request) {
        if (postQuestionAddRequest == null || postQuestionAddRequest.getQuestionId() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 登录才能提交
        final User loginUser = userService.getLoginUser(request);
        long postId = postQuestionAddRequest.getQuestionId();
//        int result = postQuestionService.doQuestionSubmit(postQuestionAddRequest, loginUser);
//        return ResultUtils.success(result);
        return null;
    }

}
