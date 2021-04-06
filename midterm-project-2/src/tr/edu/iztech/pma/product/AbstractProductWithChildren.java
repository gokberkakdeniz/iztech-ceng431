package tr.edu.iztech.pma.product;

import java.util.ArrayList;
import java.util.List;

public class AbstractProductWithChildren extends AbstractProduct {
    private final List<IProduct> children;

    public AbstractProductWithChildren(int id, String title) {
        super(id, title);
        children = new ArrayList<>();
    }

    public boolean add(IProduct child) {
        if (children.contains(child)) return false;

        child.setParent(this);

        return children.add(child);
    }

    public boolean remove(IProduct child) {
        return children.remove(child);
    }

    public List<IProduct> getChildren() {
        return this.children; // FIX: it may be cloned.
    }
}