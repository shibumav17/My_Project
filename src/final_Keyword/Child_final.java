package final_Keyword;


//we can not extend a final class
public class Child_final extends Demo_final_keyword{

    //we can not override final methods
    @Override
    public void m1(){
        System.out.println("This is m1");
    }
}
