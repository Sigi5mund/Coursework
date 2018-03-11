package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommandCentre {

    ArrayList<String> commandLine;
    public String nextCommand;
    HashMap<Integer, ArrayList<String>> noGoArea;
    Grid grid;



    public CommandCentre(Grid grid) {
        this.grid = grid;
        this.commandLine = null;
        this.nextCommand = null;
        this.noGoArea = new HashMap<>();



    }

    public void upLoadNavInputToCommandLine(String navInput){
        this.commandLine = new ArrayList<String>(Arrays.asList(navInput.split("")));
    }


        public boolean getNextCommand(){
            if (commandLine.size() == 0){
                return false;
            }
            this.nextCommand = commandLine.get(0);
            this.commandLine.remove(0);
            return true;
        }

        public void noMoveDueToLostList(){

        }

        public Grid getGrid(){
        return this.grid;
        }
}

