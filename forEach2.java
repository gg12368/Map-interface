import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map集合
		map.put("1", "Bob"); // 存储元素
		map.put("2", "Lily");
		map.put("3", "Jim");
		System.out.println(map); 
		Collection values=map.values();	//获取Map集合中value值集合对象
		//遍历Map集合所有值对象
		values.forEach(v->System.out.println(v));
	}
}
