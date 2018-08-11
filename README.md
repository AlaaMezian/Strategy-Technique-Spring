# Dependency Injection Spring Framework
dependency injection based on user request

[![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet)

normally when we use depedancy injection we want to inject some implmenetation based on some input from the user ,how ever Spring Boot has no way of knowing which one of my implementation classes I want to inject into the controller.

this repository containt an example on how to use dependency injection in a dynamic way ,where a user can  provide some info in the request that will make the application inject a service implementation in run time  based on what the user want and provided in the request

this example demonstrate how we can make a good use of depedancy injection using spring boot framework and the pwoer of spring boot framework ,

we have language service as the following :

```java
public interface LanguageService {

      String greet();
}
```


for example a user want english language thus the english implementation will be the implementation of the language service  interface for this request 

```java
public class EnglishLanguage implements LanguageService {

	@Override
	public String greet() {
		return "Hello World!";
	}

}
```
Please go inside the repository to get the bigger picture :point_right: :v:
