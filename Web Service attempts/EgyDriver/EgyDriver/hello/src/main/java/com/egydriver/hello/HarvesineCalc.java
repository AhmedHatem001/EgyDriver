package com.egydriver.hello;

import java.util.*;

public class HarvesineCalc implements CalcDistTime {

  private double distance;
  private double speed = 60.0;
  private double lat1, lon1, lat2, lon2;

  public double getData(String source, String destination) {
    if (source == "Cairo") {
      lat1 = 30.0444;
      lon1 = 31.2357;
    } else if (destination == "Cairo") {
      lat2 = 30.0444;
      lon2 = 31.2357;
    } else if (source == "Gize") {
      lat1 = 30.0131;
      lon1 = 31.2089;
    } else if (destination == "Giza") {
      lat2 = 30.0131;
      lon2 = 31.2089;
    } else if (source == "Luxor") {
      lat1 = 25.6872;
      lon1 = 32.6396;
    } else if (destination == "Luxor") {
      lat2 = 25.6872;
      lon2 = 32.6396;
    } else if (source == "Alexandria") {
      lat1 = 31.2001;
      lon1 = 29.9187;
    } else if (destination == "Alexandria") {
      lat2 = 31.2001;
      lon2 = 29.9187;
    } else if (source == "Aswan") {
      lat1 = 24.0889;
      lon1 = 32.8998;
    } else if (destination == "Aswan") {
      lat2 = 24.0889;
      lon2 = 32.8998;
    } else if (source == "Hurghada") {
      lat1 = 27.2579;
      lon1 = 33.8116;
    } else if (destination == "Hurghada") {
      lat2 = 27.2579;
      lon2 = 33.8116;
    } else if (source == "Ismailia") {
      lat1 = 30.5965;
      lon1 = 32.2715;
    } else if (destination == "Ismailia") {
      lat2 = 30.5965;
      lon2 = 32.2715;
    } else if (source == "Asyut") {
      lat1 = 27.1783;
      lon1 = 31.1859;
    } else {
      lat2 = 27.1783;
      lon2 = 31.1859;
    }
    return harvesine(lat1, lon1, lat2, lon2);
  }

  double harvesine(double lat1, double lon1,
      double lat2, double lon2) {
    // distance between latitudes and longitudes
    double dLat = Math.toRadians(lat2 - lat1);
    double dLon = Math.toRadians(lon2 - lon1);

    // convert to radians
    lat1 = Math.toRadians(lat1);
    lat2 = Math.toRadians(lat2);

    // apply formulae
    double a = Math.pow(Math.sin(dLat / 2), 2) +
        Math.pow(Math.sin(dLon / 2), 2) *
            Math.cos(lat1) *
            Math.cos(lat2);
    double rad = 6371;
    double c = 2 * Math.asin(Math.sqrt(a));
    distance = rad * c;
    return rad * c;
  }

  public double getETA() {
    return distance / speed;
  }

  // public static void main(String[] args) {
  // HarvesineCalc calc = new HarvesineCalc();
  // System.out.println(calc.getData("Cairo", "Giza") + " " + calc.getETA());
  // }
}
