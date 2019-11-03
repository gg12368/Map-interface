import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map集合
		map.put("1", "Bob"); // 存储元素
		map.put("2", "Lily");
		map.put("3", "Jim");
		System.out.println(map); // 获取键的集合
		Set keySet = map.keySet(); // 迭代键的集合
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key); // 获取每个键所对应的值
			System.out.println(key + ":" + value);
		}
	}
}
