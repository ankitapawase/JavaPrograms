package classandobject;

public class DempEnum {
	public enum Day{MONDAY(0),TUE(1),WED(2),THUS(3),FRI(4),SAT(5),SUNDAY(6);
		private int dayIndex;
		Day(int index)
		{
			this.setDayIndex(index);
		}
		public int getDayIndex() {
			return dayIndex;
		}
		public void setDayIndex(int dayIndex) {
			this.dayIndex = dayIndex;
		}
		}
	/*public int getDayIndex()
	{
		return dayIndex;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Day.SAT);
		System.out.println(Day.SAT.getDayIndex());
	}

}
