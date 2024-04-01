import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;

public class GTv2 {

	@Test(timeout = 4000)
	public void testSetPriceWithNegative() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice((-3.858238332989277));
	    assertEquals((-3.858238332989277), soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningPositive() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.setName("");
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    stockItem0.setQuantity(0);
	    soldItem0.setName("");
	    assertEquals(0.0, soldItem0.getSum(), 0.01);
	    Integer integer0 = new Integer(214);
	    soldItem0.setQuantity(integer0);
	    soldItem0.getQuantity();
	    soldItem0.setName((String) null);
	    Integer integer1 = new Integer((-1456));
	    stockItem0.setDescription((String) null);
	    soldItem0.setQuantity(integer1);
	    stockItem0.setName((String) null);
	    soldItem0.getPrice();
	    stockItem0.toString();
	    soldItem0.toString();
	    soldItem0.getQuantity();
	    Long long0 = new Long(0L);
	    soldItem0.setId(long0);
	    soldItem0.setName("");
	    soldItem0.getQuantity();
	    soldItem0.setStockItem(stockItem0);
	    soldItem0.setName("");
	    Long.getLong((String) null);
	    soldItem0.setId((Long) null);
	    soldItem0.getId();
	    soldItem0.getStockItem();
	    soldItem0.getId();
	    soldItem0.getStockItem();
	    assertEquals(0.0, soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testFailsToCreateSoldItemThrowsNullPointerException() throws Throwable {
	    SoldItem soldItem0 = new SoldItem((StockItem) null, (-1));
	}

	@Test(timeout = 4000)
	public void testGetPriceAndGetSum() throws Throwable {
	    Long long0 = Long.valueOf(0L);
	    StockItem stockItem0 = new StockItem(long0, "", "", 0L, (-3192));
	    stockItem0.toString();
	    Long long1 = new Long(0L);
	    stockItem0.setId(long1);
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-3192));
	    soldItem0.setPrice((-1102.616568956473));
	    stockItem0.toString();
	    soldItem0.setName("");
	    soldItem0.getSum();
	    soldItem0.setPrice((-3192));
	    soldItem0.getId();
	    stockItem0.setQuantity((-3192));
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    soldItem0.setId((Long) null);
	    soldItem0.getSum();
	    soldItem0.getName();
	    soldItem0.getQuantity();
	    soldItem0.getPrice();
	    soldItem0.setPrice(0.0);
	    assertEquals(0.0, soldItem0.getSum(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningZero() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    stockItem0.toString();
	    stockItem0.setName("");
	    stockItem0.setPrice((-2777.7398));
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    soldItem0.setPrice(0);
	    Long long0 = new Long(0);
	    soldItem0.setId(long0);
	    soldItem0.toString();
	    soldItem0.setPrice(0.0);
	    soldItem0.getSum();
	    soldItem0.setId(long0);
	    soldItem0.setId(long0);
	    soldItem0.getSum();
	    soldItem0.getQuantity();
	    stockItem0.toString();
	    soldItem0.getSum();
	    soldItem0.getName();
	    soldItem0.getId();
	    soldItem0.setName("H>SFTrK{/MWc6(Hx");
	    soldItem0.setPrice((-1.0));
	    soldItem0.getQuantity();
	    soldItem0.setPrice((-2777.7398));
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    assertEquals((-2777.7398), soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void test0() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsPositive() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    assertNull(soldItem0.getId());
	    Long.getLong("/oVS_>/Sz");
	    StockItem stockItem0 = new StockItem((Long) null, "/oVS_>/Sz", "", 2813.7025123747917, 2879);
	    soldItem0.setStockItem(stockItem0);
	    StockItem stockItem1 = new StockItem();
	    stockItem1.toString();
	    soldItem0.toString();
	    stockItem1.setDescription("StockItem{id=%d, name='%s'}");
	    stockItem1.setPrice(1L);
	    Long long0 = new Long(1L);
	    soldItem0.setId(long0);
	    stockItem1.setName((String) null);
	    stockItem1.setQuantity((-847));
	    soldItem0.setStockItem(stockItem1);
	    soldItem0.getStockItem();
	    Long long1 = new Long(1237L);
	    soldItem0.setId(long1);
	    soldItem0.getQuantity();
	    soldItem0.getPrice();
	    soldItem0.setPrice((-1.0));
	    soldItem0.setName("SoldItem{id=null, name='null'}");
	    assertEquals((-1.0), soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void test1() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetNameWithNonEmptyString() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setName("SoldItem{id=%d, name='%s'}");
	    assertNull(soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetPriceIsNegative() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 259);
	    soldItem0.getId();
	    stockItem0.setId((Long) null);
	    stockItem0.setPrice((-634));
	    Integer integer0 = new Integer((-634));
	    soldItem0.setQuantity(integer0);
	    soldItem0.setStockItem(stockItem0);
	    soldItem0.getSum();
	    soldItem0.getSum();
	    assertEquals(-0.0, soldItem0.getSum(), 0.01);
	    soldItem0.setQuantity((Integer) null);
	    soldItem0.setName("S9_NP");
	    soldItem0.getStockItem();
	    Integer integer1 = new Integer(259);
	    soldItem0.setQuantity(integer1);
	    soldItem0.setStockItem(stockItem0);
	    soldItem0.toString();
	    soldItem0.getId();
	    soldItem0.toString();
	    soldItem0.getStockItem();
	    soldItem0.toString();
	    double double0 = soldItem0.getSum();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetQuantityIsNegative() throws Throwable {
	    Long long0 = new Long(1L);
	    StockItem stockItem0 = new StockItem(long0, "", "F3%zXJo}I?5", 0.0, (-1765));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1765));
	    soldItem0.getStockItem();
	    assertEquals((-1765), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void test() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=null, name='null'}", string0);
	}

	@Test(timeout = 4000)
	public void testSetPrice() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    soldItem0.getQuantity();
	    soldItem0.getName();
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setName("zD");
	    Long long0 = new Long(0);
	    stockItem0.setId(long0);
	    Long long1 = new Long(0);
	    stockItem0.setPrice(0.0);
	    Long long2 = new Long(0);
	    soldItem0.setId(long2);
	    stockItem0.setId(long1);
	    SoldItem soldItem1 = new SoldItem(stockItem0, 0);
	    soldItem1.getId();
	    soldItem0.setId((Long) null);
	    soldItem1.setPrice(1075.1983200452);
	    assertEquals(1075.1983200452, soldItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetSumThrowsNullPointerException() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    // Undeclared exception!
	    soldItem0.getSum();
	}

	@Test(timeout = 4000)
	public void testSetQuantityWithNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setQuantity((Integer) null);
	    assertNull(soldItem0.getName());
	}

	@Test(timeout = 4000)
	public void testSetStockItemWithStockItemWhereGetPriceIsZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setStockItem(stockItem0);
	    assertNull(soldItem0.getName());
	}

	@Test(timeout = 4000)
	public void testSetIdWithNegative() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = new Long((-90L));
	    soldItem0.setId(long0);
	    assertEquals(0.0, soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetQuantityReturningNull() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    soldItem0.setPrice(1126.1105331418);
	    soldItem0.getQuantity();
	    soldItem0.setName("ee.ut.math.tvt.salessystem.dataobjects.SoldItem");
	    soldItem0.setPrice((-2211.99));
	    soldItem0.toString();
	    soldItem0.getQuantity();
	    Long long0 = Long.getLong("SoldItem{id=null, name='ee.ut.math.tvt.salessystem.dataobjects.SoldItem'}", 0L);
	    soldItem0.setId(long0);
	    soldItem0.getName();
	    soldItem0.setName("SoldItem{id=%d, name='%s'}");
	    Long long1 = new Long(0L);
	    Long long2 = Long.getLong("ee.ut.math.tvt.salessystem.dataobjects.SoldItem", long1);
	    StockItem stockItem0 = new StockItem(long2, ">IZXe'(@uS}4dj!%D", "", 0L, 2427);
	    stockItem0.toString();
	    soldItem0.setStockItem(stockItem0);
	    soldItem0.setId(long1);
	    soldItem0.setStockItem((StockItem) null);
	    Integer integer0 = new Integer(958);
	    soldItem0.setQuantity(integer0);
	    soldItem0.setQuantity(integer0);
	    soldItem0.getQuantity();
	    soldItem0.getQuantity();
	    soldItem0.getQuantity();
	    assertEquals((-2211.99), soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void test4() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1121));
	    assertEquals((-1121), (int) soldItem0.getQuantity());
	}

