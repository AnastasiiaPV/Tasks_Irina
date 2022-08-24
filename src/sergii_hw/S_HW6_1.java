package sergii_hw;

public class S_HW6_1 {

    /******************************************************************************************************************
     *  1) https://www.codewars.com/kata/playing-with-cubes-i/train/java
    Playing with cubes I
    Create a public class called Cube without a constructor which gets one single private integer variable Side,
    a getter GetSide() and a setter SetSide(int num) method for this property.
    Notes:
    There's no need to check for negative values!
    initialise the side to 0.
     */
    public class Cube{
        private int side;

        public int getSide(){
            return this.side;
        }

        public void setSide(int num){
            this.side = num;
        }
    }

    /***************************************************************************************************************
     *     2) https://www.codewars.com/kata/building-blocks/train/java
     *     //Building blocks
     Write a class Block that creates a block (Duh..)

            ##Requirements

    The constructor should take an array as an argument, this will contain 3 integers of the form
     [width, length, height] from which the Block should be created.

    Define these methods:
            `getWidth()` return the width of the `Block`
            `getLength()` return the length of the `Block`
            `getHeight()` return the height of the `Block`
            `getVolume()` return the volume of the `Block`
            `getSurfaceArea()` return the surface area of the `Block`
     */
    public class Block{
        private int width;
        private int length;
        private int height;

        public Block(int[] block){
            this.width = block[0];
            this.length = block[1];
            this.height = block[2];
        }

        public int getWidth(){
            return this.width;
        }

        public int getLength(){
            return this.length;
        }

        public int getHeight(){
            return this.height;
        }

        public int getVolume(){
            return getWidth() * getLength() * getHeight();
        }

        public int getSurfaceArea(){
            return 2*getWidth()*getLength() + 2*getLength()*getHeight() + 2*getHeight()*getWidth();
        }
    }
}
