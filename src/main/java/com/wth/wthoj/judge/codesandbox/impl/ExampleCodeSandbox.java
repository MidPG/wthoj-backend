package com.wth.wthoj.judge.codesandbox.impl;

import com.wth.wthoj.judge.codesandbox.CodeSandbox;
import com.wth.wthoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wth.wthoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 *
 */
public class ExampleCodeSandbox implements CodeSandbox {


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("使用默认代码沙箱");
        return null;
    }


}
