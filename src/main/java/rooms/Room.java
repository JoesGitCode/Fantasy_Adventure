package rooms;

import java.util.ArrayList;

public class Room {

    private ArrayList<IRoomable> roomContents;

    public Room(){
        this.roomContents = new ArrayList<IRoomable>();
    }

    public int numberOfContents(){
       return roomContents.size();
    }

    public void addContent(IRoomable content){
        roomContents.add(content);
    }

}
