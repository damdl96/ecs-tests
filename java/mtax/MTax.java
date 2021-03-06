import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MTax implements Constant {

    public MTax(){

    }

    public void taxListNotEmpty(){
      validIds.add(tax.getId().toString());
    }

    public void amountNull(){
      errorList.add("El importe es obligatorio");
    }

    public void taxNull(){
      errorList.add("El impuesto es obligatorio");
    }

    public void noLocalTaxes(){
      errorList.add("Debe de incluir al menos una tasa no local");
    }

    public void noDataInList(){
      errorList.add("No Existen datos dentro del documento.");
    }

    public void hashMapTax(List<XTax> xt){
      HashMap<String, XTax> map_taxs = new HashMap<String, XTax>();
      for(XTax tax: xt){
          map_taxs.put(tax.getId().toString(), tax);
      }
    }

    public static List<String> validate(List<XTax> xTaxList) {

        List<String> errorList = new ArrayList<>();

//      List<String> taxCategoryList = MInfoTaxCategory.getTaxCategoryStringList();

        if(xTaxList != null && xTaxList.size() > 0) {
            List<String> validIds = new ArrayList<>();
            boolean localTaxExists=false;
            for (XTax tax : xTaxList) {
                if(tax.getId() != null){
                    taxListNotEmpty();
                }
                if(tax.getAmount() == null) {
                    amountNull();
                }

                if(tax.getTax() == null) {
                    taxNull();
                }
//                else if(!taxCategoryList.contains(tax.getTax())) {
//                    errorList.add("El impuesto no es un dato valido");
//                }
                if(tax.isLocal()){
                    localTaxExists=true;
                    if(tax.isTrasladado() && tax.getTaxAmount() == null )
                      amountNull();
                }else if(tax.getTaxAmount() == null){
                  amountNull();
                }
            }
            if(!localTaxExists){
                noLocalTaxes();
            }
            if(validIds.size() > 0){
                    List<XTax> xt = TaxsByListId(validIds, false);
                    if(xt.size() != validIds.size()){
                        noDataInList();
                    }else{
                        hashMapTax(xt);
                        for(int i = 0; i < xTaxList.size(); i++){
                            if(xTaxList.get(i).getId() != null){
                                xTaxList.get(i).setCreated(map_taxs.get(xTaxList.get(i).getId().toString()).getCreated());
                                continue;
                            }
                        }
                    }
            }
        }else {
            noDataInList();
        }

        return errorList;
    }

}
