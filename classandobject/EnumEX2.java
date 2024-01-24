package classandobject;

public class EnumEX2 {
		public enum Month{JANUARY(0),FEBRUARY(1),MARCH(2),APRIL(3),MAY(4),JUNE(5),JULY(6),AUGUST(7),SEPTEMBER(8),OCTOBER(9),NOVEMBER(10),DECENMBER(11);
		private int monthIndex;
	    Month(int index)
		{
			this.setMonthIndex(index);
		}
		
		public int  getMonthIndex()
		{
			return monthIndex;
		}
		public void setMonthIndex(int monthIndex)
		{
			this.monthIndex=monthIndex;
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Month.APRIL);
		System.out.println(Month.APRIL.getMonthIndex());
	}

}
