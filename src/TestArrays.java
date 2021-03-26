public class TestArrays
{
    public static void reverseArray(int[] numArray)
    {
        int temp = 0;
        for (int i = 0; i < numArray.length/2; i++)
        {
            temp = numArray[i];
            numArray[i] = numArray[numArray.length - 1 - i];
            numArray[numArray.length - 1 - i] = temp;
        }
        //for (int i = 0; i < numArray.length; i++)
          //  System.out.print(numArray[i]);
    }
    public  static int[] anotherArrayMethod(int[] numArray)
    {
        int[] temp = new int[numArray.length];

        for (int i = 0; i < temp.length; i++)
            temp[i] = numArray[numArray.length-1-i];
        return temp;
    }

    public static void main(String[] args)
    {
        int[] array = {2,4,7,1,5,9};
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        reverseArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        int[] newArray = anotherArrayMethod(array);
        for (int i: newArray)
            System.out.print(i);
    }
}
