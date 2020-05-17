package remotelib;
import javax.ejb.Remote;
import java.util.List;

@Remote
public interface IRemoteOP {
    int Purchase(String cid, List<String> od);
    public List<String> getOrderDetails(String oid);
    public List<String> getCustomerOrders(String id);
    public String getCustomer(String id) ;
    public List<String> getProductIds() ;
    public String getProductDetail(String id);

}
