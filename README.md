# takeoff-spring-boot-starter

## Introduce
takeoff-spring-boot-starter is a simple starter to wrap String with prefix and suffix


## How to use

- maven dependency 

```xml
        <dependency>
            <groupId>com.bad.evil</groupId>
            <artifactId>takeoff-spring-boot-starter</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
```

- application.properties
```properties
takeoff.service.enabled=true
examtakeoffple.service.prefix=hello
takeoff.service.suffix=world
```

- or application.yml
```yml
takeoff:
  service:
    enabled: true
    prefix: hello
    suffix: world
```

- controller

```
@RestController
public class TestController {

    @Autowired
    private TakeoffService takeoffService;

    @GetMapping("/input")
    public String input(String word){
        return takeoffService.wrap(word);
    }


}
```
so when you curl http://localhost:8080/input?word=Charles,you can get String helloCharlesworld