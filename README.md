# Strategy Techniqu Spring Framework 

provide prpoer implementation based on user request 


this repository containt an example on how to use strategy in a dynamic way ,where a user can  provide some info in the request that will make the application choose/provide a service implementation in run time  based on what the user want and provided in the request

this example demonstrate how we can make a good use of some hidden spring boot framework features and the pwoer of spring boot framework ,

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
and for another language such as arabic the following implementation 

```java
public class ArabicLanguage implements LanguageService{

	@Override
	public String greet() {
		return "اهلا بالعالم!";
	}

}
```
so each time i provide in the header a different param , the application will inject the proper implementation based on that param .

Please go inside the repository to get the bigger picture :point_right: :v:

[![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet)

