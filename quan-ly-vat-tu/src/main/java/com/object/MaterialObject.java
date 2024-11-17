package com.object;

import java.sql.Date;

public class MaterialObject {
    private int material_id;         // Mã vật tư
    private String material_name;    // Tên vật tư
    private int category_id;         // Mã loại vật tư (liên kết với bảng MaterialCategory)
    private int supplier_id;         // Mã nhà cung cấp (liên kết với bảng Supplier)
    private String unit;             // Đơn vị tính
    private int quantity_in_stock;   // Số lượng tồn kho
    private int reorder_level;       // Mức tồn kho tối thiểu
    private String color;            // Màu sắc của vật tư
    private String size;             // Kích thước của vật tư
    private Date manufacture_date;   // Ngày sản xuất của vật tư
    private Date expiration_date;    // Ngày hết hạn của vật tư
    private String description;      // Mô tả vật tư

    // Constructor không tham số
    public MaterialObject() {
        super();
    }

    // Constructor có tham số
    public MaterialObject(int material_id, String material_name, int category_id, int supplier_id, String unit,
                          int quantity_in_stock, int reorder_level, String color, String size, Date manufacture_date,
                          Date expiration_date, String description) {
        this.material_id = material_id;
        this.material_name = material_name;
        this.category_id = category_id;
        this.supplier_id = supplier_id;
        this.unit = unit;
        this.quantity_in_stock = quantity_in_stock;
        this.reorder_level = reorder_level;
        this.color = color;
        this.size = size;
        this.manufacture_date = manufacture_date;
        this.expiration_date = expiration_date;
        this.description = description;
    }

    // Getters and Setters
    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantity_in_stock() {
        return quantity_in_stock;
    }

    public void setQuantity_in_stock(int quantity_in_stock) {
        this.quantity_in_stock = quantity_in_stock;
    }

    public int getReorder_level() {
        return reorder_level;
    }

    public void setReorder_level(int reorder_level) {
        this.reorder_level = reorder_level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Date getManufacture_date() {
        return manufacture_date;
    }

    public void setManufacture_date(Date manufacture_date) {
        this.manufacture_date = manufacture_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MaterialObject [material_id=" + material_id + ", material_name=" + material_name + ", category_id=" + category_id
                + ", supplier_id=" + supplier_id + ", unit=" + unit + ", quantity_in_stock=" + quantity_in_stock
                + ", reorder_level=" + reorder_level + ", color=" + color + ", size=" + size + ", manufacture_date=" + manufacture_date
                + ", expiration_date=" + expiration_date + ", description=" + description + "]";
    }
}

