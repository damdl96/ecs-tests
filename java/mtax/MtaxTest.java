package mtax;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import java.util.List;

public class MTaxTest {

  XTax xtax;

  @Before
  public void beforeTest(){
    xtax=new XTax();
    List<xtax> testXtax;
  }

  @Test
  public void testXtaxListTest (){
    boolean boolTest=false;
    for(xtax:testXtax){
      if (xtax.getId!=null){
        boolTest=True;
        break;
      }
    }
    assertEquals(true,boolTest);
  }
}
