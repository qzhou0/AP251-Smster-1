//Qian Zhou
//APCS2 pd01
//HW52 -- Grow & Shrink
//2018-05-22

boolean grow=true;
float r=100;
// color determinants to avoid having to choose a favorite color
int red, blue, green;
color c;

void setup() {
  background(0, 0, 0);
  size(1000, 1000);
}
void mouseClicked() {
  grow = !grow;
}
void draw() {
  float rate;
  if (grow) {
    rate = 1.002;
  } else {
    rate =0.998;
  }
  r*=rate;
  background(0, 0, 0);
  
  red = (int)random(255);
  blue = (int)random(255);
  green=(int)random(255);
    c = color(red, green, blue);
  fill(c);
  ellipse(500, 500, r, r);
}
