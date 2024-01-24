package designpattern;

interface Iterator{
	boolean hasNext();
	Object next();
}
interface Container{
	Iterator getIterator();
}
class CollectionOfNames implements Container{
	public String names[]= {"Raj","Riya","Manas","Paras","Meera" ,"Meena"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CollectionNamesIterator();
	}
	private class CollectionNamesIterator implements Iterator{
		int i;
		@Override
		public boolean hasNext() {
//			int i;
			if(i<names.length)
			return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return names[i++];
			}
			return null;
		}
		
	}
}
public class IteratorDesignEx {

	public static void main(String[] args) {
		CollectionOfNames collectionOfNames =new CollectionOfNames();
		for(Iterator iterator=collectionOfNames.getIterator();iterator.hasNext();) {
			String name=(String)iterator.next();
			System.out.println(name);
		}

	}

}
