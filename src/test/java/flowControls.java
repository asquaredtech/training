import core.TestLib;
import org.junit.Test;

/**
 * Created by snamburi on 5/2/2017.
 */
public class flowControls extends TestLib {
    //Variable declaration
    char gender = 'm';
    int cnt;
    int week = 7;
    String weekDay;

    @Test
    public void testFlowControl(){
        //Logging the information
        logger.info("A-squared is offering QA Automation class");
        logger.info("In this batch we have 5 students");
        logger.info("We are learning flow control statements");

        //Learning If statement
        logger.info("Checking IF");
        if(gender == 'm'){
            logger.info("One of the students name is Al Patel");
        } else {
            logger.info("One of the students name is Kiran Patel");
        }

        //Learning If-else statement
        logger.info("Checking IF ELSE");
        gender = 'f';
        if(gender == 'm'){
            logger.info("One of the students name is Al Patel");
        } else {
            logger.info("other students name is Jyothi");
        }

        //Learning for statement
        logger.info("Checking FOR");
        /*
        *   3 things are important for FOR loop
        *       Set the counter : Ex : cnt = 0
        *       Define the condition : Ex : cnt < 5
        *       Increment the counter : Ex : cnt = cnt + 1
        */
        for(cnt = 0; cnt < 5; cnt++){
            logger.info("Inside FOR loop: " + cnt);
        }

        //Learning SWITCH statement
        logger.info("Checking SWITCH");
        switch (week){
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "Yet to find";
                break;
        }
        //string concatenation in logging
        logger.info("Cnt : " + cnt + "; Gender : " + gender + "; Week :  " + week + "; Week day : " + weekDay);
        logger.info("Today is : " + weekDay);
    }
}
