public class StringBufferex{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Saransh");
		System.out.println(sb);
		sb.insert(4 , "Java");
		System.out.println(sb);
		sb.replace(0,2 , "Nah");
		System.out.println(sb);
		sb.delete(1 , 3);
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	}
}
