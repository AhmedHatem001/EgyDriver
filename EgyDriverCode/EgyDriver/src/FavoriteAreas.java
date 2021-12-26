import java.util.*;

//favorite area model

public class FavoriteAreas {
  public ArrayList<String> favoriteAreas = new ArrayList<String>();

  public void addFavoriteArea(String source) {
    favoriteAreas.add(source);
  }

  void removeFavoriteArea(String source) {
    favoriteAreas.remove(source);
  }

  public void listFavoriteAreas() {
    for (int i = 0; i < favoriteAreas.size(); i++) {
      System.out.print((i + 1) + ". " + favoriteAreas.get(i) + " ");
    }
    System.out.println();
  }

  ArrayList<String> getFavoriteAreas() {
    return favoriteAreas;
  }

}
