

import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int capacity;


    public Network(String name, int capacity){
        this.devices = new ArrayList<IConnect>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (devices.size() < this.capacity)
        {devices.add(device);}
    }

    public void disconnectAll(){
        devices.clear();
    }

    public void disconnectDevice(IConnect iconnect){
        devices.remove(iconnect);
    }

    public int availableSlots(){
        return this.capacity - devices.size();
    }

    public ArrayList<IConnect> getDevices() {
        return devices;
    }
}