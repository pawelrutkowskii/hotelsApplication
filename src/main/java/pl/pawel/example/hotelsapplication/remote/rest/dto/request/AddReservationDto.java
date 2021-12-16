package pl.pawel.example.hotelsapplication.remote.rest.dto.request;

import pl.pawel.example.hotelsapplication.remote.rest.dto.common.PersonReservationDto;
import pl.pawel.example.hotelsapplication.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> hotels;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }
}

