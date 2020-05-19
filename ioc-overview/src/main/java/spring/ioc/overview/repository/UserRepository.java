package spring.ioc.overview.repository;

import spring.ioc.overview.domain.User;

import java.util.*;

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

    Map<String, String> map = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0){
            outStr("", digits);
        }
        return output;
    }

    private void outStr(String comm, String netStr) {
        if (netStr.length() == 0){
            output.add(comm);
        }else{
            String next = netStr.substring(0, 1);
            String s1 = map.get(next);
            for (int i = 0 ;i < s1.length() ;i++){
                String letter = s1.substring(i ,i + 1);
                outStr(comm + letter , netStr.substring(1));
            }
        }
    }
}
