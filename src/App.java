public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");


        Test test = new Test(25);

        System.out.println(test.getCounter());
        test.setCounter(7);
        System.out.println(test.getCounter());
    }
}
