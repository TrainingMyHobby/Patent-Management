package patentapp.common.utils;

import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AppApplnCtxAware implements ApplicationContextAware {

	private ApplicationContext applnCtx;

	@Override
	public void setApplicationContext(ApplicationContext applnCtx) throws BeansException {
		this.applnCtx = applnCtx;
	}

	public <T> Map<String, T> getBeansOfType(Class<T> classObj) {
		return this.applnCtx.getBeansOfType(classObj);
	}

}
