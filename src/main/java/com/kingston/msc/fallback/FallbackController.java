package com.kingston.msc.fallback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/19/21
 */

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/message")
    public String test() {
        return "Hello Tutorr.com Called in Fallback Service";
    }
}
