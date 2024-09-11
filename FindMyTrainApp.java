package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        // Total control by TrainSystem
        TrainSystem trainSystem = new TrainSystem();

        //Adding of Station
        Station station1 = new Station("CTP", "CHATRAPUR");
        Station station2 = new Station("BBSR", "BHUBANESWAR");

        //Adding of Train

        Train train1 = new Train("01254", "Brahmapur-Bhubaneswar Memo Special",
                "Memo/ Local");
        Train train2 = new Train("456898", "Prasanti Express","Express");

        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);


        Schedule s1 = new Schedule(train1,station1,"9AM","9.05 AM", p1);
        Schedule s2 = new Schedule(train1,station1,"10AM","10.03 AM", p2);

        trainSystem.addStation(station1);
        trainSystem.addStation(station2);
        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);
        trainSystem.addSchedule(s1);
        trainSystem.addSchedule(s2);

        // Let's find Train between Station

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Source : ");
        String source = sc.nextLine();

        System.out.println("Enter the destination : ");
        String destination = sc.nextLine();

       List<Schedule> myTrain = trainSystem.findMyTrain(source,destination);
        System.out.println("Your Trains Between " +source+ "and " +destination);

        System.out.println(myTrain.get(0));

    }
}
