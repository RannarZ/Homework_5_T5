package ee.ut.math.tvt.salessystem.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class GTv3 {

	@Test(timeout = 4000)
	public void testSaveStockItemWithNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	}

	@Test(timeout = 4000)
	public void test0() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testSaveSoldItemWithSoldItemWhereGetSumIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    StockItem stockItem0 = new StockItem();
	    int int0 = 3083;
	    SoldItem soldItem1 = new SoldItem(stockItem0, 3083);
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
	    stockItem0.toString();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.commitTransaction();
	    inMemorySalesSystemDAO0.beginTransaction();
	    String string0 = "SoldItem{id=%d, name='%s'}";
	    // Undeclared exception!
	    inMemorySalesSystemDAO0.findStockItem(3083);
	}

	@Test(timeout = 4000)
	public void testSaveSoldItemWithSoldItemWhereGetPriceIsZeroAndSoldItemWhereGetSumIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getName());
	    StockItem stockItem0 = new StockItem();
	    int int0 = 3083;
	    SoldItem soldItem1 = new SoldItem(stockItem0, 3083);
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
	    stockItem0.toString();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.commitTransaction();
	    inMemorySalesSystemDAO0.beginTransaction();
	    String string0 = "SoldItem{id=%d, name='%s'}";
	    // Undeclared exception!
	    inMemorySalesSystemDAO0.findStockItem(3083);
	}

	@Test(timeout = 4000)
	public void testFindStockItemThrowsNullPointerException() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    // Undeclared exception!
	    inMemorySalesSystemDAO0.findStockItem(847L);
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.findStockItem((-1L));
	    Long long0 = new Long(1357L);
	    StockItem stockItem0 = new StockItem(long0, "", "", 1357L, 100);
	    stockItem0.setPrice(0.0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    stockItem0.setDescription((String) null);
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	    stockItem0.setPrice(0.0);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testSaveStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.findStockItem(0L);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = Long.valueOf(0L);
	    soldItem0.setId(long0);
	    soldItem0.setPrice((-1.0));
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	}

	@Test(timeout = 4000)
	public void testFindStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    stockItem0.toString();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(1L);
	    stockItem1.setName("StockItem{id=null, name='null'}");
	    stockItem0.setDescription("Hs:b\"tZ(");
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(11.0);
	    soldItem0.setQuantity((Integer) null);
	    Long long0 = new Long(1L);
	    stockItem0.toString();
	    stockItem0.setQuantity(0);
	    stockItem1.setId(long0);
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    stockItem1.setName("StockItem{id=null, name='null'}");
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem1);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	    inMemorySalesSystemDAO0.findStockItem(1L);
	    SoldItem soldItem1 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
	    assertEquals(0.0, soldItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void test() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemWithNegative() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem((-1863L));
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "", "Lays chips", 0L, 0);
	    stockItem0.toString();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = new StockItem(long0, "", "", 0L, 4594);
	    stockItem1.toString();
	    stockItem1.toString();
	    stockItem1.toString();
	    stockItem1.setQuantity(0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem1);
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    inMemorySalesSystemDAO0.rollbackTransaction();
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.commitTransaction();
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.findStockItem(0);
	    inMemorySalesSystemDAO0.findStockItem((-1L));
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertTrue(list0.contains(stockItem0));
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    stockItem0.toString();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(1L);
	    stockItem1.setName("StockItem{id=null, name='null'}");
	    stockItem0.setDescription("Hs:b\"tZ(");
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(11.0);
	    soldItem0.setQuantity((Integer) null);
	    Long long0 = new Long(1L);
	    stockItem0.toString();
	    stockItem0.setQuantity(0);
	    stockItem1.setId(long0);
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    stockItem1.setName("StockItem{id=null, name='null'}");
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem1);
	    inMemorySalesSystemDAO0.beginTransaction();
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	    inMemorySalesSystemDAO0.findStockItem(1L);
	    SoldItem soldItem1 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
	    assertEquals(0.0, soldItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetQuantityIsNegative() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	    Long long0 = new Long(0L);
	    inMemorySalesSystemDAO0.findStockItem((-3517));
	    StockItem stockItem0 = new StockItem(long0, "Sweets", "Sweets", 0L, (-3517));
	    Long long1 = new Long(0L);
	    stockItem0.setId(long1);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    inMemorySalesSystemDAO0.saveStockItem((StockItem) null);
	    inMemorySalesSystemDAO0.rollbackTransaction();
	    inMemorySalesSystemDAO0.findStockItem(0L);
	    inMemorySalesSystemDAO0.saveSoldItem((SoldItem) null);
	    inMemorySalesSystemDAO0.findStockItems();
	    // Undeclared exception!
	    inMemorySalesSystemDAO0.findStockItem((-3517));
	}

	@Test(timeout = 4000)
	public void testSaveSoldItemWithSoldItemWhereGetPriceIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getName());
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsNegative() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long((-1L));
	    StockItem stockItem0 = new StockItem(long0, "Free Beer", "LT22", (-1L), 732);
	    stockItem0.setDescription("ee.ut.math.tvt.salessystem.dataobjects.SoldItem");
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem((-1L));
	    StockItem stockItem2 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem2, 2146163744);
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    stockItem1.toString();
	    stockItem1.setId(long0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem1);
	    SoldItem soldItem1 = new SoldItem();
	    soldItem1.setPrice(0.0);
	    soldItem1.setName("D<dnrnyCnfe$ExZTgE");
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem1);
	    inMemorySalesSystemDAO0.findStockItem(0L);
	    inMemorySalesSystemDAO0.findStockItem(0L);
	    inMemorySalesSystemDAO0.findStockItem(0L);
	    inMemorySalesSystemDAO0.findStockItem(0L);
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.findStockItem((-1L));
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.findStockItem((-1L));
	    inMemorySalesSystemDAO0.findStockItem(129L);
	    inMemorySalesSystemDAO0.findStockItems();
	    inMemorySalesSystemDAO0.findStockItems();
	    StockItem stockItem3 = inMemorySalesSystemDAO0.findStockItem(732);
	    assertNull(stockItem3);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemWithPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(1L);
	    assertEquals(11.0, stockItem0.getPrice(), 0.01);
	    assertEquals("Potato chips", stockItem0.getDescription());
	    assertEquals("Lays chips", stockItem0.getName());
	    assertNotNull(stockItem0);
	    assertEquals(5, stockItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertEquals(4, list0.size());
	}

}