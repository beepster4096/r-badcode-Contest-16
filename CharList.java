import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("all")
public class CharList implements List{

	public Character[] chars;
	public int amount;

	public CharList(){
		chars = new Character[32];
		amount = 31;
	}

	@Override
	public boolean add(Object arg0){
		chars[Math.abs(amount---31)] = (Character)arg0;
		
		System.out.print("[added char]" + arg0);
		
		return false;
	}
	
	@Override
	public Object[] toArray(){
		System.out.print("[returned array]");
		
		return chars;
	}
	
	@Override
	public Object get(int arg0){
		System.out.print("[returned char]" + chars[arg0]);
		
		return chars[arg0];
	}
	
	//@Override
	public Object flip(){
		
		Object out = new CharList();
		
		System.out.print("{" + amount + "}");
		
		for(int i=amount; 30-i > -1; i++){
			((CharList)out).add(get(30-i));
		}
		
		return out;
	}
	
	/*
	 * unneeded
	 * TODO confirm
	 */

	@Override
	public void add(int arg0, Object arg1){
		// TODO Auto-generated method stub
	}

	@Override
	public boolean addAll(Collection arg0){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection arg1){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear(){
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object arg0){
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty(){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator(){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0){
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator(){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int arg0){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection arg0){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int arg0, Object arg1){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size(){
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List subList(int arg0, int arg1){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0){
		// TODO Auto-generated method stub
		return null;
	}

}
