public class TernaryOperators
{
    public static void main(String[] args) 
    {
        int num1 = 2;
        int num2 = 3;
        
        //If num1 is greater thana num2 than the value of num1 is assigned to biggestNum,
        //if it's less than the value of num2 is assignedto biggestNum
        int biggestNum = (num1 > num2) ? num1 : num2;
        
        System.out.println(biggestNum);
    }
}