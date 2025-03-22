package org.example.module.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.example.domain.model.SampleEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/sample-rest")
  public SampleEntity greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return new SampleEntity(counter.incrementAndGet(), String.format("Hello, %s!", name));
  }
}
