package com.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.service.ArabicLanguage;
import com.service.EnglishLanguage;
import com.service.LanguageService;
import com.service.SpanishLanguage;

@Configuration
public class LanguageServiceConfig {
	// configuration class is responsible for instantiating the services now this class will inject and provide beans based on the request

	@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.INTERFACES)
	public LanguageService getLanguageService() {
		HttpServletRequest currrentRequest = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		String langName = currrentRequest.getHeader("lang");
		if (langName != null) {
			if (langName.equals("en"))
				return new EnglishLanguage();

			if (langName.equals("ar"))
				return new ArabicLanguage();
		}
		// Spanish language is the default for this application
		return new SpanishLanguage();
	}

}
