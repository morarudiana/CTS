package ro.ase.acs.builder.main;

import ro.ase.acs.builder.model.Builder;
import ro.ase.acs.builder.model.Reservation;

public class Main {
    public static void main(String[] args) {
        Builder builder=new Builder();
        builder.setAmbientalMusic(true)
                .setMusicType("Jazz");
        Reservation reservation=builder.getReservation();
        System.out.println(reservation.toString());

       // Reservation reservation2=builder.getReservation();
    }
}

