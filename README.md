# Introduction #

1. JAXB 作为JDK的一部分，能便捷地将Java对象与XML进行相互转换。
2. 一般地，我们将Java对象转换为XML的过程称之为Marshal，将XML转换为Java对象的过程称之为UnMarshal。 
3. 示例中包含所有演示的完整代码，为了能更方便地运行案例，我将重要代码放在了 `src/test/java` 目录下。
4. 每一个章节有独立的 `lessonN` 包与之对应，可以在 `src/main/java` 和 `src/test/java` 下找到相关代码。

# Feature #

主要从以下部分讲述JAXB:

 - JAXB 前世今生
 - JAXB 注解
 - JAXB xjc
 - JAXB Marshal
 - JAXB UnMarshal
 - JAXB 与 Spring-boot

# Installation #

项目使用到如下工具、软件：

 - JDK8
 - Eclipse 4.7
 
相关版本：

 - Spring boot 2.0.4.RELEASE
 - JAXB 2.2.8

# Resources #

### JAXB 深入显出 系列博客

> 项目的所有代码是配套 JAXB 深入显出 系列博客 而产生的。该博客专栏是对JAXB整个技术体系有较为详细的讲述，从不同角度讲解JAXB的使用案例。在讲解过程中，参考了国内外众多的文档与博客内容，力求简单明了地向大家展示一个常见而不常用的技术。

1 [JAXB 教程 目录](https://blog.csdn.net/jiangchao858/article/details/81842774)

2 [JAXB 教程 导读](https://blog.csdn.net/jiangchao858/article/details/81843478)

3 [JAXB 教程 简单转化案例](https://blog.csdn.net/jiangchao858/article/details/81878917)

4 [JAXB 教程 注解](https://blog.csdn.net/jiangchao858/article/details/81951643)

5 [JAXB 教程 利用 Trang 将XML转化为 schema 文件](https://blog.csdn.net/jiangchao858/article/details/82081831)

6 [JAXB 教程 利用 xjc 将schema 文件转化为 Java bean](https://blog.csdn.net/jiangchao858/article/details/82085109)

7 [JAXB 教程 解读 JAXBContext](https://blog.csdn.net/jiangchao858/article/details/82355672)

8 [JAXB 教程 简单XML生成 Marshaller详解 - 属性](https://blog.csdn.net/jiangchao858/article/details/82432508)

9 [JAXB 教程 简单XML生成 Marshaller数据源](https://blog.csdn.net/jiangchao858/article/details/82778663)

10 [JAXB 教程 简单XML生成](https://blog.csdn.net/jiangchao858/article/details/82795134)

11 [JAXB 教程 复杂XML生成](https://blog.csdn.net/jiangchao858/article/details/82818240)

12 [JAXB 教程 动态复杂XML生成](https://blog.csdn.net/jiangchao858/article/details/82941043)

13 [JAXB 教程 List转化为XML](https://blog.csdn.net/jiangchao858/article/details/83477727)

14 [JAXB 教程 Map 转化为XML](https://blog.csdn.net/jiangchao858/article/details/84000603)

15 [JAXB 教程 XML转Java对象初探（Unmarshaller）](https://blog.csdn.net/jiangchao858/article/details/84667959)

16 [JAXB 深入显出 - JAXB 教程 XML转Java对象深入（Unmarshaller）](https://blog.csdn.net/jiangchao858/article/details/84668004)

17 [JAXB 深入显出 - JAXB 教程 JAXB与JSON](https://blog.csdn.net/jiangchao858/article/details/84728948)
    