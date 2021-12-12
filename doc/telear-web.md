## 在整合多模块项目的时候，启动项目报错

## 解决SpringBoot项目repackage failed: Unable to find main class Maven打包问题

这个要把除了web项目里面的打包插件删除

```
<build>

<plugins>

<plugin>

<groupId>org.springframework.boot</groupId>

<artifactId>spring-boot-maven-plugin</artifactId>

</plugin>

</plugins>

</build>
```

## 问题表现：

> Failed to execute goal on project eSite-message: Could not resolve dependencies for project site.huzy:eSite-message:jar:0.0.1-SNAPSHOT: Failed to collect dependencies at site.huzy:eSite-common:jar:0.0.1-SNAPSHOT: Failed to read artifact descriptor for site.huzy:eSite-common:jar:0.0.1-SNAPSHOT: Could not find artifact site.huzy:eSite-parent:pom:0.0.1-SNAPSHOT -> [Help 1]

## 问题解决

[解决方案](https://blog.csdn.net/DamonREN/article/details/85091900)



