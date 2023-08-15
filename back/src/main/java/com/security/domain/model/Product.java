package com.security.domain.model;


import com.security.infraestructure.entities.OrderDetailEntity;
import com.security.infraestructure.entities.ProductOptionEntity;
import com.security.infraestructure.entities.ShoppingCartEntity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Product {
    private Long id;
    private String sku;
    private String name;
    private float price;
    private float weight;
    private String cartDesc;
    private String shortDesc;
    private String longDesc;
    private String thumb;
    private String image;
    private Integer category;
    private Date updateDate;
    private Float stock;
    private byte live;
    private byte unlimited;
    private String location;
    private List<OrderDetailEntity> orderDetail;
    private ShoppingCartEntity shoppingCart;
    private List<ProductOptionEntity> productOptions;

    public Product(Long id, String sku, String name, float price, float weight, String cartDesc, String shortDesc, String longDesc, String thumb, String image, Integer category, Date updateDate, Float stock, byte live, byte unlimited, String location, List<OrderDetailEntity> orderDetail, ShoppingCartEntity shoppingCart, List<ProductOptionEntity> productOptions) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.cartDesc = cartDesc;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.thumb = thumb;
        this.image = image;
        this.category = category;
        this.updateDate = updateDate;
        this.stock = stock;
        this.live = live;
        this.unlimited = unlimited;
        this.location = location;
        this.orderDetail = orderDetail;
        this.shoppingCart = shoppingCart;
        this.productOptions = productOptions;
    }

    public Product (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCartDesc() {
        return cartDesc;
    }

    public void setCartDesc(String cartDesc) {
        this.cartDesc = cartDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Float getStock() {
        return stock;
    }

    public void setStock(Float stock) {
        this.stock = stock;
    }

    public byte getLive() {
        return live;
    }

    public void setLive(byte live) {
        this.live = live;
    }

    public byte getUnlimited() {
        return unlimited;
    }

    public void setUnlimited(byte unlimited) {
        this.unlimited = unlimited;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<OrderDetailEntity> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public ShoppingCartEntity getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCartEntity shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<ProductOptionEntity> getProductOptions() {
        return productOptions;
    }

    public void setProductOptions(List<ProductOptionEntity> productOptions) {
        this.productOptions = productOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 && Float.compare(product.weight, weight) == 0 && live == product.live && unlimited == product.unlimited && Objects.equals(id, product.id) && Objects.equals(sku, product.sku) && Objects.equals(name, product.name) && Objects.equals(cartDesc, product.cartDesc) && Objects.equals(shortDesc, product.shortDesc) && Objects.equals(longDesc, product.longDesc) && Objects.equals(thumb, product.thumb) && Objects.equals(image, product.image) && Objects.equals(category, product.category) && Objects.equals(updateDate, product.updateDate) && Objects.equals(stock, product.stock) && Objects.equals(location, product.location) && Objects.equals(orderDetail, product.orderDetail) && Objects.equals(shoppingCart, product.shoppingCart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sku, name, price, weight, cartDesc, shortDesc, longDesc, thumb, image, category, updateDate, stock, live, unlimited, location, orderDetail, shoppingCart);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", cartDesc='" + cartDesc + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                ", thumb='" + thumb + '\'' +
                ", image='" + image + '\'' +
                ", category=" + category +
                ", updateDate=" + updateDate +
                ", stock=" + stock +
                ", live=" + live +
                ", unlimited=" + unlimited +
                ", location='" + location + '\'' +
                ", orderDetail=" + orderDetail +
                ", shoppingCart=" + shoppingCart +
                ", productOptions=" + productOptions +
                '}';
    }
}
