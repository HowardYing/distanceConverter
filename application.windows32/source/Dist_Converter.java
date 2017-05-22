import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dist_Converter extends PApplet {

public void setup() {
  
}

public void draw() {
  background(mouseX/4);
  textSize(36);
  fill(0xff2CB473);
  text("Distance Converter", 300, 50);
  textSize(18);
  fill(0xff76B0FF);
  text("By Howard Ying", 385, 85);
  textSize(12);
  fill(0xff9AC3FA);
  text("Move your mouse to the desired amount of miles to convert", 285, 250);
  drawReference(50, 150);
  if (mileToKilo(mouseX-50) <= 0) {
    fill(255-mouseX/4);
    rect(50, 175, 50-50, 15);
    fill(0xff0ECBC0);
    text(50-50 + " Miles is " + mileToKilo(50-50) + " Kilometers", 385, 215);
  } else if (mouseX-50>800) {
    fill(255-mouseX/4);
    rect(50, 175, 850-50, 15);
    fill(0xff0ECBC0);
    text(800 + " Miles is " + mileToKilo(800) + " Kilometers", 360, 215);
  } else if (mouseX == 51) {
    fill(255-mouseX/4);
    rect(50, 175, mouseX-50, 15);
    fill(0xff0ECBC0);
    text(mouseX-50 + " Mile is " + mileToKilo(mouseX-50) + " Kilometers", 360, 215);
  } else {
    fill(255-mouseX/4);
    rect(50, 175, mouseX-50, 15);
    fill(0xff0ECBC0);
    text(mouseX-50 + " Miles is " + mileToKilo(mouseX-50) + " Kilometers", 360, 215);
  }
  
  fill(0xff9AC3FA);
  text("Move your mouse to the desired amount of kilometers to convert", 270, 490);
  drawReference(50, 385);
  if (kiloToMile(mouseX-50) <= 0) {
    fill(255-mouseX/4);
    rect(50, 415, 0, 15);
    fill(0xff0ECBC0);
    text(50-50 + " Kilometers is " + kiloToMile(50-50) + " Miles", 385, 460);
  } else if (mouseX-50>800) {
    fill(255-mouseX/4);
    rect(50, 415, 850-50, 15);
    fill(0xff0ECBC0);
    text(800 + " Kilometers is " + kiloToMile(800) + " Miles", 360, 460);
  } else if (mouseX == 51) {
    fill(255-mouseX/4);
    rect(50, 415, mouseX-50, 15);
    fill(0xff0ECBC0);
    text(mouseX-50 + " Kilometer is " + kiloToMile(mouseX-50) + " Miles", 360, 460);
  } else {
    fill(255-mouseX/4);
    rect(50, 415, mouseX-50, 15);
    fill(0xff0ECBC0);
    text(mouseX-50 + " Kilometers is " + kiloToMile(mouseX-50) + " Miles", 360, 460);
  }
  fill(0xff6F64F2);
}

public void drawReference(int xpos, int ypos) {
  fill(0xff6F64F2);
  line(xpos, ypos, 850, ypos);
  for (int i=0; i<850; i=i+50) {
    stroke(0xff6F64F2);
    fill(0xff0E75CB);
    line(xpos+i, ypos-5, xpos+i, ypos+5);
    text(i, xpos+i-5, ypos-8);
  }
}

//mi to km conversion code
public float mileToKilo(float mile) {
  mile = (mile * 1.60934f);
  return mile;
}

//km to mi conversion code
public float kiloToMile(float kilo) {
  kilo = (kilo * 0.621371f);
  return kilo;
}
  public void settings() {  size(900, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Dist_Converter" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
