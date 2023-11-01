package com.wth.wthoj.judge.codesandbox;

import com.wth.wthoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.wth.wthoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.wth.wthoj.judge.codesandbox.model.ExecuteCodeResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CodeSandboxTest {

    @Value("${codesandbox.type:example}")
    private String type;


    @Test
    void executeCode() {

        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        String code = "int main() {}";
        String language = "c";
        List<String> inputList = Arrays.asList("1 2", "3  4");
        ExecuteCodeRequest executeRequest = ExecuteCodeRequest.builder()
                .language(language)
                .code(code)
                .inputList(inputList)
                .build();
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeRequest);

    }

    @Test
    void executeCodeByProxy() {

        CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
        CodeSandboxProxy codeSandboxProxy = new CodeSandboxProxy(codeSandbox);
        String code = "int main() {}";
        String language = "c";
        List<String> inputList = Arrays.asList("1 2", "3  4");
        ExecuteCodeRequest executeRequest = ExecuteCodeRequest.builder()
                .language(language)
                .code(code)
                .inputList(inputList)
                .build();
        ExecuteCodeResponse executeCodeResponse = codeSandboxProxy.executeCode(executeRequest);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String type = scanner.next();
            System.out.println(type);
            CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
            String code = "int main() {}";
            String language = "c";
            List<String> inputList = Arrays.asList("1 2", "3  4");
            ExecuteCodeRequest executeRequest = ExecuteCodeRequest.builder()
                    .language(language)
                    .code(code)
                    .inputList(inputList)
                    .build();
            ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeRequest);
        }

    }
}