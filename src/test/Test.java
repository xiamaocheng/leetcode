package test;

import com.company.LRUCache;

public class Test {
//    作者：啦啦啦啦
//    链接：https://www.zhihu.com/question/484415220/answer/2402191875
//    来源：知乎
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public static void main(String[] args) {
        // 创建一个大小为2的缓存
        int cacheCapacity = 2;
        LRUCache cache = new LRUCache(cacheCapacity);
        System.out.println("Initial state of cache");
        System.out.println("Cache capacity: " + cacheCapacity);
        cache.printCacheState();

        int[] keys = {10, 10, 15, 20, 15, 25, 5};
        String[] values = {"20", "get", "25", "40", "get", "85", "5"};
        for (int i = 0; i < keys.length; i++) {
            if (values[i].equals("get")) {
                System.out.println("Getting by Key: " + keys[i]);
                System.out.println("Cached value returned: " + (cache.get(keys[i])));
            } else {
                System.out.println("Setting cache: Key: " + keys[i] + ", Value: " + values[i]);
                cache.set(keys[i], Integer.parseInt(values[i]));
            }
            cache.printCacheState();
        }
    }
}
