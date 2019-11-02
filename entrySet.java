import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Map map = new HashMap(); // 创建Map集合
		map.put("1", "Bob"); // 存储元素
		map.put("2", "Lily");
		map.put("3", "Jim");
		System.out.println(map); 
		Set entrySet = map.entrySet(); 
		Iterator it = entrySet.iterator();	//获取Iterator对象
		while (it.hasNext()) {
											//获取集合中键值对映射关系
			Map.Entry entry=(Map.Entry)(it.next());
			Object key = entry.getKey();	//获取Entry中的键
			Object value = entry.getValue(); //获取Entry中的值
			System.out.println(key + ":" + value);
		}
	}
}
