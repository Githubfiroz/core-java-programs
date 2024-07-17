package codingtest.buysell.stocks;

public class DemoBuyNSellStocks {

	public static void main(String[] args) {
		int prices[] = {3,5,2,1 };
		//int prices[] = { 7, 1, 5, 3, 6, 4 };
		//int prices[] = { 2, 7, 1, 5, 3, 16, 4 };
		//int prices[] = { 12, 7, 11, 5, 13, 6, 4 };

		DemoBuyNSellStocks dbs = new DemoBuyNSellStocks();
		dbs.buySellStockint(prices);

		// dbs.getMinPrice(prices);
		// dbs.getMaxPrice(prices);
	}

	public int buySellStockint(int[] prices) {
		int minPriceSoFor = prices[0];
		int calculateProfitSoFor = 0;

		for (int i = 1; i < prices.length; i++) {
			calculateProfitSoFor = Math.max(calculateProfitSoFor, prices[i] - minPriceSoFor);
			minPriceSoFor = Math.min(minPriceSoFor, prices[i]);
		}
		System.out.println(calculateProfitSoFor + "<<calculateProfitSoFor - Min price>>" + minPriceSoFor);
		return calculateProfitSoFor;
	}

	public int getMinPrice(int[] prices) {
		int minPrice = prices[0];
		int buyDayCount = 1;
		int buyStockDay = 1;

		for (int i : prices) {

			if (minPrice > i) {
				minPrice = i;
				buyStockDay = buyDayCount;
			}
			// System.out.println("i)" + i+ " <minPrice> "+minPrice+" <buyDayCount>
			// "+buyDayCount+" <buyStockDay> "+buyStockDay);
			buyDayCount++;
		}
		System.out.println(buyStockDay + " Buy Stock on this day minPrice->" + minPrice);

		return minPrice;
	}

	public int getMaxPrice(int[] prices) {
		int maxPrice = prices[0];
		int sellDayCount = 1;
		int sellStockDay = 1;

		for (int i : prices) {

			if (maxPrice < i) {
				maxPrice = i;
				sellStockDay = sellDayCount;

			} // System.out.println("i)" + i+ " <maxPrice> "+maxPrice+" <sellDayCount>
				// "+sellDayCount+" <sellStockDay> "+sellStockDay);

			sellDayCount++;

		}
		System.out.println(sellStockDay + " Sell Stock on this day maxPrice->" + maxPrice);
		return maxPrice;
	}
}