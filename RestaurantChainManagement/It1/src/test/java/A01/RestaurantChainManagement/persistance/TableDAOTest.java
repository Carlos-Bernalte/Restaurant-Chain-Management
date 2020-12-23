package A01.RestaurantChainManagement.persistance;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import A01.RestaurantChainManagement.domain.Table;
import A01.RestaurantChainManagement.domain.Transaction;

public class TableDAOTest {
    TableDAO tDAO;
    
    @Before
    public void init() {
        tDAO= new TableDAO();
    }
    @Test
    public void readTest() {
    	Table t = new Table(1);
    	tDAO.read(t);
    	if((t.getChairs() != 0)&&(t.getState() != -1))
        	assertTrue(true);
        else
        	fail();
    }
    
    @Test
    public void setGetReadAllTransactionListTest() {
        tDAO.readAll();
        TableDAO tDAO2 = new TableDAO();
        Vector<Table> tL = new Vector<Table>();
        tDAO2.setTableList(tDAO.getTableList());
        if((tDAO2.getTableList() == tDAO.getTableList()) && tDAO.getTableList().getClass().getName() == tL.getClass().getName())
        	assertTrue(true);
        else
        	fail();
    }
    @Test
    public void updateTest() {
    	Table t = new Table(1);
    	tDAO.read(t);
    	assertEquals(1, t.update());
    }
    

}
