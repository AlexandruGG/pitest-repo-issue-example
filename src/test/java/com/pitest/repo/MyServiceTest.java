package com.pitest.repo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.only;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {

  @Mock MyEntityRepository repository;

  @InjectMocks MyService sut;

  @Test
  void createSavesEntity() {
    sut.create();

    then(repository).should(only()).saveAndFlush(any(MyEntity.class));
  }
}
