package io.github.ted005;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@DubboComponentScan(basePackages = "io.github.ted005")
public class FirstDubboProvider {

    public static void main(String[] args) {

        SpringApplication.run(FirstDubboProvider.class, args);

    }
}
