package com.sdf.visitor.framework;

import com.sdf.visitor.Directory;
import com.sdf.visitor.File;

public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
