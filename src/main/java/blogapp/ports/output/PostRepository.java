package blogapp.ports.output;

import blogapp.domain.Post;
import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post save(Post post);

    Optional<Post> findById(String id);

    List<Post> findAll();
}
