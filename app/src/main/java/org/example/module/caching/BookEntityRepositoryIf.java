package org.example.module.caching;

import org.example.domain.model.BookEntity;

public interface BookEntityRepositoryIf {

  BookEntity getByIsbn(String isbn);
}
