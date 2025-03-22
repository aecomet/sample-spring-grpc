package org.example.module.caching;

import org.example.domain.model.BookEntity;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class SimpleBookEntityRepository implements BookEntityRepositoryIf {

  @Override
  @Cacheable("books")
  public BookEntity getByIsbn(String isbn) {
    simulateSlowService();
    return new BookEntity(isbn, "Some book");
  }

  // Don't do this at home
  private void simulateSlowService() {
    try {
      long time = 3000L;
      Thread.sleep(time);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
  }
}
