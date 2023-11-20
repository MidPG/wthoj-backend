package com.wth.wthoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wth.wthoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.wth.wthoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.wth.wthoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wth.wthoj.model.entity.User;
import com.wth.wthoj.model.vo.QuestionSubmitVO;

/**
* @author 79499
* @description 针对表【question_submit(用户提交题目信息表)】的数据库操作Service
* @createDate 2023-10-28 17:31:10
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {


    /**
     *  题目提交
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitQuestion, User loginUser);

    /**
     *  获取题目封装
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);


    /**
     *  分页获取封装
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);
}
