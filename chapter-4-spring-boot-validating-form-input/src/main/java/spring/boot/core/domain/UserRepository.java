package spring.boot.core.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户持久层操作接口
 *
 * Created by by wh on 21/07/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
