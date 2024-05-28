package gr.aueb.cf.ch12.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {
    private int id;
    private String uuid;
    private double amount;
    private String description;
    private int state;
    private LocalDateTime timestamp;
    private String formattedTimestamp;

    public Order() {

    }

    public Order(int id, double amount, String description,
                 int state) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        this.id = id;
        this.uuid = UUID.randomUUID().toString();
        this.amount = amount;
        this.description = description;
        this.state = state;
        this.timestamp = LocalDateTime.now();
        this.formattedTimestamp = this.timestamp.format(formatter);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }
    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }
}
