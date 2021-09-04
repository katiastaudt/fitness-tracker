package com.example.fitnesstraker;

public class MainItem {

    private int id;
    private int drawableId;
    private int textStringId;
    private int color;

    public MainItem(int id, int drawableId,int textStringId, int color) {
        this.id = id;
        this.drawableId = drawableId;
        this.textStringId = textStringId;
        this.color = color;
    }

    public void setId (int id){
        this.id = id;
    }
    public void setDrawableId (int drawableId){
        this.drawableId = drawableId;
    }
    public void setTextStringId (int textStringId){
        this.textStringId = textStringId;
    }
    public void setColor (int color){
        this.color = color;
    }
    public int getId (){
        return id;
    }
    public int getDrawableId(){
        return drawableId;
    }
    public int getTextStringId(){
        return textStringId;
    }
    public int getColor(){
        return color;
    }

}
