package com.ykyclm.wtfb;

import org.springframework.mock.web.MockServletContext;

public @interface SpringApplicationConfiguration {

	Class<MockServletContext> classes();

}
