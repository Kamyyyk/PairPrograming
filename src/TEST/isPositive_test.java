package TEST;
import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isPositive_test {

    @Test
    public void isPositive_Test_True(){
        //given
        int number = 7;
        //when
        //boolean result = isPositive(number);
        //then
        //Assertions.assertEquals(true,result);
    }

    @Test
    public void isPositive_Test_False(){
        //given
        int number = -57;
        //when
        //boolean result = isPositive(number);
        //then
        //Assertions.assertEquals(false,result);
    }
}
