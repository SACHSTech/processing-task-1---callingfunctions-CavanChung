/**
 * Name:Processing Task 1 - Calling Functions
 * Purpose:Drawing House
 * Author: Cavan Chung
 * Created:2022/02/22
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// set size
    size(400, 400);
  }

  // Set background colour, set/draw background shapes to create shape overlap
  public void setup() {

    // set background
    background(173, 216, 230);

    // set/draw grass
    fill(210, 255, 173);
    rect(0, 350, 400, 50);

    // set/draw the rectangular house base
    fill(255, 0, 0);
    rect(100, 200, 200, 200);  

  }

  public void draw() {
	  
	  // draw window 1
    fill(173,216,230);
    rect(125, 250, 50, 50);  

    // draw window 2
    fill(173,216,230);
    rect(225, 250, 50, 50); 

    // draw sun
    fill(255, 255, 0);
    ellipse(355, 45, 50, 50);

    // draw house roof
    fill(165,42,42);
    triangle(100, 200, 300, 200, 200, 75);

    // draw house door
    fill(78,53,36);
    rect(175, 325, 50, 75);

  }
  
}