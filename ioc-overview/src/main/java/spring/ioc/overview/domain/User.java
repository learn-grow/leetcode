package spring.ioc.overview.domain;

/**
 * @author: lisy
 * @version: : User , v0.1 2020年05月10日 7:51 下午
 * @remark: the User is 用户类
 */
public class User {

    private  long id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
