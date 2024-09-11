package org.example;

public class Train {

    private String trainNumber;
    private String trainName;
    private String traintype;


    public Train(String trainNumber, String trainName, String traintype) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.traintype = traintype;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTraintype() {
        return traintype;
    }

    public void setTraintype(String traintype) {
        this.traintype = traintype;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNumber=" + trainNumber +
                ", trainName='" + trainName + '\'' +
                ", traintype='" + traintype + '\'' +
                '}';
    }
}
