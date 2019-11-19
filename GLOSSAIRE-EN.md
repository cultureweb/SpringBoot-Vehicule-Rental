# Glossaire

![](assets/microservices.jpg)

## What are Microservices?

Microservices are an architectural style that develops a single application as a set of small services. Each service runs in its own process. The services communicate with clients, and often each other, using lightweight protocols, often over messaging or HTTP.

## Spring – Dependency injection

**@Autowired :** annotation tells Spring where an injection need to occur. you just have to mark a constructor or method with it.

**@Controller** is used to mark classes as Spring MVC Controller.It 's also used in combination with a **@RequestMapping**

**@RestController** is a convenience annotation that does nothing more than adding the @Controller and @ResponseBody annotations (see: Javadoc).

So the following two controller definitions should do the same

```
@Controller
@ResponseBody
public class MyController { }

@RestController
public class MyRestController { }
```

### model.addAttribute()

Primarily designed for adding attributes to the model

Check this link : [docs.spring.io](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/ui/Model.html) to see all existing methods

model is instantiated by spring and injected to your method, means if any of model attribute matches anything in request i will be filled.

```
model.addAttribute("products", products);
```

"products" is just a name which you can use it in your view get the value with \${products}

[Annotations Cheat Sheet en pdf](https://files.jrebel.com/pdf/zt_spring_annotations_cheat_sheet.pdf)
![](assets/cheatSheet.png)