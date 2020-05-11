package spring.ioc.overview.repository;

import spring.ioc.overview.domain.User;

import java.util.Collection;

/**
 * @author: lisy
 * @version: : UserRepo , v0.1 2020年05月10日 8:40 下午
 * @remark: the UserRepo is
 */
public class UserRepository {

    private Collection<User> users;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
