import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map集合
		map.put("1", "Bob"); // 存储元素
		map.put("2", "Lily");
		map.put("3", "Jim");
		System.out.println(map); 
		//使用forEach(BiConsumer action)方法遍历Map集合
		map.forEach((key,value)->System.out.println(key+":"+value));
	}
}
