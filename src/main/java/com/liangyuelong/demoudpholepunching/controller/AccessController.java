package com.liangyuelong.demoudpholepunching.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {

    @GetMapping("/")
    public String access(HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getRemoteHost());
        System.out.println(request.getRemotePort());
        request.getLocalPort();
        return """
                您的IP地址是：%s
                您的主机名是：%s
                您的端口号是：%d
                LocalAddr: %s
                LocalPort: %d
                """.formatted(
                request.getRemoteAddr(),
                request.getRemoteHost(),
                request.getRemotePort(),
                request.getLocalAddr(),
                request.getLocalPort()
        );
    }

}
