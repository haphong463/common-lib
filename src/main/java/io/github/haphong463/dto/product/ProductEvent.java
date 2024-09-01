package io.github.haphong463.dto.product;
public class ProductEvent {
    private ProductDTO productDTO;

    public ProductEvent() {
    }

    @Override
    public String toString() {
        return "ProductEvent{" +
                "productDTO=" + productDTO +
                '}';
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public ProductEvent(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }
}
