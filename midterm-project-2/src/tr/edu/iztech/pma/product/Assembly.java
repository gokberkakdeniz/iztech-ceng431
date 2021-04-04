package tr.edu.iztech.pma.product;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends AbstractProduct {
    private List<AbstractProduct> children;

    public Assembly(int id, String title) {
        super(id, title);
        children = new ArrayList<>();
    }

    public boolean add(AbstractProduct child) {
        if (children.contains(child)) return false;

        return children.add(child);
    }

    public boolean remove(AbstractProduct child) {
        return children.remove(child);
    }

    public List<AbstractProduct> getChildren() {
        return this.children; // FIX: it may be cloned.
    }
}
