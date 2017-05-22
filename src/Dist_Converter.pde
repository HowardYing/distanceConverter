void setup() {
  size(900, 600);
}

void draw() {
  background(mouseX/4);
  textSize(36);
  fill(#2CB473);
  text("Distance Converter", 300, 50);
  textSize(18);
  fill(#76B0FF);
  text("By Howard Ying", 385, 85);
  textSize(12);
  fill(#9AC3FA);
  text("Move your mouse to the desired amount of miles to convert", 285, 250);
  drawReference(50, 150);
  if (mileToKilo(mouseX-50) <= 0) {
    fill(255-mouseX/4);
    rect(50, 175, 50-50, 15);
    fill(#0ECBC0);
    text(50-50 + " Miles is " + mileToKilo(50-50) + " Kilometers", 385, 215);
  } else if (mouseX-50>800) {
    fill(255-mouseX/4);
    rect(50, 175, 850-50, 15);
    fill(#0ECBC0);
    text(800 + " Miles is " + mileToKilo(800) + " Kilometers", 360, 215);
  } else if (mouseX == 51) {
    fill(255-mouseX/4);
    rect(50, 175, mouseX-50, 15);
    fill(#0ECBC0);
    text(mouseX-50 + " Mile is " + mileToKilo(mouseX-50) + " Kilometers", 360, 215);
  } else {
    fill(255-mouseX/4);
    rect(50, 175, mouseX-50, 15);
    fill(#0ECBC0);
    text(mouseX-50 + " Miles is " + mileToKilo(mouseX-50) + " Kilometers", 360, 215);
  }
  
  fill(#9AC3FA);
  text("Move your mouse to the desired amount of kilometers to convert", 270, 490);
  drawReference(50, 385);
  if (kiloToMile(mouseX-50) <= 0) {
    fill(255-mouseX/4);
    rect(50, 415, 0, 15);
    fill(#0ECBC0);
    text(50-50 + " Kilometers is " + kiloToMile(50-50) + " Miles", 385, 460);
  } else if (mouseX-50>800) {
    fill(255-mouseX/4);
    rect(50, 415, 850-50, 15);
    fill(#0ECBC0);
    text(800 + " Kilometers is " + kiloToMile(800) + " Miles", 360, 460);
  } else if (mouseX == 51) {
    fill(255-mouseX/4);
    rect(50, 415, mouseX-50, 15);
    fill(#0ECBC0);
    text(mouseX-50 + " Kilometer is " + kiloToMile(mouseX-50) + " Miles", 360, 460);
  } else {
    fill(255-mouseX/4);
    rect(50, 415, mouseX-50, 15);
    fill(#0ECBC0);
    text(mouseX-50 + " Kilometers is " + kiloToMile(mouseX-50) + " Miles", 360, 460);
  }
  fill(#6F64F2);
}

void drawReference(int xpos, int ypos) {
  fill(#6F64F2);
  line(xpos, ypos, 850, ypos);
  for (int i=0; i<850; i=i+50) {
    stroke(#6F64F2);
    fill(#0E75CB);
    line(xpos+i, ypos-5, xpos+i, ypos+5);
    text(i, xpos+i-5, ypos-8);
  }
}

//mi to km conversion code
float mileToKilo(float mile) {
  mile = (mile * 1.60934);
  return mile;
}

//km to mi conversion code
float kiloToMile(float kilo) {
  kilo = (kilo * 0.621371);
  return kilo;
}