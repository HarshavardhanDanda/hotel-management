package com.springboot.hotelmanagement.enitity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="hotel_id")
    private int hotelId;

    @Column(name="hotel_name")
    private String hotelName;

    @Column(name="hotel_address")
    private String hotelAddress;

    @Column(name="hotel_rating")
    private String hotelRating;

    @OneToMany(mappedBy="hotel",cascade=CascadeType.ALL)
    private List<Room> rooms;

    @OneToMany(mappedBy="hotel", cascade=CascadeType.ALL)
    private List<Customer> customers;

    public Hotel(){}

    public Hotel(String hotelName, String hotelAddress, String hotelRating) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelRating = hotelRating;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(String rating) {
        this.hotelRating = hotelRating;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", rating='" + hotelRating + '\'' +
                '}';
    }
}
