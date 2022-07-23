type casting and type convesion
  
  type casting: it is a explicit conversion,covert automatically, here the small valued data type is assign to high valued data type,the  memory is not wasted
  program:
  
    class TypeCasting
    {
      public static void main(String args[])
      {
        int a=10;
        floatb=a;
        System.out.println(b);
      }
}

    type conversion: it is a implicit conversion ,it is done by the user, lager valued data type is assign to the smal valued dadt type , memory is wasted
   program : class TypeConversion
             {

               public static void main(Strings args[])
                 {
                    float a =12.3;
                    int b=(int)a;
                     System.out.println(b);
                }
            }