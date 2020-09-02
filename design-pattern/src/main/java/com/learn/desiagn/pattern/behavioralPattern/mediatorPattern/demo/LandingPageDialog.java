package com.learn.desiagn.pattern.behavioralPattern.mediatorPattern.demo;

import com.learn.desiagn.pattern.structuralPattern.decoratorPattern.service.Component;
import jdk.internal.util.xml.impl.Input;
import org.springframework.expression.spel.ast.Selection;

import javax.xml.soap.Text;
import java.awt.*;

/**
 * @author: lisy
 * @version: : LandingPageDialog , v0.1 2020年06月03日 3:17 下午
 * @remark: the LandingPageDialog is
 */
public class LandingPageDialog implements Mediator {
    private Button loginButton; //登陆按钮
    private Button regButton;
    private Selection selection; //差选按钮
    private Input usernameInput; //用户名输入框
    private Input passwordInput; //密码输入框
    private Text hintText;

    @Override
    public void handleEvent(Component component, String event) {
        if (component.equals(loginButton)){
            String userName = usernameInput.toString();
            String password = passwordInput.toString();
            //todo 数据校验 业务处理
        }else if (component.equals(regButton)){
            //todo  get user info
        }else if (component.equals(selection)){
            String selectItem = selection.toStringAST();
            if (selectItem.equals("login")){
                //todo  button
            }
        }
    }
}
