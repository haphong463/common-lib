package io.github.haphong463.dto.order;
import java.util.List;
public class OrderDTO {
    private String orderId;
    private String status;
    private List<OrderItemDTO> orderItems;

    public OrderDTO(String orderId, String status, List<OrderItemDTO> orderItems) {
        this.orderId = orderId;
        this.status = status;
        this.orderItems = orderItems;
    }

    public OrderDTO() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId='" + orderId + '\'' +
                ", status='" + status + '\'' +
                ", orderItems=" + orderItems +
                '}';
    }
}
