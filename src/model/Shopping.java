package model;

public class Shopping {
    private String nameProduct;
    private double productValue;
    private String productType;

    public Shopping(String nameProduct, double productValue, String productType) {
        this.nameProduct = nameProduct;
        this.productValue = productValue;
        this.productType = productType;
    }

    public double getProductValue() {
        return productValue;
    }

    public String getProductType() {
        return productType;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public String toString() {
        return "Shopping: {" +
                "nameProduct='" + nameProduct + '\'' +
                ", productValue=" + productValue +
                ", productType='" + productType + '\'' +
                '}';
    }
}
