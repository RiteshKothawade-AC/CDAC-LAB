public class Program
{
    public static void main(String[] args)
    {
        Parent objParent = new Parent();
        objParent.parentMethod();

        Child objChild = new Child();
        objChild.childMethod();

        objChild.parentMethod();
    }
}