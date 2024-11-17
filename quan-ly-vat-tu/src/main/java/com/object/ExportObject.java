package com.object;

import java.sql.Date;

public class ExportObject {

    private int export_id;            // Mã phiếu xuất
    private String department;        // Phòng ban yêu cầu xuất vật tư
    private Date export_date;         // Ngày xuất vật tư
    private double total_amount;      // Tổng giá trị của vật tư xuất
    private int approved_by;          // Người phê duyệt phiếu xuất
    private String status;            // Trạng thái của phiếu xuất (Pending, Approved, Rejected)
    private String note;              // Ghi chú thêm

  
    
    public ExportObject() {
    	 super();
	}

    public ExportObject(int export_id, String department, Date export_date, double total_amount, int approved_by, String status, String note) {
        this.export_id = export_id;
        this.department = department;
        this.export_date = export_date;
        this.total_amount = total_amount;
        this.approved_by = approved_by;
        this.status = status;
        this.note = note;
    }

    // Getters and Setters
    public int getExport_id() {
        return export_id;
    }

    public void setExport_id(int export_id) {
        this.export_id = export_id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getExport_date() {
        return export_date;
    }

    public void setExport_date(Date export_date) {
        this.export_date = export_date;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public int getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(int approved_by) {
        this.approved_by = approved_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // ToString Method for displaying the object
    @Override
    public String toString() {
        return "ExportObject{" +
                "export_id=" + export_id +
                ", department='" + department + '\'' +
                ", export_date=" + export_date +
                ", total_amount=" + total_amount +
                ", approved_by=" + approved_by +
                ", status='" + status + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
