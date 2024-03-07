package com.github.oscarnorman1.enteties;

import javax.swing.*;

public class Box extends JButton {

    private int displayNum;
    private int actualNum;

    public Box(int displayNum, int actualNum) {
        this.displayNum = displayNum;
        this.actualNum = actualNum;
        this.setSize(10, 10);
        this.setText(String.valueOf(displayNum));
    }

}
