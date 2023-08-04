package com.security.domain.model;

import com.security.infraestructure.entities.OrderDetailEntity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    private Long id;
    private int user;
    private float amount;
    private String shipName;
    private String shipAddress;
    private String shipAddress2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String fax;
    private float shipping;
    private float tax;
    private String email;
    private Date date;
    private byte shipped;
    private String trackingNumber;
    private List<OrderDetailEntity> orderDetail;


    public Order(Long id, int user, float amount, String shipName, String shipAddress, String shipAddress2, String city, String state, String zip, String country, String phone, String fax, float shipping, float tax, String email, Date date, byte shipped, String trackingNumber, List<OrderDetailEntity> orderDetail) {
        this.id = id;
        this.user = user;
        this.amount = amount;
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipAddress2 = shipAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
        this.shipping = shipping;
        this.tax = tax;
        this.email = email;
        this.date = date;
        this.shipped = shipped;
        this.trackingNumber = trackingNumber;
        this.orderDetail = orderDetail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipAddress2() {
        return shipAddress2;
    }

    public void setShipAddress2(String shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public float getShipping() {
        return shipping;
    }

    public void setShipping(float shipping) {
        this.shipping = shipping;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte getShipped() {
        return shipped;
    }

    public void setShipped(byte shipped) {
        this.shipped = shipped;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return user == order.user && Float.compare(order.amount, amount) == 0 && Float.compare(order.shipping, shipping) == 0 && Float.compare(order.tax, tax) == 0 && shipped == order.shipped && Objects.equals(id, order.id) && Objects.equals(shipName, order.shipName) && Objects.equals(shipAddress, order.shipAddress) && Objects.equals(shipAddress2, order.shipAddress2) && Objects.equals(city, order.city) && Objects.equals(state, order.state) && Objects.equals(zip, order.zip) && Objects.equals(country, order.country) && Objects.equals(phone, order.phone) && Objects.equals(fax, order.fax) && Objects.equals(email, order.email) && Objects.equals(date, order.date) && Objects.equals(trackingNumber, order.trackingNumber) && Objects.equals(orderDetail, order.orderDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, amount, shipName, shipAddress, shipAddress2, city, state, zip, country, phone, fax, shipping, tax, email, date, shipped, trackingNumber, orderDetail);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", amount=" + amount +
                ", shipName='" + shipName + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipAddress2='" + shipAddress2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", shipping=" + shipping +
                ", tax=" + tax +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", shipped=" + shipped +
                ", trackingNumber='" + trackingNumber + '\'' +
                ", orderDetail=" + orderDetail +
                '}';
    }
}

