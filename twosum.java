class twosum {
    public int countOperations(int num1, int num2) 
    {
        int count=0;
        while(true)
        {
            if(num1==0 || num2==0)
            {
                break;
            }
            else
            {
                if(num1>num2)
                {
                    num1=num1-num2;
                }
                else
                {
                    num2=num2-num1;
                }
            }
        count++;
        }
        return count;
    }
    public static void main(String arg[])
    {
        twosum o = new twosum();
        int a=o.countOperations(2,3);
        System.out.println("Count Operation : "+a);
    }
}