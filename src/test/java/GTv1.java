package ee.ut.math.tvt.salessystem.logic;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dao.InMemorySalesSystemDAO;
import ee.ut.math.tvt.salessystem.dao.SalesSystemDAO;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class GTv1 {

	@Test(timeout = 4000)
	public void test() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testSubmitCurrentPurchase() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	    Integer integer0 = Integer.getInteger("", (-3196));
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	    shoppingCart0.addItem(soldItem0);
	    soldItem0.setPrice((-1280.0));
	    shoppingCart0.cancelCurrentPurchase();
	    soldItem0.setQuantity(integer0);
	    shoppingCart0.submitCurrentPurchase();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    soldItem0.setId((Long) null);
	    soldItem0.setName("ee.ut.math.tvt.salessystem.logic.ShoppingCart");
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.submitCurrentPurchase();
	    shoppingCart0.submitCurrentPurchase();
	    shoppingCart0.submitCurrentPurchase();
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.cancelCurrentPurchase();
	    soldItem0.setPrice((-1.0));
	    shoppingCart0.getAll();
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.submitCurrentPurchase();
	    shoppingCart0.submitCurrentPurchase();
	    shoppingCart0.cancelCurrentPurchase();
	    shoppingCart0.cancelCurrentPurchase();
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void test0() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertTrue(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItemWithSoldItemWhereGetPriceIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    assertNull(soldItem0.getId());
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testGetAllReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	    Long long0 = new Long((-1L));
	    shoppingCart0.cancelCurrentPurchase();
	    StockItem stockItem0 = new StockItem(long0, " rMph=6@_o$O!,x", (String) null, 3068.0, 1097);
	    stockItem0.setPrice(2375.759915734961);
	    inMemorySalesSystemDAO0.findStockItem(760L);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    stockItem0.setId(long0);
	    soldItem0.setPrice((-199.6651796067));
	    inMemorySalesSystemDAO0.findStockItem((-1L));
	    stockItem0.toString();
	    soldItem0.toString();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    shoppingCart0.addItem((SoldItem) null);
	    List<SoldItem> list0 = shoppingCart0.getAll();
	    assertEquals(1, list0.size());
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    shoppingCart0.cancelCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItemWithSoldItemWhereGetPriceIsZero1() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    shoppingCart0.submitCurrentPurchase();
	}

	@Test(timeout = 4000)
	public void testAddItemWithSoldItemWhereGetPriceIsZero0() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    ShoppingCart shoppingCart0 = new ShoppingCart(inMemorySalesSystemDAO0);
	    SoldItem soldItem0 = new SoldItem();
	    shoppingCart0.addItem(soldItem0);
	    assertNull(soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testSubmitCurrentPurchaseThrowsNullPointerException() throws Throwable {
	    ShoppingCart shoppingCart0 = new ShoppingCart((SalesSystemDAO) null);
	    // Undeclared exception!
	    shoppingCart0.submitCurrentPurchase();
	}

}