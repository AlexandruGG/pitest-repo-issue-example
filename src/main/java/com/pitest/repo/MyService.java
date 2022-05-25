package com.pitest.repo;

public class MyService {

  private final MyEntityRepository repository;

  public MyService(final MyEntityRepository repository) {
    this.repository = repository;
  }

  public void create() {
    this.repository.saveAndFlush(new MyEntity());
  }
}
