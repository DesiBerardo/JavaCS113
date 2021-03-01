/* modify class die to include 2 other methods: 1. Equals method that compares 2 die objects and returns true if they have
the same face value and false otherwise. 2. a method compareTo that compares 2 die objects. The method returns -1 if the face
value of first die is smaller smaller than 2nd die, 0 equal to, 1 if greater
 */

public class Die
{
    //instance data declaration (instance data)
    private int faceValue;
    private final int MAX=6;

    //default constructor
    public Die(){
        // faceValue=3; //my own default
        roll();
    }
    public Die(int f)
    {
        faceValue = f;
    }
    //method roll
    //method header -> returnType, methodName, parameterList
    public void roll(){
        faceValue=(int)(Math.random()*MAX)+1;
    }
    //getter method
    public int getFaceValue(){
        return faceValue;
    }
    //setter method
    public void setFaceValue(int newFace){
        faceValue=newFace;
    }
    //toString()
    public String toString(){
        return "Die with face value: "+ faceValue;
    }

    public boolean equals(Die other)
    {
        if (faceValue == other.getFaceValue())
            return true;
        else
            return false;
    }

    public int compareTo(Die other)
    {
        if (faceValue < other.getFaceValue())
            return -1;
        else if (faceValue > other.getFaceValue())
            return 1;
        else
            return 0;
    }

}