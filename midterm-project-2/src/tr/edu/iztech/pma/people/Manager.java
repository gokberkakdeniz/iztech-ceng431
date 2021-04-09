package tr.edu.iztech.pma.people;

public class Manager extends AbstractPerson implements IPersonnel {
    private final int productId;

    public Manager(String username, String password, int productId) {
        super(username, password);
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        return super.getUsername() + ", " + productId;
    }
}
