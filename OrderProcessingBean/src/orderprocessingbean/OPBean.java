package orderprocessingbean;

import javax.ejb.Stateless;
import remotelib.IRemoteOP;
import oplib.Order;
import java.util.List;

@Stateless(name = "OPEJB")
public class OPBean implements IRemoteOP {

    private Order mdb;

    public OPBean() {
        mdb = new Order("ism6236","ism6236bo");
    }

    @Override
    public int Purchase(String cid, List<String> od) {
        return mdb.Purchase(cid, od);
    }

    @Override
    public List<String> getOrderDetails(String oid)  {
        return mdb.getOrderDetails(oid);
    }

    @Override
    public List<String> getCustomerOrders(String id)  {
        return mdb.getCustomerOrders(id);
    }

    @Override
    public String getCustomer(String id)  {
        return mdb.getCustomer(id);
    }

    @Override
    public List<String> getProductIds()  {
        return mdb.getProductIds();
    }

    @Override
    public String getProductDetail(String id) {
        return mdb.getProductDetail(id);
    }

}
