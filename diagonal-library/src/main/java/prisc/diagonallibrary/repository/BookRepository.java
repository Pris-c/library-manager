package prisc.diagonallibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import prisc.diagonallibrary.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


    @Query(value = "SELECT EXISTS (SELECT 1 FROM Book WHERE title = :title AND author = :author AND year = :year)", nativeQuery = true)
    boolean existsByAttributes(@Param("title") String title, @Param("author") String author, @Param("year") int year);


    List<Book> findByTitleIgnoreCaseContaining(String title);

    List<Book> findByAuthorIgnoreCaseContaining(String author);

    List<Book> findByYear(int year);
}
