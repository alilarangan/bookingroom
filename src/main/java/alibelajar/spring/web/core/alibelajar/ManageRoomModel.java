package alibelajar.spring.web.core.alibelajar;

public class ManageRoomModel {
    private Long id;
    private String roomName;
    private int capacity;
    private String location;

    public ManageRoomModel(Long id, String roomName, int capacity, String location) {
        this.id = id;
        this.roomName = roomName;
        this.capacity = capacity;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
