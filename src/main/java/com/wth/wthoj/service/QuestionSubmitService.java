package com.wth.wthoj.service;

import com.wth.wthoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.wth.wthoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wth.wthoj.model.entity.User;

/**
* @author 79499
* @description 针对表【question_submit(用户提交题目信息表)】的数据库操作Service
* @createDate 2023-10-28 17:31:10
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {


    /**
     * 提交
     *
     * @param questionSubmitQuestion
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitQuestion, User loginUser);




}
