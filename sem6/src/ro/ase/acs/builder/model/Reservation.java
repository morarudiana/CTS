package ro.ase.acs.builder.model;

public class Reservation {
    private boolean isWindowPosition;
    private boolean isErgoChairs;
    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicType;

    public Reservation(boolean isWindowPosition, boolean isErgoChairs, boolean isDecoratedTable, boolean isAmbientalMusic, String musicType) {
        this.isWindowPosition = isWindowPosition;
        this.isErgoChairs = isErgoChairs;
        this.isDecoratedTable = isDecoratedTable;
        this.isAmbientalMusic = isAmbientalMusic;
        this.musicType = musicType;
    }

    public boolean isWindowPosition() {
        return isWindowPosition;
    }

    public void setWindowPosition(boolean windowPosition) {
        isWindowPosition = windowPosition;
    }

    public boolean isErgoChairs() {
        return isErgoChairs;
    }

    public void setErgoChairs(boolean ergoChairs) {
        isErgoChairs = ergoChairs;
    }

    public boolean isDecoratedTable() {
        return isDecoratedTable;
    }

    public void setDecoratedTable(boolean decoratedTable) {
        isDecoratedTable = decoratedTable;
    }

    public boolean isAmbientalMusic() {
        return isAmbientalMusic;
    }

    public void setAmbientalMusic(boolean ambientalMusic) {
        isAmbientalMusic = ambientalMusic;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "isWindowPosition=" + isWindowPosition +
                ", isErgoChairs=" + isErgoChairs +
                ", isDecoratedTable=" + isDecoratedTable +
                ", isAmbientalMusic=" + isAmbientalMusic +
                ", musicType='" + musicType + '\'' +
                '}';
    }
}
