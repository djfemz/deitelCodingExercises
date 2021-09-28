package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

class TurtleTest {
    Turtle ijapa = new Turtle();
    private Pen pen = new Pen();
    private Position position = new Position(0,0);

    @BeforeEach
    void setUp() {
        Pen pen = ijapa.getPen();
    }

    @Test
    void testThatTurtleHasAPen() {
        assertNotNull(pen);
    }

    @Test
    void testThatPenIsUpByDefault() {
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
    }

    @Test
    void testThatTurtleCanMovePenDown() {
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        //when
        ijapa.penDown();
        //assert
        assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
    }

    @Test
    void testThatTurtleCanMovePenUp() {
        Pen pen = ijapa.getPen();
        assertSame(PenPosition.UP, pen.getPosition());
        ijapa.penDown();
        assertSame(PenPosition.DOWN, ijapa.getPen().getPosition());
        //when
        ijapa.penUp();
        //assert
        assertSame(PenPosition.UP, ijapa.getPen().getPosition());
    }

    @Test
    @DisplayName("Turtle can turn right while facing east test")
    void testThatTurtleCanTurnRight1() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing south test")
    void testThatTurtleCanTurnRight2() {
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing south test")
    void testThatTurtleCanTurnRight3() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }
    //todo add turn right while facing NORTH test

    @Test
    @DisplayName("Turtle can turn right while facing north test")
    void testThatTurtleCanTurnRight4() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing east test")
    void testThatTurtleCanTurnLeft1() {
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing north test")
    void testThatTurtleCanTurnLeft2() {
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void testThatTurtleCanMoveForwardWhileFacingEast() {
        //given that
        assertEquals(position, ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhileFacingSouth() {
        //given that
        ijapa.turnRight();
        assertEquals(position, ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhileFacingWest() {
        //given that
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(position, ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(0, 5), ijapa.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanMoveForwardWhileFacingNorth() {
        //given that
        ijapa.turnLeft();
        assertEquals(position, ijapa.getCurrentPosition());
        ijapa.move(5);
        assertEquals(new Position(5, 0), ijapa.getCurrentPosition());
    }

    @Test
    void testThatTurtleCanWriteOnSketchpadWhileFacingEast() {
        Sketchpad sketchpad = new Sketchpad(6,6);
        int[][] floor = sketchpad.getFloor();
        ijapa.penDown();
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(0, floor[0][5]);

    }

    @Test
    void testThatTurtleCanWriteOnSketchpadWhileFacingSouth() {
        Sketchpad sketchpad = new Sketchpad(6,6);
        int[][] floor = sketchpad.getFloor();
        ijapa.penDown();
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(0, floor[0][5]);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[1][4]);
        assertEquals(1, floor[2][4]);
        assertEquals(1, floor[3][4]);
        assertEquals(1, floor[4][4]);
        assertEquals(0, floor[5][4]);

    }
    @Test
    void testThatTurtleCanWriteOnSketchpadWhileFacingWest() {
        Sketchpad sketchpad = new Sketchpad(6,6);
        int[][] floor = sketchpad.getFloor();
        ijapa.penDown();
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(0, floor[0][5]);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[1][4]);
        assertEquals(1, floor[2][4]);
        assertEquals(1, floor[3][4]);
        assertEquals(1, floor[4][4]);
        assertEquals(0, floor[5][4]);
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[4][4]);
        assertEquals(1, floor[4][3]);
        assertEquals(1, floor[4][2]);
        assertEquals(1, floor[4][1]);
        assertEquals(1, floor[4][0]);
    }

    @Test
    void testThatTurtleCanWriteOnSketchpadWhileFacingNorth() {
        Sketchpad sketchpad = new Sketchpad(6,6);
        int[][] floor = sketchpad.getFloor();
        ijapa.penDown();
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(0, floor[0][5]);
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[1][4]);
        assertEquals(1, floor[2][4]);
        assertEquals(1, floor[3][4]);
        assertEquals(1, floor[4][4]);
        assertEquals(0, floor[5][4]);
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[4][4]);
        assertEquals(1, floor[4][3]);
        assertEquals(1, floor[4][2]);
        assertEquals(1, floor[4][1]);
        assertEquals(1, floor[4][0]);
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchpad, 5);
        assertEquals(1, floor[4][0]);
        assertEquals(1, floor[3][0]);
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[0][0]);
        sketchpad.displayFloor();
    }
}