package ro.ase.acs.builder.model;

public class Builder implements AbstractBuilder {

    Reservation reservation;
    @Override
    public Reservation getReservation() {
        return reservation;
    }
    public Builder(){
        reservation=new Reservation(false,false,false,false,null);
    }

    public Builder setIsWindowPosition(boolean isWindowPosition){
        reservation.setWindowPosition(isWindowPosition);
        return this;
    }
    public Builder setErgoChairs(boolean ergoChairs) {
        reservation.setErgoChairs(ergoChairs);
        return this;
    }
    public Builder setDecoratedTable(boolean decoratedTable) {
        reservation.setDecoratedTable(decoratedTable);
        return this;
    }
    public Builder setAmbientalMusic(boolean ambientalMusic) {
        reservation.setAmbientalMusic(ambientalMusic);
        return this;
    }
    protected Builder setMusicType(String musicType) {
        reservation.setMusicType(musicType);
        return this;
    }

}
