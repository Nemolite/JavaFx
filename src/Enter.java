public class Enter {
    public static void main(String[] args){

      try{
        throw new ArrayIndexOutOfBoundsException();
      }
      catch (ArrayIndexOutOfBoundsException e){
          System.out.println(e);
      }
    }
}
