package org.springframework.zero.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.zero.parse.ZeroBeanDefinitionParser;

public class ZeroNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new ZeroBeanDefinitionParser());
	}
}
