
void setup() {
 
  // set the size of your sketch
  size(600,600);
}

void draw() {
  
  
  for(int i = 550; i >0; i -= 117) {
if(i % 2 == 0) {
  fill(255,0,0);
}
else{
  fill(0,255,0);
}
    ellipse(300,300,i,i);
  
  
  
}
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