	@Test(timeout = 4000)
	public void testGetNameReturningNonEmptyString() throws Throwable {
	    StockItem stockItem0 = new StockItem();
	    Long long0 = new Long((-2339L));
	    stockItem0.setId(long0);
	    stockItem0.toString();
	    SoldItem soldItem0 = new SoldItem(stockItem0, 499);
	    soldItem0.setName("ee.ut.math.tvt.salessystem.dataobjects.StockItem");
	    soldItem0.setPrice(499);
	    soldItem0.getQuantity();
	    stockItem0.toString();
	    Long long1 = new Long(1L);
	    Long long2 = Long.getLong("w+p/_|, Y]^>$d9>>", long1);
	    soldItem0.setId(long2);
	    soldItem0.getName();
	    soldItem0.setName("StockItem{id=%d, name='%s'}");
	    soldItem0.getId();
	    soldItem0.getPrice();
	    soldItem0.getSum();
	    soldItem0.setName("y{2'lBv,TM6?'O)");
	    assertEquals(249001.0, soldItem0.getSum(), 0.01);
	}

	@Test(timeout = 4000)
	public void test5() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Long long0 = soldItem0.getId();
	    assertNull(long0);
	}

	@Test(timeout = 4000)
	public void test2() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = soldItem0.getStockItem();
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void test3() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = soldItem0.getQuantity();
	    assertNull(integer0);
	}

	@Test(timeout = 4000)
	public void testToString() throws Throwable {
	    Long long0 = new Long(405L);
	    StockItem stockItem0 = new StockItem(long0, "ee.ut.math.tvt.salessystem.dataobjects.StockItem", "ee.ut.math.tvt.salessystem.dataobjects.StockItem", 405L, 0);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 0);
	    soldItem0.toString();
	    Long long1 = new Long(405L);
	    soldItem0.setId(long1);
	    assertEquals(0.0, soldItem0.getSum(), 0.01);
	    Integer integer0 = new Integer(0);
	    soldItem0.setQuantity(integer0);
	    soldItem0.getId();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=405, name='ee.ut.math.tvt.salessystem.dataobjects.StockItem'}", string0);
	    double double0 = soldItem0.getPrice();
	    assertEquals(405.0, double0, 0.01);
	    soldItem0.getQuantity();
	    assertEquals(405.0, soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testSetStockItemWithStockItemWhereGetPriceIsZeroAndStockItemWhereGetQuantityIsZero() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    StockItem stockItem0 = new StockItem();
	    soldItem0.setStockItem(stockItem0);
	    assertNull(soldItem0.getName());
	}

	@Test(timeout = 4000)
	public void testGetStockItem() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    Integer integer0 = new Integer(1731);
	    soldItem0.setQuantity(integer0);
	    Long long0 = new Long(3835L);
	    soldItem0.setId(long0);
	    soldItem0.getStockItem();
	    soldItem0.setId(long0);
	    assertEquals(0.0, soldItem0.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetIdReturningNegative() throws Throwable {
	    Long long0 = new Long((-1L));
	    StockItem stockItem0 = new StockItem(long0, "Jg?1.`vZ+h<DQgil4tx", "!YEky\"", (-1L), 1183);
	    SoldItem soldItem0 = new SoldItem(stockItem0, 1183);
	    soldItem0.setId(long0);
	    soldItem0.setId(long0);
	    soldItem0.toString();
	    soldItem0.setStockItem(stockItem0);
	    soldItem0.getPrice();
	    soldItem0.getName();
	    soldItem0.setPrice((-2190.597));
	    soldItem0.setPrice((-2190.597));
	    stockItem0.setQuantity(1183);
	    soldItem0.setName("R)l~32v++?/&Y");
	    soldItem0.getId();
	    assertEquals((-2591476.251), soldItem0.getSum(), 0.01);
	}

	@Test(timeout = 4000)
	public void test6() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    String string0 = soldItem0.getName();
	    assertNull(string0);
	}

	@Test(timeout = 4000)
	public void test7() throws Throwable {
	    SoldItem soldItem0 = new SoldItem();
	    assertNull(soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testFailsToCreateSoldItemTaking2ArgumentsThrowsNullPointerException() throws Throwable {
	    SoldItem soldItem0 = new SoldItem((StockItem) null, (-1));
	}

	@Test(timeout = 4000)
	public void testGetStockItemReturningStockItemWhereGetQuantityIsPositive() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "SoldItem{id=%d, name='%s'}", "PGDgj`K~|UFlEy3<", 0.0, 3711);
	    stockItem0.setDescription("PGDgj`K~|UFlEy3<");
	    SoldItem soldItem0 = new SoldItem(stockItem0, 3711);
	    Long long1 = new Long(3711);
	    soldItem0.setId(long1);
	    soldItem0.getId();
	    String string0 = soldItem0.toString();
	    assertEquals("SoldItem{id=3711, name='SoldItem{id=%d, name='%s'}'}", string0);
	    StockItem stockItem1 = soldItem0.getStockItem();
	    Long long2 = new Long((-4107L));
	    stockItem0.setId(long2);
	    stockItem1.setName("FeY|pkD");
	    stockItem0.setName((String) null);
	    stockItem1.setQuantity(0);
	    Integer integer0 = soldItem0.getQuantity();
	    assertEquals(3711, (int) integer0);
	    soldItem0.setStockItem(stockItem0);
	    stockItem0.setDescription("|$Ad");
	    stockItem0.setName("PGDgj`K~|UFlEy3<");
	    soldItem0.setStockItem(stockItem1);
	    soldItem0.setName("ee.ut.math.tvt.salessystem.dataobjects.SoldItem");
	    soldItem0.getName();
	    soldItem0.getId();
	    Long long3 = new Long(0L);
	    soldItem0.setId(long3);
	    Long long4 = new Long(3711);
	    soldItem0.setId(long4);
	    double double0 = soldItem0.getPrice();
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testGetSumReturningNegative() throws Throwable {
	    Long long0 = new Long(1L);
	    StockItem stockItem0 = new StockItem(long0, (String) null, "", 1L, (-3927));
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-1599));
	    soldItem0.setName("L)");
	    Long long1 = new Long((-1L));
	    Long long2 = new Long((-3927));
	    Long.getLong((String) null, long2);
	    Long long3 = new Long((-617L));
	    StockItem stockItem1 = new StockItem(long3, "", ">IZXe'(@uS}4dj!%D", 2427, (-299));
	    StockItem stockItem2 = new StockItem();
	    soldItem0.getStockItem();
	    soldItem0.getSum();
	    double double0 = soldItem0.getSum();
	    assertEquals((-1599.0), double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetStockItem() throws Throwable {
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "L]3Ms(X3EPN=6O>", "", 0L, (-4115));
	    stockItem0.setName("");
	    SoldItem soldItem0 = new SoldItem(stockItem0, (-4115));
	    StockItem stockItem1 = new StockItem();
	    soldItem0.setStockItem(stockItem1);
	    soldItem0.getStockItem();
	    assertEquals((-4115), (int) soldItem0.getQuantity());
	}

}