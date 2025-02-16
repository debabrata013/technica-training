package cw;

import java.util.Scanner;

class B {
    // Method to find the maximum distance from any city to the nearest space station
    static void maxDistanceForAnyCityToSpacestation(int numberOfCities, int[] spaceStations) {
        int numberOfStations = spaceStations.length;
        int maxDistance = 0;

        for (int city = 0; city < numberOfCities; city++) {
            int minDistance = Integer.MAX_VALUE;
            for (int station = 0; station < numberOfStations; station++) {
                minDistance = Math.min(minDistance, Math.abs(city - spaceStations[station]));
            }
            maxDistance = Math.max(maxDistance, minDistance);
        }
        System.out.println(maxDistance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cities:");
        int numberOfCities = scanner.nextInt();

        System.out.println("Enter the number of space stations:");
        int numberOfStations = scanner.nextInt();

        int[] spaceStations = new int[numberOfStations];
        System.out.println("Enter the space station locations:");
        for (int i = 0; i < numberOfStations; i++) {
            spaceStations[i] = scanner.nextInt();
        }

        System.out.println("The maximum distance from any city to the nearest space station is:");
        maxDistanceForAnyCityToSpacestation(numberOfCities, spaceStations);

        scanner.close();
    }
}