package com.marko.rain.graphics;

import java.util.Arrays;

public class Screen {

    private int width;
    private int height;
    public int[] pixels;

    int time = 0;
    int counter = 0;

    public Screen(int width, int height){
        this.width = width;
        this.height = height;
        this.pixels = new int[width*height];
    }

    public void clear(){
        Arrays.fill(pixels, 0);
    }


    public void render(){
        counter++;
        if(counter % 100 == 0){
            time++;
        }
        for(int y = 0; y<height;y++){
            for(int x = 0; x<width;x++){
                pixels[time + y * time] = 0xff00ff;
            }
        }
    }
}
