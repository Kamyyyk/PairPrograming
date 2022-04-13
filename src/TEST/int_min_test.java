package TEST;
import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class int_min_test {

    @Test
    public void int_min_Test(){
        //given
        int higher_number = 7;
        int lower_number = 5;
        //when
        int result = Main.int_min(higher_number,lower_number);
        //then
        Assertions.assertEquals(lower_number,result);
    }
}
