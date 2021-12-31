package com.sdf.chainofresposibility.framework;

import lombok.AllArgsConstructor;
import lombok.Data;

public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public void support(Trouble trouble){
        //首先调用自己的resolve，看能不能解决问题
        if (resolve(trouble)) {//能自己解决
            done(trouble);
        }else {
            if (null != next){//若存在下一个问题解决者
                next.support(trouble);
            }else {//已经到达责任链的链尾，问题仍然没有解决
                fail(trouble);
            }
        }
    }

    public abstract boolean resolve(Trouble trouble);

    private void done(Trouble trouble){
        System.out.println(trouble + "is resolved by ->" + name);
    }

    private void fail(Trouble trouble){
        System.out.println(trouble + "is resolved failed!");
    }
}
