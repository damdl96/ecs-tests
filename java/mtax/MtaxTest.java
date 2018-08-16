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
  public void testTestXtaxList (){
    boolean boolTest=false;
    for(xtax:testXtax){
      if (xtax.getId()!=null){
        boolTest=true;
        break;
      }
    }
    assertTrue("La lista esta vacia.", boolTest);
  }

  @Test
  public void testNullId(){
    for(xtax:testXtax){
      assertNotNull("No deben de existir Id's Nulos." xtax.getId());
    }
  }

  @Test
  public void testNullLocal (){
    boolean boolTest=false;
    for(xtax:testXtax){
      if (xtax.islocal()!=null){
        boolTest=true;
        break;
      }
    }
    assertTrue("Debe existir al menos una tasa local.", boolTest);
  }

  @Test
  public void testNullTaxAmmount(){
    for(xtax:testXtax){
      assertNotNull("No debe de haber un monto de cuota vacio." xtax.getTaxAmount());
    }
  }

  @Test
  public void testNullTraslado(){
    for(xtax:testXtax){
      assertNotNull("No puede existir un traslado vacio." xtax.isTrasladado());
    }
  }

  @Test
  public void testNullAmount(){
    for(xtax:testXtax){
      assertNotNull("No puede haber un monto vacio." xtax.getAmount());
    }
  }


}
