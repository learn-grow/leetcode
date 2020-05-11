package spring.ioc.overview.domain;

import spring.ioc.overview.annotation.Super;

/**
 * @author: lisy
 * @version: : SuperUser , v0.1 2020年05月10日 8:17 下午
 * @remark: the SuperUser is
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
