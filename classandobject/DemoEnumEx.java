package classandobject;

public class DemoEnumEx {
	public enum season{SPRING(0),SUMMER(1),FALL(2),WINTER(3);
		private int seasonIndex;
		season(int index)
		{
			this.setSeasonIndex(index);
		}
		public void setSeasonIndex(int seasonIndex)
		{
			this.seasonIndex=seasonIndex;
		}
		public int getSeasonIndex()
		{
			return seasonIndex;
		}
	}
	public static void main(String[] args) {
		System.out.println(season.SUMMER);
		System.out.println(season.SUMMER.getSeasonIndex());
	}

}
