
/**
 * Write a description of class CollageLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollageLab
{
    public static void collageLab()
    {
        Picture canvas = new Picture(600, 800);
        canvas.removeWhite();
        Picture alchemy1 = new Picture("alchemy circle.jpg");
        alchemy1.explore();
        alchemy1.scaleByHalf(alchemy1);
        Picture alchemy2 = new Picture(alchemy1);
        Picture alchemy3 = new Picture(alchemy1);
        Picture alchemy4 = new Picture(alchemy1);
        alchemy2.zeroBlue();
        alchemy3.keepBlue();
        alchemy4.negate();
        alchemy4.removeWhite();
        alchemy3.mirrorHorizontal();
        alchemy4.mirrorHorizontal();
        canvas.copyPicture(alchemy1, 0, 293, 0, 367, 5, 5);
        canvas.copyPicture(alchemy2, 0, 293, 0, 367, 5, 427);
        canvas.copyPicture(alchemy3, 293, 587, 0, 367, 301, 5);
        canvas.copyPicture(alchemy4, 293, 587, 0, 367, 301, 427);
        canvas.explore();
        Picture negativeCanvas = new Picture(canvas);
        negativeCanvas.negate();
        negativeCanvas.explore();
    }
}
