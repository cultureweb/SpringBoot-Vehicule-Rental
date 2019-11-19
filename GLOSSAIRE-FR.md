# Glossaire

![](assets/microservices.jpg)

## C'est quoi les Microservices?

Les microservices sont un style architectural qui développe une application unique sous la forme d'un ensemble de petits services. Chaque service s'exécute dans son propre processus. Les services communiquent avec les clients, et souvent entre eux, à l'aide de protocoles légers, souvent par messagerie ou HTTP.

## Spring – @ Annotations

**@Autowired :** L'annotation indique à Spring où une injection doit avoir lieu. il suffit juste d’annoter un constructeur ou une méthode avec cette dernière.

**@Controller :** les contrôleurs classiques peuvent être annotés avec cette annotation, elle est généralement utilisé en combinaison avec une annotation **@ RequestMapping.**

**@RestController** est une annotation pratique qui ne fait rien d’ajouter que l’ajout des annotations

### model.addAttribute()

Principalement conçu pour ajouter des attributs au modèle.

Aller sur ce lien : [docs.spring.io](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/ui/Model.html) pour connaître toutes les methodes

Le modèle est instancié par Spring et injecté dans votre méthode. Cela signifie que si l'un des attributs du modèle correspond à quoi que ce soit dans la demande, ça le remplira.

[Annotations Cheat Sheet en pdf](https://files.jrebel.com/pdf/zt_spring_annotations_cheat_sheet.pdf)
![](assets/cheatSheet.png)