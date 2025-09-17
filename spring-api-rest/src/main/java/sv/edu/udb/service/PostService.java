package sv.edu.udb.service;

import sv.edu.udb.request.PostRequest;
import sv.edu.udb.response.PostResponse;
import java.util.List;
public interface PostService {
    List<PostResponse> findAll();
    PostResponse findById(final Long id);
    PostResponse save(final PostRequest postRequest);
    PostResponse update(final Long id, final PostRequest postRequest);
    void delete(final Long id);
}
