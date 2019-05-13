
package TestService;

import org.apache.commons.lang.StringUtils;

import com.itmayiedu.service.TestService;

public class TestServiceImpl implements TestService {

	public void test(String str) {
		if (StringUtils.isEmpty(str)) {
        System.out.println("this is str");
		}
	}

}
