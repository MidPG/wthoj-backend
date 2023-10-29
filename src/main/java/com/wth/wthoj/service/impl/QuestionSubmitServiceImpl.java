package com.wth.wthoj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wth.wthoj.common.ErrorCode;
import com.wth.wthoj.exception.BusinessException;
import com.wth.wthoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.wth.wthoj.model.entity.Question;
import com.wth.wthoj.model.entity.QuestionSubmit;
import com.wth.wthoj.model.entity.User;
import com.wth.wthoj.service.QuestionService;
import com.wth.wthoj.service.QuestionSubmitService;
import com.wth.wthoj.mapper.QuestionSubmitMapper;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author 79499
 * @description 针对表【question_submit(用户提交题目信息表)】的数据库操作Service实现
 * @createDate 2023-10-28 17:31:10
 */
@Service
public class QuestionSubmitServiceImpl extends ServiceImpl<QuestionSubmitMapper, QuestionSubmit>
        implements QuestionSubmitService {

    @Resource
    private QuestionService questionService;

    /**
     * 提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    @Override
    public long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser) {

        Long questionId = questionSubmitAddRequest.getQuestionId();
        // 判断实体是否存在，根据类别获取实体
        Question question = questionService.getById(questionId);
        if (question == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }
        String language = questionSubmitAddRequest.getLanguage();
        String code = questionSubmitAddRequest.getCode();
        // 是否已提交
        long userId = loginUser.getId();
        // 每个用户串行提交
        return 1;
    }


}




