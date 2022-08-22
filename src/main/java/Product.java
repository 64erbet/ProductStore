import java.util.ArrayList;

public class Product {
    private Character name;

    private Double piecePrice;
    private Integer promotionalQuantity;
    private Double promotionalPrice;

    public Product(Character name,
                   Double piecePrice,
                   Integer promotionalQuantity,
                   Double promotionalPrice) {
        this.name = name;
        this.piecePrice = piecePrice;
        this.promotionalQuantity = promotionalQuantity;
        this.promotionalPrice = promotionalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = " + name +
                ", piecePrice = " + piecePrice +
                ", promotionalQuantity = " + promotionalQuantity +
                ", promotionalPrice = " + promotionalPrice +
                '}';
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public Double getPiecePrice() {
        return piecePrice;
    }

    public void setPiecePrice(Double piecePrice) {
        this.piecePrice = piecePrice;
    }

    public Integer getPromotionalQuantity() {
        return promotionalQuantity;
    }

    public void setPromotionalQuantity(Integer promotionalQuantity) {
        this.promotionalQuantity = promotionalQuantity;
    }

    public Double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(Double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }
}
