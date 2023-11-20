package com.wth.wthoj.judge.codesandbox;

import com.wth.wthoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.wth.wthoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.wth.wthoj.judge.codesandbox.impl.ThirdCodeSandbox;

/**
 *  代码沙箱工厂 (根据刺字符串参数指定的代码沙箱实例)
 *  使用简单工厂  (简单工厂)
 *  todo 如果确定代码沙箱实例不会出现线程安全问题，可以使用单例工厂
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type) {

        switch (type) {
            case "remote":
                return new RemoteCodeSandbox();
            case "third":
                return new ThirdCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }


    }


}
