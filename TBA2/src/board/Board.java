package board;

import room.Room;

public class Board {
    private static Room[][] map;
    public Board(Room[][] map)
    {
        this.map = map;
    }

    public static void printMap()
    {
        for(Room[] row : map)
        {
            for (Room room : row)
            {
                room.print();
            }
            System.out.println();
        }
    }
    public void setMap(Room[][] map) {
        this.map = map;
    }
    public Room[][] getMap() {
        return map;
    }

}
