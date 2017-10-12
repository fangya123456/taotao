package com.fy.taotao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with IntelliJ IDEA.
 *
 * @version 创建时间：2017/10/10 下午3:18
 */

@SpringBootApplication
@ImportResource({"classpath:spring/application-context.xml"})
public class Application{
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
