package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.OrderStatus;
import com.app.pojos.ServiceType;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OrderDto {
	private Long orderId;
	private String trackingNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private ServiceType serviceType;
	private double declaredValue;
	private OrderStatus status;
	private CustomerDto senderId;
	private CustomerDto receiverId;
	private Long userId;
	private ParcelDto parcelId;
	private PaymentDto paymentId;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public ServiceType getServiceType() {
		return serviceType;
	}
	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}
	public double getDeclaredValue() {
		return declaredValue;
	}
	public void setDeclaredValue(double declaredValue) {
		this.declaredValue = declaredValue;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public CustomerDto getSenderId() {
		return senderId;
	}
	public void setSenderId(CustomerDto senderId) {
		this.senderId = senderId;
	}
	public CustomerDto getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(CustomerDto receiverId) {
		this.receiverId = receiverId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public ParcelDto getParcelId() {
		return parcelId;
	}
	public void setParcelId(ParcelDto parcelId) {
		this.parcelId = parcelId;
	}
	public PaymentDto getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(PaymentDto paymentId) {
		this.paymentId = paymentId;
	}
	

//	public void addParcelDto(ParcelDto parcelDto) {
//        this.parcels.add(parcelDto);
//        parcelDto.setOrderId(this.orderId);
//    }
//	
//	public void removeParcelDto(ParcelDto parcelDto) {
//        this.parcels.remove(parcelDto);
//        parcelDto.setOrderId(null);
//    }
}
