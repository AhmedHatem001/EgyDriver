package com.egydriver.hello;

import java.util.*;

//favorite area model

public class FavoriteAreas {
  public ArrayList<String> favoriteAreas = new ArrayList<String>();

  public void addFavoriteArea(String source) {
    if (favoriteAreas.contains(source))
      System.out.println("You already have this location in your favorite areas list!");
    else
      favoriteAreas.add(source);
  }

  void removeFavoriteArea(String source) {
    favoriteAreas.remove(source);
  }

  public void listFavoriteAreas() {
    // System.out.println();
    for (int i = 0; i < favoriteAreas.size(); i++) {
      System.out.print((i + 1) + ". " + favoriteAreas.get(i) + " ");
    }
    System.out.println();
  }

  ArrayList<String> getFavoriteAreas() {
    return favoriteAreas;
  }

  String selectFaovriteArea(int index) {
    return favoriteAreas.get(index);
  }
}
