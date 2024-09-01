package io.github.haphong463.dto.order;
public class OrderEvent {
    private String message;
    private String status;
    private OrderDTO orderDTO;

    public OrderEvent(String message, String status, OrderDTO orderDTO) {
        this.message = message;
        this.status = status;
        this.orderDTO = orderDTO;
    }

    public OrderEvent() {
    }

    @Override
    public String toString() {
        return "OrderEvent{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", orderDTO=" + orderDTO +
                '}';
    }

    public OrderDTO getOrderDTO() {
        return orderDTO;
    }

    public void setOrderDTO(OrderDTO orderDTO) {
        this.orderDTO = orderDTO;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
