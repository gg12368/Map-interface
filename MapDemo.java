import java.util.HashMap;
import java.util.Map;
/*
 * public V put(K key,V value):把指定的键与指定的值添加到Map集合中
 * 返回值：V
 * 存储键值对的时候，key不重复，返回值V是null
 * 存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
 */
public class Demo {
	public static void main(String[] args) {
	Map<String,String> map=new HashMap<>();

	String v1=map.put("1","hello1");
	System.out.println("v1:"+v1);
	String v2=map.put("1","hello2");
	System.out.println("v2:"+v2);
	
	System.out.println(map);
	}
}
