package com.pitest.repo;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class MyEntity {

  @Id
  @Column(name = "id", nullable = false, updatable = false)
  private Long id;

  @CreationTimestamp
  @Column(name = "created", nullable = false, updatable = false)
  private Instant created;

  public Long getId() {
    return id;
  }

  public Instant getCreated() {
    return created;
  }
}
