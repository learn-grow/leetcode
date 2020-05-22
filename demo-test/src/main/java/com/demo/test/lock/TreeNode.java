package com.demo.test.lock;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lisy
 * @version: : TreeNode , v0.1 2020年05月21日 5:24 下午
 * @remark: the TreeNode is
 */
public class TreeNode {

    TreeNode parent = null;

    List children = new ArrayList();

    public synchronized void addChild(TreeNode child){
        if (!this.children.contains(child)){
            this.children.add(child);
            child.setParentOnly(this);
        }
    }

    public synchronized void addChildOnly(TreeNode child){
        if (!this.children.contains(child)){
            this.children.add(child);
        }
    }

    public synchronized void setParent(TreeNode parent){
        this.parent = parent;
        parent.addChildOnly(this);
    }

    public synchronized void setParentOnly(TreeNode parent){
        this.parent = parent;
    }

}
