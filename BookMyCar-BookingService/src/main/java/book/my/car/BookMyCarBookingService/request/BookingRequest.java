package book.my.car.BookMyCarBookingService.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequest {
    private String carId;
    private String pickUpLocation;
    private String dropLocation;
    private LocalTime pickUpTime;
    private LocalDate pickUpDate;
    private LocalDate dropDate;
    private Integer members;
    private Integer days;
    private Integer numBags;
}
//  "carId": "64176646694aa56467e78cf0",
//          "pickUpLocation": "PUNE",
//          "dropLocation": "GOA",
//          "pickUpTime": "10:00",
//          "pickUpDate": "2023-05-01",
//          "dropDate": "2023-05-06",
//          "passangerCapacity": 4,
//          "members": "4",
//          "days": 5,
//          "numBags": "2"
