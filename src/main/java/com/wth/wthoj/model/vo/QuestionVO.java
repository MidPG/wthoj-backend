package com.wth.wthoj.model.vo;

import cn.hutool.json.JSONUtil;
import com.google.gson.reflect.TypeToken;
import com.wth.wthoj.model.dto.question.JudgeConfig;
import com.wth.wthoj.model.entity.Question;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

/**
 *  返回给前端展示的题目封装类
 *  说明：不是所有的数据都要返回给前端
 */
@Data
public class QuestionVO {

    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tagsList;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 题目提交数
     */
    private Integer submitNum;

    /**
     * 题目通过数
     */
    private Integer acceptNum;


    /**
     * 判题配置(json对象)
     */
    private JudgeConfig judgeConfig;

    /**
     * 点赞数
     */
    private Integer thumbNum;

    /**
     * 收藏数
     */
    private Integer favourNum;

    /**
     * 创建用户 id
     */

    private Long userId;
    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     *  创题人信息
     */
    private UserVO userVO;

    /**
     *  vo类 转  Bean
     */
    public static Question voToObj(QuestionVO questionVO) {
        if (questionVO == null) {
            return null;
        }
        Question question = new Question();
        BeanUtils.copyProperties(questionVO, question);
        List<String> tagList = questionVO.getTagsList();
        if (tagList != null) {
            question.setTags(JSONUtil.toJsonStr(tagList));
        }
        JudgeConfig voJudgeConfig = questionVO.getJudgeConfig();
        if (voJudgeConfig != null) {
            question.setJudgeCase(JSONUtil.toJsonStr(voJudgeConfig));
        }
        return question;
    }

    /**
     *  Bean 转 vo类
     */
    public static QuestionVO objToVo(Question question) {
        if (question == null) {
            return null;
        }
        QuestionVO questionVO = new QuestionVO();
        String judgeConfig = question.getJudgeConfig();
        String tags = question.getTags();
        if (judgeConfig != null) {
            questionVO.setJudgeConfig(JSONUtil.toBean(judgeConfig, JudgeConfig.class));
        }
        List<String> tagList = null;
        if (tags != null) {
            questionVO.setTagsList(JSONUtil.toList(tags, String.class));
        }
        questionVO.setTagsList(tagList);
        BeanUtils.copyProperties(question, questionVO);
        return questionVO;
    } 
    

}
