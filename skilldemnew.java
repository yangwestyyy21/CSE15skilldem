public class skilldemnew{
    public static String testMethod(String input){
        return "Output is "+input;
    }
}
/**
 * make lib folder with downloaded junit
 * ssh cs15lwi22apc@ieng6.ucsd.edu    
 * git clone *folder I made name
 * cd CSE15skilldem
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar skilltest
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore skilltest
 * make change so tester is right and git push
 * git pull
 * run the tests again on ssh
 */
