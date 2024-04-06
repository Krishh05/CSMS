package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Long orderId;
	@Column(name = "tracking_number")
	private String trackingNumber;
	@Column(name = "order_date")
	private LocalDate orderDate;
	@Column(name = "delivery_date")
	private LocalDate deliveryDate;
	@Enumerated(EnumType.STRING)
	@Column(name = "service_type")
	private ServiceType serviceType;
	@Column(name = "declared_value")
	private double declaredValue;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sender_id")
	private Customer senderId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "receiver_id")
	private Customer receiverId;
	@OneToOne(cascade = CascadeType.ALL)
	private Parcel parcelId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id")
	private Payment paymentId;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User userId;
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
	public Customer getSenderId() {
		return senderId;
	}
	public void setSenderId(Customer senderId) {
		this.senderId = senderId;
	}
	public Customer getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(Customer receiverId) {
		this.receiverId = receiverId;
	}
	public Parcel getParcelId() {
		return parcelId;
	}
	public void setParcelId(Parcel parcelId) {
		this.parcelId = parcelId;
	}
	public Payment getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	

//	public void addComplaint(Complaint complaint) {
//        this.complaints.add(complaint);
//        complaint.setOrderId(this);
//    }
//	
//	public void removeComplaint(Complaint complaint) {
//        this.complaints.remove(complaint);
//        complaint.setOrderId(null);
//    }
}
