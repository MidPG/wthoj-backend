package com.wth.wthoj.judge.codesandbox;

import com.wth.wthoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wth.wthoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 *  代码沙箱接口
 *  项目只调用接口，不调用具体的实现类
 */
public interface CodeSandbox {

    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);



}
