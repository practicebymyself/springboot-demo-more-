package spring.boot.core.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 用户持久层操作接口
 *
 * Created by by wh on 18/09/2017.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
