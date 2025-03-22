package org.example.domain.model;

public class SampleEntity {
  private Long id;
  private String name;

  public SampleEntity() {}

  public SampleEntity(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
