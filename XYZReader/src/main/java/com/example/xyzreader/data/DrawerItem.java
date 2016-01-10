package com.example.xyzreader.data;

/**
 * Class to store a drawer label with icon for display in a ListView via an ArrayAdapter.
 */
public class DrawerItem {

    private int icon;
    private String label;

    // Constructor
    public DrawerItem(int icon, String label) {
        this.icon = icon;
        this.label = label;
    }

    // Getters and Setters
    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
