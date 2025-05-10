package com.arjunsheshadri.echoid.dummy.controllers;

import com.arjunsheshadri.echoid.dummy.entities.Dummy;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dummy")
public class DummyController {
  @GetMapping
  public Dummy index() {
    return new Dummy("Hello, World");
  }

  @GetMapping(path = "/list")
  public List<Dummy> list() {
    return List.of(new Dummy("Dummy 1"), new Dummy("Dummy 2"));
  }
}
