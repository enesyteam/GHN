package com.dalafarm.vendor.model.ghtk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by chien on 8/4/17.
 */
public class GhtkOrderResponse {
    private boolean success;

    private String message;

    @JsonProperty("order")
    private  Order order;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @JsonIgnore
    public String getSupplierOrderId() {
        return order.getSupplierOrderId();
    }

    public void setSupplierOrderId(String label) {
        order.setSupplierOrderId(label);
    }

    @JsonIgnore
    public String getArea() {
        return order.getArea();
    }

    public void setArea(String area) {
        order.setArea(area);
    }

    @JsonIgnore
    public String getShippingFee() {
        return order.getShippingFee();
    }

    public void setShippingFee(String shippingFee) {
        order.setShippingFee(shippingFee);
    }

    @JsonIgnore
    public String getInsuranceFee() {
        return order.getInsuranceFee();
    }

    public void setInsuranceFee(String insuranceFee) {
        order.setInsuranceFee(insuranceFee);
    }

    @JsonIgnore
    public String getEstimatedPickUtime() {
        return order.getEstimatedPickUtime();
    }

    public void setEstimatedPickUtime(String estimatedPickUtime) {
        order.setEstimatedPickUtime(estimatedPickUtime);
    }

    @JsonIgnore
    public String getEstimatedDeliverTime() {
        return order.getEstimatedDeliverTime();
    }

    public void setEstimatedDeliverTime(String estimatedDeliverTime) {
        order.setEstimatedDeliverTime(estimatedDeliverTime);
    }

    private static class Order {
        @JsonProperty("label")
        private String supplierOrderId;

        @JsonProperty("area")
        private String area;

        @JsonProperty("fee")
        private String shippingFee;


        @JsonProperty("insurance_fee")
        private String insuranceFee;


        @JsonProperty("estimated_pick_time")
        private String estimatedPickUtime;


        @JsonProperty("estimated_deliver_time")
        private String estimatedDeliverTime;

        public String getSupplierOrderId() {
            return supplierOrderId;
        }

        public void setSupplierOrderId(String supplierOrderId) {
            this.supplierOrderId = supplierOrderId;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getShippingFee() {
            return shippingFee;
        }

        public void setShippingFee(String shippingFee) {
            this.shippingFee = shippingFee;
        }

        public String getInsuranceFee() {
            return insuranceFee;
        }

        public void setInsuranceFee(String insuranceFee) {
            this.insuranceFee = insuranceFee;
        }

        public String getEstimatedPickUtime() {
            return estimatedPickUtime;
        }

        public void setEstimatedPickUtime(String estimatedPickUtime) {
            this.estimatedPickUtime = estimatedPickUtime;
        }

        public String getEstimatedDeliverTime() {
            return estimatedDeliverTime;
        }

        public void setEstimatedDeliverTime(String estimatedDeliverTime) {
            this.estimatedDeliverTime = estimatedDeliverTime;
        }
    }
}
