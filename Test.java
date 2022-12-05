import java.util.Properties;

class Test
{
     void systemProperties()
    {
        System.out.println("printing sysytem properties using java program");
        Properties props=System.getProperties();
        System.out.println(props);
    }

    public static void main(String args[])
    {
        System.out.println("Java program strated");   
        Test test=new Test();
        test.systemProperties();
    }
}