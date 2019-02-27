
package com.itmayiedu;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @classDesc: 功能描述:(Java集合工具类)
 * @author: 余胜军
 * @createTime: 2017年8月7日 下午9:30:48
 * @version: v1.0
 * @copyright:上海每特教育科技有限公司
 */
public class ListUtils {
	/**
	 * 
	 * @methodDesc: 功能描述:(list 集合分批切割)
	 * @author: 余胜军
	 * @param: @param
	 *             list
	 * @param: @param
	 *             pageSize
	 * @param: @return
	 * @createTime:2017年8月7日 下午9:30:59
	 * @returnType:@param list   切割集合
	 * @returnType:@param pageSize  分页长度
	 * @returnType:@return List<List<T>> 返回分页数据
	 * @copyright:上海每特教育科技有限公司
	 */
	static public <T> List<List<T>> splitList(List<T> list, int pageSize) {
		int listSize = list.size();
		int page = (listSize + (pageSize - 1)) / pageSize;
		List<List<T>> listArray = new ArrayList<List<T>>();
		for (int i = 0; i < page; i++) {
			List<T> subList = new ArrayList<T>();
			for (int j = 0; j < listSize; j++) {
				int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize;
				if (pageIndex == (i + 1)) {
					subList.add(list.get(j));
				}
				if ((j + 1) == ((j + 1) * pageSize)) {
					break;
				}
			}
			listArray.add(subList);
		}
		return listArray;
	}
}
