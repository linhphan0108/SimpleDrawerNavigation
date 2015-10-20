package com.linhphan.simpledrawernavigation.model;

/**
 * Created by linhphan on 10/20/15.
 */
public class DrawerNavigationItem {
    private int icon;
    private String title;
    private String counter;
    private boolean isCounterVisible;

    public DrawerNavigationItem() {
    }

    public DrawerNavigationItem(String title, int icon) {
        this.icon = icon;
        this.title = title;
    }

    public DrawerNavigationItem(String title, int icon, boolean isCounterVisible, String counter) {
        this.icon = icon;
        this.title = title;
        this.counter = counter;
        this.isCounterVisible = isCounterVisible;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public boolean isCounterVisible() {
        return isCounterVisible;
    }

    public void setIsCounterVisible(boolean isCounterVisible) {
        this.isCounterVisible = isCounterVisible;
    }
}
