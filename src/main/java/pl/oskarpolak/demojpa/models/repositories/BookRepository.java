package pl.oskarpolak.demojpa.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.demojpa.models.BookModel;

import java.util.List;


@Repository
public interface BookRepository extends CrudRepository<BookModel, Integer>{
    List<BookModel> findByPagesGreaterThanAndAuthorContaining(int gt, String s);
}
