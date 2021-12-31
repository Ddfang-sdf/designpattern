package com.sdf.interpreter;

import com.sdf.interpreter.framework.Constant;
import com.sdf.interpreter.framework.Context;
import com.sdf.interpreter.framework.Expression;
import com.sdf.interpreter.framework.Variable;

public class Application {
    public static void main(String[] args) {
        Context ctx = new Context();
        Variable x = new Variable("x");
        Variable y = new Variable("y");

        Constant c = new Constant(true);
        ctx.assign(x, false);
        ctx.assign(y, true);

        Expression exp = new Or(new And(c, x), new And(y, new Not(x)));
        System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }
}
