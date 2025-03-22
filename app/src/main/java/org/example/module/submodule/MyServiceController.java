package org.example.module.submodule;

import org.example.domain.service.MyService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@RestController
public class MyServiceController {

  private final MyService myService;

  public MyServiceController(MyService myService) {
    this.myService = myService;
  }

  @GetMapping("/myservice")
  public String home() {
    return myService.message();
  }
}
